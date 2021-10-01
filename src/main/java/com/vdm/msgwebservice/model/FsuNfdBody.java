package com.vdm.msgwebservice.model;

public class FsuNfdBody extends DrawBody {
    private String DayofNotification;
    private String MonthofNotification;
    private String ActualTimeofGivenStatusEvent;
    private String AirportCodeofNotification;

    public String getDayofNotification() {
        return DayofNotification;
    }

    public void setDayofNotification(String dayofNotification) {
        DayofNotification = dayofNotification;
    }

    public String getMonthofNotification() {
        return nullUpperCase(MonthofNotification);
    }

    public void setMonthofNotification(String monthofNotification) {
        MonthofNotification = monthofNotification;
    }

    public String getActualTimeofGivenStatusEvent() {
        return ActualTimeofGivenStatusEvent;
    }

    public void setActualTimeofGivenStatusEvent(String actualTimeofGivenStatusEvent) {
        ActualTimeofGivenStatusEvent = actualTimeofGivenStatusEvent;
    }

    public String getAirportCodeofNotification() {
        return nullUpperCase(AirportCodeofNotification);
    }

    public void setAirportCodeofNotification(String airportCodeofNotification) {
        AirportCodeofNotification = airportCodeofNotification;
    }
}
