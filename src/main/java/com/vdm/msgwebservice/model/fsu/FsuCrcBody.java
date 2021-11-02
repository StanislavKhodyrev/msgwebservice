package com.vdm.msgwebservice.model.fsu;

public class FsuCrcBody extends DrawBody {
    private String CarrierCode;
    private String FlightNumber;
    private String DayofReporting;
    private String MonthofReporting;

    private String ActualTimeofGivenStatusEvent;
    private String AirportCodeofReporting;

    private String AirportCodeofDeparture;
    private String AirportCodeofArrival;
    private String DayofScheduledDeparture;
    private String MonthofScheduledDeparture;


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

    public String getDayofReporting() {
        return DayofReporting;
    }

    public void setDayofReporting(String dayofReporting) {
        DayofReporting = dayofReporting;
    }

    public String getMonthofReporting() {
        return nullUpperCase(MonthofReporting);
    }

    public void setMonthofReporting(String monthofReporting) {
        MonthofReporting = monthofReporting;
    }

    public String getActualTimeofGivenStatusEvent() {
        return ActualTimeofGivenStatusEvent;
    }

    public void setActualTimeofGivenStatusEvent(String actualTimeofGivenStatusEvent) {
        ActualTimeofGivenStatusEvent = actualTimeofGivenStatusEvent;
    }

    public String getAirportCodeofReporting() {
        return nullUpperCase(AirportCodeofReporting);
    }

    public void setAirportCodeofReporting(String airportCodeofReporting) {
        AirportCodeofReporting = airportCodeofReporting;
    }

    public String getAirportCodeofDeparture() {
        return nullUpperCase(AirportCodeofDeparture);
    }

    public void setAirportCodeofDeparture(String airportCodeofDeparture) {
        AirportCodeofDeparture = airportCodeofDeparture;
    }

    public String getAirportCodeofArrival() {
        return nullUpperCase(AirportCodeofArrival);
    }

    public void setAirportCodeofArrival(String airportCodeofArrival) {
        AirportCodeofArrival = airportCodeofArrival;
    }

    public String getDayofScheduledDeparture() {
        return DayofScheduledDeparture;
    }

    public void setDayofScheduledDeparture(String dayofScheduledDeparture) {
        DayofScheduledDeparture = dayofScheduledDeparture;
    }

    public String getMonthofScheduledDeparture() {
        return nullUpperCase(MonthofScheduledDeparture);
    }

    public void setMonthofScheduledDeparture(String monthofScheduledDeparture) {
        MonthofScheduledDeparture = monthofScheduledDeparture;
    }


}
