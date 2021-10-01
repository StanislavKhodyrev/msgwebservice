package com.vdm.msgwebservice.model;

import java.util.ArrayList;
import java.util.List;

public class Validator {
    private List<String> errors = new ArrayList<>();

    public Validator() {
    }

    public List<String> getErrors() {
        return errors;
    }

    public void setErrors(List<String> errors) {
        this.errors = errors;
    }

    public List<String> getListFsuDepErrors(FsuDepBody fsuDepBody) {

        checkDrawSection(fsuDepBody);

        if (nullOrEmpty(fsuDepBody.getStatusCode())) {
            errors.add("The “Status Code” is not selected");
        } else if (!fsuDepBody.getStatusCode().matches("DEP|BKD|MAN|PRE")) {
            errors.add("The “Status Code” field has an incorrect format");
        }

        if (!nullOrEmpty(fsuDepBody.getCarrierCode()) &&
                !fsuDepBody.getCarrierCode().matches("[a-zA-Z]{2}|[a-zA-Z]\\d|\\d[a-zA-Z]")) {
            errors.add("The “Carrier Code” field has an incorrect format");
        }

        if (!nullOrEmpty(fsuDepBody.getFlightNumber()) &&
                !fsuDepBody.getFlightNumber().matches("\\d{3}(\\d[a-zA-Z])?")) {
            errors.add("The “Flight number” field has an incorrect format");
        }

        if (!nullOrEmpty(fsuDepBody.getDayofScheduledDeparture()) &&
                !fsuDepBody.getDayofScheduledDeparture().matches("(0?[1-9]|[12]\\d|3[01])")) {
            errors.add("The “Day of Scheduled Departure” field has an incorrect format");
        }

        if (!nullOrEmpty(fsuDepBody.getMonthofScheduledDeparture()) &&
                !fsuDepBody.getMonthofScheduledDeparture().matches("JAN|FEB|MAR|APR|MAY|JUN|JUL|AUG|SEP|OCT|NOV|DEC")) {
            errors.add("The “Month of Scheduled Departure” field has an incorrect format");
        }

        if (nullOrEmpty(fsuDepBody.getAirportCodeofDeparture())) {
            errors.add("The “Airport Code of Departure” field is not filled");
        } else if (!fsuDepBody.getAirportCodeofDeparture().matches("[a-zA-Z]{3}")) {
            errors.add("The “Airport Code of Departure”  field has an incorrect format");
        }

        if (nullOrEmpty(fsuDepBody.getAirportCodeofArrival())) {
            errors.add("The “Airport Code of Arrival” field is not filled");
        } else if (!fsuDepBody.getAirportCodeofArrival().matches("[a-zA-Z]{3}")) {
            errors.add("The “Airport Code of Arrival”  field has an incorrect format");
        }

        checkMovementSection(fsuDepBody);
        checkTimeIndicatorSection(fsuDepBody);

        return errors;
    }

