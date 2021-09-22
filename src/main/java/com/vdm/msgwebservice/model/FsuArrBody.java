package com.vdm.msgwebservice.model;

public class FsuArrBody extends DrawBody {
    private String CarrierCode;
    private String FlightNumber;
    private String DayofScheduledArrival;
    private String MonthofScheduledArrival;
    private String ActualTimeofGivenStatusEvent;
    private String DayChangeIndicatorMovement;
    private String AirportCodeofArrival;

    public FsuArrBody() {
    }

    public String getCarrierCode() {
        return nullUpperCase(CarrierCode);
    }

    public void setCarrierCode(String carrierCode) {
        CarrierCode = carrierCode;
    }

    public String getFlightNumber() {
        return nullUpperCase(FlightNumber);
    }

    public void setFlightNumber(String flightNumber) {
        FlightNumber = flightNumber;
    }

    public String getDayofScheduledArrival() {
        return DayofScheduledArrival;
    }

    public void setDayofScheduledArrival(String dayofScheduledArrival) {
        DayofScheduledArrival = dayofScheduledArrival;
    }

    public String getMonthofScheduledArrival() {
        return nullUpperCase(MonthofScheduledArrival);
    }

    public void setMonthofScheduledArrival(String monthofScheduledArrival) {
        MonthofScheduledArrival = monthofScheduledArrival;
    }

    public String getActualTimeofGivenStatusEvent() {
        return ActualTimeofGivenStatusEvent;
    }

    public void setActualTimeofGivenStatusEvent(String actualTimeofGivenStatusEvent) {
        ActualTimeofGivenStatusEvent = actualTimeofGivenStatusEvent;
    }

    public String getDayChangeIndicatorMovement() {
        return nullUpperCase(DayChangeIndicatorMovement);
    }

    public void setDayChangeIndicatorMovement(String dayChangeIndicatorMovement) {
        DayChangeIndicatorMovement = dayChangeIndicatorMovement;
    }

    public String getAirportCodeofArrival() {
        return nullUpperCase(AirportCodeofArrival);
    }

    public void setAirportCodeofArrival(String airportCodeofArrival) {
        AirportCodeofArrival = airportCodeofArrival;
    }

}
