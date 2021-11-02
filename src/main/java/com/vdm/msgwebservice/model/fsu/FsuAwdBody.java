package com.vdm.msgwebservice.model.fsu;

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
        return nullUpperCase(MonthofDelivery);
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
        return nullUpperCase(AirportCodeofDelivery);
    }

    public void setAirportCodeofDelivery(String airportCodeofDelivery) {
        AirportCodeofDelivery = airportCodeofDelivery;
    }
}
