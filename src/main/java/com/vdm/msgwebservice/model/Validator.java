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
        } else if (!fsuDepBody.getStatusCode().matches("DEP")) {
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
        } else if (!fsuAwdBody.getStatusCode().matches("AWD")) {
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
