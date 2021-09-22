package com.vdm.msgwebservice.model;


public class FsuDepBody extends DrawBody {
    private String CarrierCode;
    private String FlightNumber;
    private String DayofScheduledDeparture;
    private String MonthofScheduledDeparture;
    private String AirportCodeofDeparture;
    private String AirportCodeofArrival;

    public FsuDepBody() {
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

}