    public List<String> getListFsuArrErrors(FsuArrBody fsuArrBody) {

        checkDrawSection(fsuArrBody);

        if (nullOrEmpty(fsuArrBody.getStatusCode())) {
            errors.add("The “Status Code” is not selected");
        } else if (!fsuArrBody.getStatusCode().matches("ARR|AWR")) {
            errors.add("The “Status Code” field has an incorrect format");
        }

        if (!nullOrEmpty(fsuArrBody.getCarrierCode()) &&
                !fsuArrBody.getCarrierCode().matches("[a-zA-Z]{2}|[a-zA-Z]\\d|\\d[a-zA-Z]")) {
            errors.add("The “Carrier Code” field has an incorrect format");
        }


        if (!nullOrEmpty(fsuArrBody.getFlightNumber()) &&
                !fsuArrBody.getFlightNumber().matches("\\d{3}(\\d[a-zA-Z])?")) {
            errors.add("The “Flight number” field has an incorrect format");
        }

        if (!nullOrEmpty(fsuArrBody.getDayofScheduledArrival()) &&
                !fsuArrBody.getDayofScheduledArrival().matches("(0?[1-9]|[12]\\d|3[01])")) {
            errors.add("The “Day of Scheduled Arrival” field has an incorrect format");
        }

        if (!nullOrEmpty(fsuArrBody.getMonthofScheduledArrival()) &&
                !fsuArrBody.getMonthofScheduledArrival().matches("JAN|FEB|MAR|APR|MAY|JUN|JUL|AUG|SEP|OCT|NOV|DEC")) {
            errors.add("The “Month of Scheduled Arrival” field has an incorrect format");
        }

        if (nullOrEmpty(fsuArrBody.getActualTimeofGivenStatusEvent())) {
            errors.add("The “Actual Time of Given Status Event” field is not filled");
        } else if (!fsuArrBody.getActualTimeofGivenStatusEvent().matches("([0-1][0-9]|[2][0-3])[0-5][0-9]")) {
            errors.add("The “Actual Time of Given Status Event” field has an incorrect format");
        }

        if (!nullOrEmpty(fsuArrBody.getDayChangeIndicatorMovement()) &&
                !fsuArrBody.getDayChangeIndicatorMovement().matches("P|N|S|T|A|B|C|D|E|F|G|H|I|J|K|L")) {
            errors.add("The “Day Change Indicator Movement”  field has an incorrect format");
        }

        if (nullOrEmpty(fsuArrBody.getAirportCodeofArrival())) {
            errors.add("The “Airport Code of Arrival” field is not filled");
        } else if (!fsuArrBody.getAirportCodeofArrival().matches("[a-zA-Z]{3}")) {
            errors.add("The “Airport Code of Arrival” field has an incorrect format");
        }

        checkMovementSection(fsuArrBody);
        checkTimeIndicatorSection(fsuArrBody);

        return errors;
    }

    public List<String> getListFsuAwdErrors(FsuAwdBody fsuAwdBody) {
        checkDrawSection(fsuAwdBody);

        if (nullOrEmpty(fsuAwdBody.getStatusCode())) {
            errors.add("The “Status Code” is not selected");
        } else if (!fsuAwdBody.getStatusCode().matches("AWD|DLV")) {
            errors.add("The “Status Code” field has an incorrect format");
        }

        if (!nullOrEmpty(fsuAwdBody.getDayofDelivery()) &&
                !fsuAwdBody.getDayofDelivery().matches("(0?[1-9]|[12]\\d|3[01])")) {
            errors.add("The “Day of Delivery” field has an incorrect format");
        }

        if (!nullOrEmpty(fsuAwdBody.getMonthofDelivery()) &&
                !fsuAwdBody.getMonthofDelivery().matches("JAN|FEB|MAR|APR|MAY|JUN|JUL|AUG|SEP|OCT|NOV|DEC")) {
            errors.add("The “Month of Delivery” field has an incorrect format");
        }

        if (nullOrEmpty(fsuAwdBody.getActualTimeofGivenStatusEvent())) {
            errors.add("The “Actual Time of Given Status Event” field is not filled");
        } else if (!fsuAwdBody.getActualTimeofGivenStatusEvent().matches("([0-1][0-9]|[2][0-3])[0-5][0-9]")) {
            errors.add("The “Actual Time of Given Status Event” field has an incorrect format");
        }

        if (nullOrEmpty(fsuAwdBody.getAirportCodeofDelivery())) {
            errors.add("The “Airport Code of Delivery” field is not filled");
        } else if (!fsuAwdBody.getAirportCodeofDelivery().matches("[a-zA-Z]{3}")) {
            errors.add("The “Airport Code of Delivery” field has an incorrect format");
        }

        checkMovementSection(fsuAwdBody);

        return errors;
    }

