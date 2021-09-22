package com.vdm.msgwebservice.model;

public class FsuAwdBody extends DrawBody{
    private String DayofDelivery;
    private String MonthofDelivery;
    private String ActualTimeofGivenStatusEvent;
    private String AirportCodeofDelivery;

    public FsuAwdBody() {
    }

    public String getDayofDelivery() {
        return DayofDelivery;
    }

    public void setDayofDelivery(String dayofDelivery) {
        DayofDelivery = dayofDelivery;
    }

    public String getMonthofDelivery() {
        return MonthofDelivery;
    }

    public void setMonthofDelivery(String monthofDelivery) {
        MonthofDelivery = monthofDelivery;
    }

    public String getActualTimeofGivenStatusEvent() {
        return ActualTimeofGivenStatusEvent;
    }

    public void setActualTimeofGivenStatusEvent(String actualTimeofGivenStatusEvent) {
        ActualTimeofGivenStatusEvent = actualTimeofGivenStatusEvent;
    }

    public String getAirportCodeofDelivery() {
        return AirportCodeofDelivery;
    }

    public void setAirportCodeofDelivery(String airportCodeofDelivery) {
        AirportCodeofDelivery = airportCodeofDelivery;
    }
}
