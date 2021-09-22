package com.vdm.msgwebservice.model;

import java.util.Locale;

public abstract class DrawBody {
    //DrawSection
    private String TransmissionChannel;
    private String AirLinePrefix;
    private String SerialNumber;
    private String AirportCodeofOrigin;
    private String AirportCodeofDestination;
    private String ShipmentDescriptionCode;
    private String NumberofPieces;
    private String WeightCode;
    private String Weight;
    private String TotalShipmentDescriptionCode;
    private String TotalNumberofPieces;
    private String StatusCode;

    //MovementSection
    private String MovementShipmentDescriptionCode;
    private String MovementNumberofPieces;
    private String MovementWeightCode;
    private String MovementWeight;

    //TimeIndicatorSection
    private String TypeofTimeIndicatorDeparture;
    private String TimeDeparture;
    private String DayChangeIndicatorDeparture;
    private String TypeofTimeIndicatorArrival;
    private String TimeArrival;
    private String DayChangeIndicatorArrival;

    public DrawBody() {
    }

    public String getTransmissionChannel() {
        return nullUpperCase(TransmissionChannel);
    }

    public void setTransmissionChannel(String transmissionChannel) {
        TransmissionChannel = transmissionChannel;
    }

    public String getAirLinePrefix() {
        return AirLinePrefix;
    }

    public void setAirLinePrefix(String airLinePrefix) {
        AirLinePrefix = airLinePrefix;
    }

    public String getSerialNumber() {
        return SerialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        SerialNumber = serialNumber;
    }

    public String getAirportCodeofOrigin() {
        return nullUpperCase(AirportCodeofOrigin);
    }

    public void setAirportCodeofOrigin(String airportCodeofOrigin) {
        AirportCodeofOrigin = airportCodeofOrigin;
    }

    public String getAirportCodeofDestination() {
        return nullUpperCase(AirportCodeofDestination);
    }

    public void setAirportCodeofDestination(String airportCodeofDestination) {
        AirportCodeofDestination = airportCodeofDestination;
    }

    public String getShipmentDescriptionCode() {
        return nullUpperCase(ShipmentDescriptionCode);
    }

    public void setShipmentDescriptionCode(String shipmentDescriptionCode) {
        ShipmentDescriptionCode = shipmentDescriptionCode;
    }

    public String getNumberofPieces() {
        return NumberofPieces;
    }

    public void setNumberofPieces(String numberofPieces) {
        NumberofPieces = numberofPieces;
    }

    public String getWeightCode() {
        return nullUpperCase(WeightCode);
    }

    public void setWeightCode(String weightCode) {
        WeightCode = weightCode;
    }

    public String getWeight() {
        return Weight;
    }

    public void setWeight(String weight) {
        Weight = weight;
    }

    public String getTotalShipmentDescriptionCode() {
        return nullUpperCase(TotalShipmentDescriptionCode);
    }

    public void setTotalShipmentDescriptionCode(String totalShipmentDescriptionCode) {
        TotalShipmentDescriptionCode = totalShipmentDescriptionCode;
    }

    public String getTotalNumberofPieces() {
        return TotalNumberofPieces;
    }

    public void setTotalNumberofPieces(String totalNumberofPieces) {
        TotalNumberofPieces = totalNumberofPieces;
    }

    public String getStatusCode() {
        return nullUpperCase(StatusCode);
    }

    public void setStatusCode(String statusCode) {
        StatusCode = statusCode;
    }

    public String getMovementShipmentDescriptionCode() {
        return nullUpperCase(MovementShipmentDescriptionCode);
    }

    public void setMovementShipmentDescriptionCode(String movementShipmentDescriptionCode) {
        MovementShipmentDescriptionCode = movementShipmentDescriptionCode;
    }

    public String getMovementNumberofPieces() {
        return MovementNumberofPieces;
    }

    public void setMovementNumberofPieces(String movementNumberofPieces) {
        MovementNumberofPieces = movementNumberofPieces;
    }

    public String getMovementWeightCode() {
        return nullUpperCase(MovementWeightCode);
    }

    public void setMovementWeightCode(String movementWeightCode) {
        MovementWeightCode = movementWeightCode;
    }

    public String getMovementWeight() {
        return MovementWeight;
    }

    public void setMovementWeight(String movementWeight) {
        MovementWeight = movementWeight;
    }

    public String getTypeofTimeIndicatorDeparture() {
        return nullUpperCase(TypeofTimeIndicatorDeparture);
    }

    public void setTypeofTimeIndicatorDeparture(String typeofTimeIndicatorDeparture) {
        TypeofTimeIndicatorDeparture = typeofTimeIndicatorDeparture;
    }

    public String getTimeDeparture() {
        return TimeDeparture;
    }

    public void setTimeDeparture(String timeDeparture) {
        TimeDeparture = timeDeparture;
    }

    public String getDayChangeIndicatorDeparture() {
        return nullUpperCase(DayChangeIndicatorDeparture);
    }

    public void setDayChangeIndicatorDeparture(String dayChangeIndicatorDeparture) {
        DayChangeIndicatorDeparture = dayChangeIndicatorDeparture;
    }

    public String getTypeofTimeIndicatorArrival() {
        return nullUpperCase(TypeofTimeIndicatorArrival);
    }

    public void setTypeofTimeIndicatorArrival(String typeofTimeIndicatorArrival) {
        TypeofTimeIndicatorArrival = typeofTimeIndicatorArrival;
    }

    public String getTimeArrival() {
        return TimeArrival;
    }

    public void setTimeArrival(String timeArrival) {
        TimeArrival = timeArrival;
    }

    public String getDayChangeIndicatorArrival() {
        return nullUpperCase(DayChangeIndicatorArrival);
    }

    public void setDayChangeIndicatorArrival(String dayChangeIndicatorArrival) {
        DayChangeIndicatorArrival = dayChangeIndicatorArrival;
    }

    protected String nullUpperCase(String field) {
        return field == null ? null : field.toUpperCase(Locale.ROOT);
    }
}