    public List<String> getListFsuCrcErrors(FsuCrcBody fsuCrcBody) {
        checkDrawSection(fsuCrcBody);

        if (nullOrEmpty(fsuCrcBody.getStatusCode())) {
            errors.add("The “Status Code” is not selected");
        } else if (!fsuCrcBody.getStatusCode().matches("CRC")) {
            errors.add("The “Status Code” field has an incorrect format");
        }

        if (!nullOrEmpty(fsuCrcBody.getDayofReporting()) &&
                !fsuCrcBody.getDayofReporting().matches("(0?[1-9]|[12]\\d|3[01])")) {
            errors.add("The “Day of Reporting” field has an incorrect format");
        }

        if (!nullOrEmpty(fsuCrcBody.getMonthofReporting()) &&
                !fsuCrcBody.getMonthofReporting().matches("JAN|FEB|MAR|APR|MAY|JUN|JUL|AUG|SEP|OCT|NOV|DEC")) {
            errors.add("The “Month of Reporting” field has an incorrect format");
        }

        if (nullOrEmpty(fsuCrcBody.getActualTimeofGivenStatusEvent())) {
            errors.add("The “Actual Time of Given Status Event” field is not filled");
        } else if (!fsuCrcBody.getActualTimeofGivenStatusEvent().matches("([0-1][0-9]|[2][0-3])[0-5][0-9]")) {
            errors.add("The “Actual Time of Given Status Event” field has an incorrect format");
        }

        if (nullOrEmpty(fsuCrcBody.getAirportCodeofReporting())) {
            errors.add("The “Airport Code of Reporting” field is not filled");
        } else if (!fsuCrcBody.getAirportCodeofReporting().matches("[a-zA-Z]{3}")) {
            errors.add("The “Airport Code of Reporting” field has an incorrect format");
        }

        checkMovementSection(fsuCrcBody);

        if (nullOrEmpty(fsuCrcBody.getAirportCodeofDeparture())) {
            errors.add("The “Airport Code of Departure” field is not filled");
        } else if (!fsuCrcBody.getAirportCodeofDeparture().matches("[a-zA-Z]{3}")) {
            errors.add("The “Airport Code of Departure”  field has an incorrect format");
        }

        if (nullOrEmpty(fsuCrcBody.getAirportCodeofArrival())) {
            errors.add("The “Airport Code of Arrival” field is not filled");
        } else if (!fsuCrcBody.getAirportCodeofArrival().matches("[a-zA-Z]{3}")) {
            errors.add("The “Airport Code of Arrival”  field has an incorrect format");
        }

        return errors;
    }

    public List<String> getListFsuDdlErrors(FsuDdlBody fsuDdlBody) {
        checkDrawSection(fsuDdlBody);

        if (nullOrEmpty(fsuDdlBody.getStatusCode())) {
            errors.add("The “Status Code” is not selected");
        } else if (!fsuDdlBody.getStatusCode().matches("DDL")) {
            errors.add("The “Status Code” field has an incorrect format");
        }

        if (!nullOrEmpty(fsuDdlBody.getDayofDeliverytoconsigneesdoor()) &&
                !fsuDdlBody.getDayofDeliverytoconsigneesdoor().matches("(0?[1-9]|[12]\\d|3[01])")) {
            errors.add("The “Day of Delivery to consignee's door” field has an incorrect format");
        }

        if (!nullOrEmpty(fsuDdlBody.getMonthofDeliverytoconsigneesdoor()) &&
                !fsuDdlBody.getMonthofDeliverytoconsigneesdoor().matches("JAN|FEB|MAR|APR|MAY|JUN|JUL|AUG|SEP|OCT|NOV|DEC")) {
            errors.add("The “Month of Delivery to consignee's door” field has an incorrect format");
        }

        if (nullOrEmpty(fsuDdlBody.getActualTimeofGivenStatusEvent())) {
            errors.add("The “Actual Time of Given Status Event” field is not filled");
        } else if (!fsuDdlBody.getActualTimeofGivenStatusEvent().matches("([0-1][0-9]|[2][0-3])[0-5][0-9]")) {
            errors.add("The “Actual Time of Given Status Event” field has an incorrect format");
        }

        if (nullOrEmpty(fsuDdlBody.getAirportCodeofDeliverytoconsigneesdoor())) {
            errors.add("The “Airport Code of Reporting” field is not filled");
        } else if (!fsuDdlBody.getAirportCodeofDeliverytoconsigneesdoor().matches("[a-zA-Z]{3}")) {
            errors.add("The “Airport Code of Delivery to consignee's door” field has an incorrect format");
        }
        checkMovementSection(fsuDdlBody);

        return errors;
    }

