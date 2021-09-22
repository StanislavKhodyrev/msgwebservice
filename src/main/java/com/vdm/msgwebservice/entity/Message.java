package com.vdm.msgwebservice.entity;

import com.vdm.msgwebservice.model.DrawBody;
import com.vdm.msgwebservice.model.FsuArrBody;
import com.vdm.msgwebservice.model.FsuAwdBody;
import com.vdm.msgwebservice.model.FsuDepBody;
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

    private static StringBuilder createMovementSection(DrawBody drawBody) {
        StringBuilder msgbody = new StringBuilder();

        msgbody.append(drawBody.getMovementShipmentDescriptionCode() + drawBody.getMovementNumberofPieces());

        if (!nullOrEmpty(drawBody.getMovementWeightCode(), drawBody.getMovementWeight())) {
            msgbody.append(drawBody.getMovementWeightCode() + drawBody.getMovementWeight());
        }

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

        msgbody.append(createMovementSection(fsuDepBody));

        fsuDep.setBody(msgbody.toString());
        fsuDep.setChannel(fsuDepBody.getTransmissionChannel());
        fsuDep.setType(fsuDepBody.getStatusCode());

        return fsuDep;
    }

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

        msgbody.append(createMovementSection(fsuArrBody));

        fsuArr.setBody(msgbody.toString());
        fsuArr.setChannel(fsuArrBody.getTransmissionChannel());
        fsuArr.setType(fsuArrBody.getStatusCode());

        return fsuArr;
    }

    public static Message createFsuAwdMsg(FsuAwdBody fsuAwdBody) {
        Message fsuAwd = new Message();
        StringBuilder msgbody = createDraw(fsuAwdBody);

        msgbody.append(fsuAwdBody.getDayofDelivery() + fsuAwdBody.getMonthofDelivery() +
                fsuAwdBody.getActualTimeofGivenStatusEvent() + "/" + fsuAwdBody.getAirportCodeofDelivery()
                + "/" + fsuAwdBody.getMovementShipmentDescriptionCode() + fsuAwdBody.getMovementNumberofPieces());

        if (!nullOrEmpty(fsuAwdBody.getMovementWeightCode(), fsuAwdBody.getMovementWeight())) {
            msgbody.append(fsuAwdBody.getMovementWeightCode() + fsuAwdBody.getMovementWeight());
        }

        fsuAwd.setBody(msgbody.toString());
        fsuAwd.setChannel(fsuAwdBody.getTransmissionChannel());
        fsuAwd.setType(fsuAwdBody.getStatusCode());

        return fsuAwd;
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
