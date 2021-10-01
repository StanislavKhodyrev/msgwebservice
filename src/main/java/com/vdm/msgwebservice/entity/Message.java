package com.vdm.msgwebservice.entity;

import com.vdm.msgwebservice.model.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;

@Data
@Entity
@Table(name = "messages")
public class Message {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "org_id")
    private Long orgId;
    @Column (name = "user_id")
    private long userId;
    @Column
    private String channel;
    @Column
    private String type;
    @Column
    private String body;
    @Column(nullable = false, updatable = false)
    @CreationTimestamp
    private Timestamp timestamp;


    private static StringBuilder createDraw(DrawBody drawBody) {
        StringBuilder msgbody = new StringBuilder();

        msgbody.append("FSU/15\n");

        msgbody.append(drawBody.getAirLinePrefix() + "-" + drawBody.getSerialNumber()
                + drawBody.getAirportCodeofOrigin() + drawBody.getAirportCodeofDestination() + "/"
                + drawBody.getShipmentDescriptionCode() + drawBody.getNumberofPieces());

        if (!nullOrEmpty(drawBody.getWeightCode()) || !nullOrEmpty(drawBody.getWeight())) {
            msgbody.append(drawBody.getWeightCode() + drawBody.getWeight());
        }

        if (drawBody.getShipmentDescriptionCode().equals("P")) {
            msgbody.append(drawBody.getTotalShipmentDescriptionCode()
                    + drawBody.getTotalNumberofPieces());
        }

        msgbody.append("\n" + drawBody.getStatusCode() + "/");

        return msgbody;
    }

    private static StringBuilder createMovementSectionWithIndicators(DrawBody drawBody) {
        StringBuilder msgbody = new StringBuilder();

        msgbody.append(createMovementSection(drawBody));

        msgbody.append("/");

        if (!nullOrEmpty(drawBody.getTypeofTimeIndicatorDeparture(), drawBody.getTimeDeparture())) {
            msgbody.append(drawBody.getTypeofTimeIndicatorDeparture() + drawBody.getTimeDeparture());
            if (!nullOrEmpty(drawBody.getDayChangeIndicatorDeparture())) {
                msgbody.append("-" + drawBody.getDayChangeIndicatorDeparture());
            }
        }
        msgbody.append("/");

        if (!nullOrEmpty(drawBody.getTypeofTimeIndicatorArrival(), drawBody.getTimeArrival())) {
            msgbody.append(drawBody.getTypeofTimeIndicatorArrival() + drawBody.getTimeArrival());
            if (!nullOrEmpty(drawBody.getDayChangeIndicatorArrival())) {
                msgbody.append("-" + drawBody.getDayChangeIndicatorArrival());
            }
        }
        return msgbody;
    }

    private static StringBuilder createMovementSection(DrawBody drawBody) {
        StringBuilder msgbody = new StringBuilder();

        msgbody.append(drawBody.getMovementShipmentDescriptionCode() + drawBody.getMovementNumberofPieces());

        if (!nullOrEmpty(drawBody.getMovementWeightCode(), drawBody.getMovementWeight())) {
            msgbody.append(drawBody.getMovementWeightCode() + drawBody.getMovementWeight());
        }
        return msgbody;
    }

    //fullMovement
    public static Message createFsuDepMsg(FsuDepBody fsuDepBody) {
        Message fsuDep = new Message();
        StringBuilder msgbody = createDraw(fsuDepBody);

        if (!nullOrEmpty(fsuDepBody.getCarrierCode(), fsuDepBody.getFlightNumber())) {
            msgbody.append(fsuDepBody.getCarrierCode() + fsuDepBody.getFlightNumber());
        }

        msgbody.append("/");

        if (!nullOrEmpty(fsuDepBody.getDayofScheduledDeparture(), fsuDepBody.getMonthofScheduledDeparture())) {
            msgbody.append(fsuDepBody.getDayofScheduledDeparture() + fsuDepBody.getMonthofScheduledDeparture());
        }

        msgbody.append("/" + fsuDepBody.getAirportCodeofDeparture() + fsuDepBody.getAirportCodeofArrival() + "/");

        msgbody.append(createMovementSectionWithIndicators(fsuDepBody));

        fsuDep.setBody(msgbody.toString());
        fsuDep.setChannel(fsuDepBody.getTransmissionChannel());
        fsuDep.setType(fsuDepBody.getStatusCode());

        return fsuDep;
    }
    //fullMovement
    public static Message createFsuArrMsg(FsuArrBody fsuArrBody) {
        Message fsuArr = new Message();
        StringBuilder msgbody = createDraw(fsuArrBody);

        if (!nullOrEmpty(fsuArrBody.getCarrierCode()) || !nullOrEmpty(fsuArrBody.getFlightNumber())) {
            msgbody.append(fsuArrBody.getCarrierCode() + fsuArrBody.getFlightNumber());
        }

        msgbody.append("/");

        msgbody.append(fsuArrBody.getDayofScheduledArrival() + fsuArrBody.getMonthofScheduledArrival() +
                fsuArrBody.getActualTimeofGivenStatusEvent());

        if (!nullOrEmpty(fsuArrBody.getDayChangeIndicatorMovement())) {
            msgbody.append("-" + fsuArrBody.getDayChangeIndicatorMovement());
        }

        msgbody.append("/" + fsuArrBody.getAirportCodeofArrival() + "/");

        msgbody.append(createMovementSectionWithIndicators(fsuArrBody));

        fsuArr.setBody(msgbody.toString());
        fsuArr.setChannel(fsuArrBody.getTransmissionChannel());
        fsuArr.setType(fsuArrBody.getStatusCode());

        return fsuArr;
    }

    public static Message createFsuAwdMsg(FsuAwdBody fsuAwdBody) {
        Message fsuAwd = new Message();
        StringBuilder msgbody = createDraw(fsuAwdBody);

        msgbody.append(fsuAwdBody.getDayofDelivery() + fsuAwdBody.getMonthofDelivery() +
                fsuAwdBody.getActualTimeofGivenStatusEvent() + "/" + fsuAwdBody.getAirportCodeofDelivery()+ "/");

        msgbody.append(createMovementSection(fsuAwdBody));

        fsuAwd.setBody(msgbody.toString());
        fsuAwd.setChannel(fsuAwdBody.getTransmissionChannel());
        fsuAwd.setType(fsuAwdBody.getStatusCode());

        return fsuAwd;
    }

    public static Message createFsuCrcMsg(FsuCrcBody fsuCrcBody) {
        Message fsuCrc = new Message();
        StringBuilder msgbody = createDraw(fsuCrcBody);

        msgbody.append(fsuCrcBody.getDayofReporting() + fsuCrcBody.getMonthofReporting() +
                fsuCrcBody.getActualTimeofGivenStatusEvent() + "/" + fsuCrcBody.getAirportCodeofReporting() + "/");

        msgbody.append(createMovementSection(fsuCrcBody));

        msgbody.append("/");

        if (!nullOrEmpty(fsuCrcBody.getCarrierCode(), fsuCrcBody.getFlightNumber())) {
            msgbody.append(fsuCrcBody.getCarrierCode() + fsuCrcBody.getFlightNumber());
        }

        msgbody.append("/");

        if (!nullOrEmpty(fsuCrcBody.getDayofScheduledDeparture(), fsuCrcBody.getMonthofScheduledDeparture())) {
            msgbody.append(fsuCrcBody.getDayofScheduledDeparture() + fsuCrcBody.getMonthofScheduledDeparture());
        }

        msgbody.append("/" + fsuCrcBody.getAirportCodeofDeparture() + fsuCrcBody.getAirportCodeofArrival());

        fsuCrc.setBody(msgbody.toString());
        fsuCrc.setChannel(fsuCrcBody.getTransmissionChannel());
        fsuCrc.setType(fsuCrcBody.getStatusCode());

        return fsuCrc;
    }

    public static Message createFsuDdlMsg(FsuDdlBody fsuDdlBody) {
        Message fsuDdl = new Message();
        StringBuilder msgbody = createDraw(fsuDdlBody);

        msgbody.append(fsuDdlBody.getDayofDeliverytoconsigneesdoor() + fsuDdlBody.getMonthofDeliverytoconsigneesdoor() +
                fsuDdlBody.getActualTimeofGivenStatusEvent() + "/" + fsuDdlBody.getAirportCodeofDeliverytoconsigneesdoor()+ "/");

        msgbody.append(createMovementSection(fsuDdlBody));

        fsuDdl.setBody(msgbody.toString());
        fsuDdl.setChannel(fsuDdlBody.getTransmissionChannel());
        fsuDdl.setType(fsuDdlBody.getStatusCode());

        return fsuDdl;
    }

    public static Message createFsuCcdMsg(FsuCcdBody fsuCcdBody) {
        Message fsuCcd = new Message();
        StringBuilder msgbody = createDraw(fsuCcdBody);

        msgbody.append(fsuCcdBody.getDayofClearance() + fsuCcdBody.getMonthofClearance() +
                fsuCcdBody.getActualTimeofGivenStatusEvent() + "/" + fsuCcdBody.getAirportCodeofClearance()+ "/");

        msgbody.append(createMovementSection(fsuCcdBody));

        fsuCcd.setBody(msgbody.toString());
        fsuCcd.setChannel(fsuCcdBody.getTransmissionChannel());
        fsuCcd.setType(fsuCcdBody.getStatusCode());

        return fsuCcd;
    }

    public static Message createFsuFohMsg(FsuFohBody fsuFohBody) {
        Message fsuFoh = new Message();
        StringBuilder msgbody = createDraw(fsuFohBody);

        msgbody.append(fsuFohBody.getDayofReceipt() + fsuFohBody.getMonthofReceipt() +
                fsuFohBody.getActualTimeofGivenStatusEvent() + "/" + fsuFohBody.getAirportCodeofReceipt()+ "/");

        msgbody.append(createMovementSection(fsuFohBody));

        fsuFoh.setBody(msgbody.toString());
        fsuFoh.setChannel(fsuFohBody.getTransmissionChannel());
        fsuFoh.setType(fsuFohBody.getStatusCode());

        return fsuFoh;
    }

    public static Message createFsuDisMsg(FsuDisBody fsuDisBody) {
        Message fsuDis = new Message();
        StringBuilder msgbody = createDraw(fsuDisBody);

        if (!nullOrEmpty(fsuDisBody.getCarrierCode()) || !nullOrEmpty(fsuDisBody.getFlightNumber())) {
            msgbody.append(fsuDisBody.getCarrierCode() + fsuDisBody.getFlightNumber());
        }

        msgbody.append("/");

        msgbody.append(fsuDisBody.getDayofDiscrepancy() + fsuDisBody.getMonthofDiscrepancy() +
                fsuDisBody.getActualTimeofGivenStatusEvent());

        msgbody.append("/" + fsuDisBody.getAirportCodeofDiscrepancy() + "/" + fsuDisBody.getDiscrepancyCode() + "/");

        msgbody.append(createMovementSection(fsuDisBody));

        fsuDis.setBody(msgbody.toString());
        fsuDis.setChannel(fsuDisBody.getTransmissionChannel());
        fsuDis.setType(fsuDisBody.getStatusCode());

        return fsuDis;
    }

    public static Message createFsuNfdMsg(FsuNfdBody fsuNfdBody) {
        Message fsuNfd = new Message();
        StringBuilder msgbody = createDraw(fsuNfdBody);

        msgbody.append(fsuNfdBody.getDayofNotification() + fsuNfdBody.getMonthofNotification() +
                fsuNfdBody.getActualTimeofGivenStatusEvent() + "/" + fsuNfdBody.getAirportCodeofNotification()+ "/");

        msgbody.append(createMovementSection(fsuNfdBody));

        fsuNfd.setBody(msgbody.toString());
        fsuNfd.setChannel(fsuNfdBody.getTransmissionChannel());
        fsuNfd.setType(fsuNfdBody.getStatusCode());

        return fsuNfd;
    }




    public void saveToFile(String path) {
        System.out.println(this.timestamp);
        String date = new SimpleDateFormat("dd-MM-yyyy_hh-mm-ss").format(this.timestamp);
        String name = "msg_" + this.id + "_" + date + ".msg";
        try (FileWriter writer = new FileWriter(path + name)) {
            writer.write(this.body);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static boolean nullOrEmpty(String... fields) {
        for (String field : fields) {
            if (field == null) return true;
            if (field.isEmpty()) return true;
        }
        return false;
    }
}