    public List<String> getListFsuCcdErrors(FsuCcdBody fsuCcdBody) {
        checkDrawSection(fsuCcdBody);

        if (nullOrEmpty(fsuCcdBody.getStatusCode())) {
            errors.add("The “Status Code” is not selected");
        } else if (!fsuCcdBody.getStatusCode().matches("CCD")) {
            errors.add("The “Status Code” field has an incorrect format");
        }

        if (!nullOrEmpty(fsuCcdBody.getDayofClearance()) &&
                !fsuCcdBody.getDayofClearance().matches("(0?[1-9]|[12]\\d|3[01])")) {
            errors.add("The “Day of Clearance” field has an incorrect format");
        }

        if (!nullOrEmpty(fsuCcdBody.getMonthofClearance()) &&
                !fsuCcdBody.getMonthofClearance().matches("JAN|FEB|MAR|APR|MAY|JUN|JUL|AUG|SEP|OCT|NOV|DEC")) {
            errors.add("The “Month of Clearance” field has an incorrect format");
        }

        if (nullOrEmpty(fsuCcdBody.getActualTimeofGivenStatusEvent())) {
            errors.add("The “Actual Time of Given Status Event” field is not filled");
        } else if (!fsuCcdBody.getActualTimeofGivenStatusEvent().matches("([0-1][0-9]|[2][0-3])[0-5][0-9]")) {
            errors.add("The “Actual Time of Given Status Event” field has an incorrect format");
        }

        if (nullOrEmpty(fsuCcdBody.getAirportCodeofClearance())) {
            errors.add("The “Airport Code of Clearance” field is not filled");
        } else if (!fsuCcdBody.getAirportCodeofClearance().matches("[a-zA-Z]{3}")) {
            errors.add("The “Airport Code of Clearance” field has an incorrect format");
        }
        checkMovementSection(fsuCcdBody);

        return errors;
    }

    public List<String> getListFsuFohErrors(FsuFohBody fsuFohBody) {
        checkDrawSection(fsuFohBody);

        if (nullOrEmpty(fsuFohBody.getStatusCode())) {
            errors.add("The “Status Code” is not selected");
        } else if (!fsuFohBody.getStatusCode().matches("FOH")) {
            errors.add("The “Status Code” field has an incorrect format");
        }

        if (!nullOrEmpty(fsuFohBody.getDayofReceipt()) &&
                !fsuFohBody.getDayofReceipt().matches("(0?[1-9]|[12]\\d|3[01])")) {
            errors.add("The “Day of Receipt” field has an incorrect format");
        }

        if (!nullOrEmpty(fsuFohBody.getMonthofReceipt()) &&
                !fsuFohBody.getMonthofReceipt().matches("JAN|FEB|MAR|APR|MAY|JUN|JUL|AUG|SEP|OCT|NOV|DEC")) {
            errors.add("The “Month of Receipt” field has an incorrect format");
        }

        if (nullOrEmpty(fsuFohBody.getActualTimeofGivenStatusEvent())) {
            errors.add("The “Actual Time of Given Status Event” field is not filled");
        } else if (!fsuFohBody.getActualTimeofGivenStatusEvent().matches("([0-1][0-9]|[2][0-3])[0-5][0-9]")) {
            errors.add("The “Actual Time of Given Status Event” field has an incorrect format");
        }

        if (nullOrEmpty(fsuFohBody.getAirportCodeofReceipt())) {
            errors.add("The “Airport Code of Receipt” field is not filled");
        } else if (!fsuFohBody.getAirportCodeofReceipt().matches("[a-zA-Z]{3}")) {
            errors.add("The “Airport Code of Receipt” field has an incorrect format");
        }
        checkMovementSection(fsuFohBody);

        return errors;
    }

