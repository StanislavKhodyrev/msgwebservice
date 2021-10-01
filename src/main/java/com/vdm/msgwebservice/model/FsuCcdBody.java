package com.vdm.msgwebservice.model;

public class FsuCcdBody extends DrawBody {
    private String DayofClearance;
    private String MonthofClearance;
    private String ActualTimeofGivenStatusEvent;
    private String AirportCodeofClearance;

    public String getDayofClearance() {
        return DayofClearance;
    }

    public void setDayofClearance(String dayofClearance) {
        DayofClearance = dayofClearance;
    }

    public String getMonthofClearance() {
        return nullUpperCase(MonthofClearance);
    }

    public void setMonthofClearance(String monthofClearance) {
        MonthofClearance = monthofClearance;
    }

    public String getActualTimeofGivenStatusEvent() {
        return ActualTimeofGivenStatusEvent;
    }

    public void setActualTimeofGivenStatusEvent(String actualTimeofGivenStatusEvent) {
        ActualTimeofGivenStatusEvent = actualTimeofGivenStatusEvent;
    }

    public String getAirportCodeofClearance() {
        return nullUpperCase(AirportCodeofClearance);
    }

    public void setAirportCodeofClearance(String airportCodeofClearance) {
        AirportCodeofClearance = airportCodeofClearance;
    }
}
