package com.vdm.msgwebservice.model;

public class FsuDdlBody extends DrawBody {
    private String DayofDeliverytoconsigneesdoor;
    private String MonthofDeliverytoconsigneesdoor;
    private String ActualTimeofGivenStatusEvent;
    private String AirportCodeofDeliverytoconsigneesdoor;

    public String getDayofDeliverytoconsigneesdoor() {
        return DayofDeliverytoconsigneesdoor;
    }

    public void setDayofDeliverytoconsigneesdoor(String dayofDeliverytoconsigneesdoor) {
        DayofDeliverytoconsigneesdoor = dayofDeliverytoconsigneesdoor;
    }

    public String getMonthofDeliverytoconsigneesdoor() {
        return nullUpperCase(MonthofDeliverytoconsigneesdoor);
    }

    public void setMonthofDeliverytoconsigneesdoor(String monthofDeliverytoconsigneesdoor) {
        MonthofDeliverytoconsigneesdoor = monthofDeliverytoconsigneesdoor;
    }

    public String getActualTimeofGivenStatusEvent() {
        return ActualTimeofGivenStatusEvent;
    }

    public void setActualTimeofGivenStatusEvent(String actualTimeofGivenStatusEvent) {
        ActualTimeofGivenStatusEvent = actualTimeofGivenStatusEvent;
    }

    public String getAirportCodeofDeliverytoconsigneesdoor() {
        return nullUpperCase(AirportCodeofDeliverytoconsigneesdoor);
    }

    public void setAirportCodeofDeliverytoconsigneesdoor(String airportCodeofDeliverytoconsigneesdoor) {
        AirportCodeofDeliverytoconsigneesdoor = airportCodeofDeliverytoconsigneesdoor;
    }
}