    public List<String> getListFsuDisErrors(FsuDisBody fsuDisBody) {

        checkDrawSection(fsuDisBody);

        if (nullOrEmpty(fsuDisBody.getStatusCode())) {
            errors.add("The “Status Code” is not selected");
        } else if (!fsuDisBody.getStatusCode().matches("DIS")) {
            errors.add("The “Status Code” field has an incorrect format");
        }

        if (!nullOrEmpty(fsuDisBody.getCarrierCode()) &&
                !fsuDisBody.getCarrierCode().matches("[a-zA-Z]{2}|[a-zA-Z]\\d|\\d[a-zA-Z]")) {
            errors.add("The “Carrier Code” field has an incorrect format");
        }


        if (!nullOrEmpty(fsuDisBody.getFlightNumber()) &&
                !fsuDisBody.getFlightNumber().matches("\\d{3}(\\d[a-zA-Z])?")) {
            errors.add("The “Flight number” field has an incorrect format");
        }

        if (!nullOrEmpty(fsuDisBody.getDayofDiscrepancy()) &&
                !fsuDisBody.getDayofDiscrepancy().matches("(0?[1-9]|[12]\\d|3[01])")) {
            errors.add("The “Day of Discrepancy” field has an incorrect format");
        }

        if (!nullOrEmpty(fsuDisBody.getMonthofDiscrepancy()) &&
                !fsuDisBody.getMonthofDiscrepancy().matches("JAN|FEB|MAR|APR|MAY|JUN|JUL|AUG|SEP|OCT|NOV|DEC")) {
            errors.add("The “Month of Scheduled Discrepancy” field has an incorrect format");
        }

        if (nullOrEmpty(fsuDisBody.getActualTimeofGivenStatusEvent())) {
            errors.add("The “Actual Time of Given Status Event” field is not filled");
        } else if (!fsuDisBody.getActualTimeofGivenStatusEvent().matches("([0-1][0-9]|[2][0-3])[0-5][0-9]")) {
            errors.add("The “Actual Time of Given Status Event” field has an incorrect format");
        }


        if (nullOrEmpty(fsuDisBody.getAirportCodeofDiscrepancy())) {
            errors.add("The “Airport Code of Discrepancy” field is not filled");
        } else if (!fsuDisBody.getAirportCodeofDiscrepancy().matches("[a-zA-Z]{3}")) {
            errors.add("The “Airport Code of Discrepancy” field has an incorrect format");
        }

        if (nullOrEmpty(fsuDisBody.getDiscrepancyCode())) {
            errors.add("The “Discrepancy Code” field is not filled");
        } else if (!fsuDisBody.getDiscrepancyCode().matches("[a-zA-Z]{4}")) {
            errors.add("The “Discrepancy Code” field has an incorrect format");
        }

        checkMovementSection(fsuDisBody);
        checkTimeIndicatorSection(fsuDisBody);

        return errors;
    }

    public List<String> getListFsuNfdErrors(FsuNfdBody fsuNfdBody) {
        checkDrawSection(fsuNfdBody);

        if (nullOrEmpty(fsuNfdBody.getStatusCode())) {
            errors.add("The “Status Code” is not selected");
        } else if (!fsuNfdBody.getStatusCode().matches("NFD")) {
            errors.add("The “Status Code” field has an incorrect format");
        }

        if (!nullOrEmpty(fsuNfdBody.getDayofNotification()) &&
                !fsuNfdBody.getDayofNotification().matches("(0?[1-9]|[12]\\d|3[01])")) {
            errors.add("The “Day of Notification” field has an incorrect format");
        }

        if (!nullOrEmpty(fsuNfdBody.getMonthofNotification()) &&
                !fsuNfdBody.getMonthofNotification().matches("JAN|FEB|MAR|APR|MAY|JUN|JUL|AUG|SEP|OCT|NOV|DEC")) {
            errors.add("The “Month of Notification” field has an incorrect format");
        }

        if (nullOrEmpty(fsuNfdBody.getActualTimeofGivenStatusEvent())) {
            errors.add("The “Actual Time of Given Status Event” field is not filled");
        } else if (!fsuNfdBody.getActualTimeofGivenStatusEvent().matches("([0-1][0-9]|[2][0-3])[0-5][0-9]")) {
            errors.add("The “Actual Time of Given Status Event” field has an incorrect format");
        }

        if (nullOrEmpty(fsuNfdBody.getAirportCodeofNotification())) {
            errors.add("The “Airport Code of Notification” field is not filled");
        } else if (!fsuNfdBody.getAirportCodeofNotification().matches("[a-zA-Z]{3}")) {
            errors.add("The “Airport Code of Notification” field has an incorrect format");
        }
        checkMovementSection(fsuNfdBody);

        return errors;
    }

    private void checkDrawSection(DrawBody drawBody) {

        if (nullOrEmpty(drawBody.getTransmissionChannel())) {
            errors.add("The “Transmission Channel Type” is not selected");
        }

        if (nullOrEmpty(drawBody.getAirLinePrefix())) {
            errors.add("The “AirLine Prefix” field is not filled");
        } else if (!drawBody.getAirLinePrefix().matches("\\d{3}")) {
            errors.add("The AirLine Prefix  field has an incorrect format");
        }


        if (nullOrEmpty(drawBody.getSerialNumber())) {
            errors.add("The “Serial Number” field is not filled");
        } else if (!drawBody.getSerialNumber().matches("\\d{8}")) {
            errors.add("The “Serial Number” field has an incorrect format");
        }

        if (nullOrEmpty(drawBody.getAirportCodeofOrigin())) {
            errors.add("The “Airport Code of Origin” field is not filled");
        } else if (!drawBody.getAirportCodeofOrigin().matches("[a-zA-Z]{3}")) {
            errors.add("The “Airport Code of Origin” field has an incorrect format");
        }

        if (nullOrEmpty(drawBody.getAirportCodeofDestination())) {
            errors.add("The “Airport Code of Destination” field is not filled");
        } else if (!drawBody.getAirportCodeofDestination().matches("[a-zA-Z]{3}")) {
            errors.add("The “Airport Code of Destination” field has an incorrect format");
        }

        if (nullOrEmpty(drawBody.getShipmentDescriptionCode())) {
            errors.add("The “Shipment Description Code” field is not filled");
        } else if (!drawBody.getShipmentDescriptionCode().matches("T|P")) {
            errors.add("The “Shipment Description Code” field has an incorrect format");
        }

        if (nullOrEmpty(drawBody.getNumberofPieces())) {
            errors.add("The “Number of Pieces”  field is not filled");
        } else if (!drawBody.getNumberofPieces().matches("\\d{1,4}")) {
            errors.add("The “Number of Pieces” field has an incorrect format");
        }
//
        if (!nullOrEmpty(drawBody.getWeightCode()) &&
                !drawBody.getWeightCode().matches("K|L")) {
            errors.add("The “Weight Code” field has an incorrect format");
        }

        if (!nullOrEmpty(drawBody.getWeight()) &&
                !drawBody.getWeight().matches("\\d{1,7}(\\.\\d{1,7})?")) {
            errors.add("The “Weight” field has an incorrect format");
        }

        if (!nullOrEmpty(drawBody.getShipmentDescriptionCode()) &&
                drawBody.getShipmentDescriptionCode().equals("P") &&
                (nullOrEmpty(drawBody.getTotalShipmentDescriptionCode()) ||
                        !drawBody.getTotalShipmentDescriptionCode().equals("T"))) {
            errors.add("The “Total Shipment Description Code” field has an incorrect format");
        }

        if (!nullOrEmpty(drawBody.getShipmentDescriptionCode()) &&
                drawBody.getShipmentDescriptionCode().equals("P") &&
                !nullOrEmpty(drawBody.getTotalNumberofPieces()) &&
                !drawBody.getTotalNumberofPieces().matches("\\d{1,4}")) {
            errors.add("The “Total Number of Pieces” field has an incorrect format");
        }
    }

    private void checkMovementSection(DrawBody drawBody) {

        if (nullOrEmpty(drawBody.getMovementShipmentDescriptionCode())) {
            errors.add("The “Movement Shipment Description Code” is not selected");
        } else if (!drawBody.getMovementShipmentDescriptionCode().matches("T|P")) {
            errors.add("The “Movement Shipment Description Code”  field has an incorrect format");
        }

        if (nullOrEmpty(drawBody.getMovementNumberofPieces())) {
            errors.add("The “Movement Number of Pieces” field is not filled");
        } else if (!drawBody.getMovementNumberofPieces().matches("\\d{1,4}")) {
            errors.add("The “Movement Number of Pieces”  field has an incorrect format");
        }

        if (!nullOrEmpty(drawBody.getMovementWeightCode()) &&
                !drawBody.getMovementWeightCode().matches("K|L")) {
            errors.add("The “Movement Weight Code”  field has an incorrect format");
        }

        if (!nullOrEmpty(drawBody.getMovementWeight()) &&
                !drawBody.getMovementWeight().matches("\\d{1,7}(\\.\\d{1,7})?")) {
            errors.add("The “Movement Weight”  field has an incorrect format");
        }

    }

    private void checkTimeIndicatorSection(DrawBody drawBody) {

        if (!nullOrEmpty(drawBody.getTypeofTimeIndicatorDeparture()) &&
                !drawBody.getTypeofTimeIndicatorDeparture().matches("A|E|S")) {
            errors.add("The “Type of Time Indicator Departure”  field has an incorrect format");
        }

        if (!nullOrEmpty(drawBody.getTimeDeparture()) &&
                !drawBody.getTimeDeparture().matches("([0-1][0-9]|[2][0-3])[0-5][0-9]")) {
            errors.add("The “Time Departure”  field has an incorrect format");
        }

        if (!nullOrEmpty(drawBody.getDayChangeIndicatorDeparture()) &&
                !drawBody.getDayChangeIndicatorDeparture().matches("P|N|S|T|A|B|C|D|E|F|G|H|I|J|K|L")) {
            errors.add("The “Day Change Indicator Departure”  field has an incorrect format");
        }

        if (!nullOrEmpty(drawBody.getTypeofTimeIndicatorArrival()) &&
                !drawBody.getTypeofTimeIndicatorArrival().matches("A|E|S")) {
            errors.add("The “Type of Time Indicator Arrival”  field has an incorrect format");
        }

        if (!nullOrEmpty(drawBody.getTimeArrival()) &&
                !drawBody.getTimeArrival().matches("([0-1][0-9]|[2][0-3])[0-5][0-9]")) {
            errors.add("The “Time Arrival”  field has an incorrect format");
        }

        if (!nullOrEmpty(drawBody.getDayChangeIndicatorArrival()) &&
                !drawBody.getDayChangeIndicatorArrival().matches("P|N|S|T|A|B|C|D|E|F|G|H|I|J|K|L")) {
            errors.add("The “Day Change Indicator Arrival”  field has an incorrect format");
        }

    }

    private boolean nullOrEmpty(String field) {
        return field == null || field.isEmpty();
    }
}
