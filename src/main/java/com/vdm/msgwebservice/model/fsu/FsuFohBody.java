package com.vdm.msgwebservice.model.fsu;

public class FsuFohBody extends DrawBody {
    private String DayofReceipt;
    private String MonthofReceipt;
    private String ActualTimeofGivenStatusEvent;
    private String AirportCodeofReceipt;
    private String ReceivedfromDetail;


    public String getDayofReceipt() {
        return DayofReceipt;
    }

    public void setDayofReceipt(String dayofReceipt) {
        DayofReceipt = dayofReceipt;
    }

    public String getMonthofReceipt() {
        return nullUpperCase(MonthofReceipt);
    }

    public void setMonthofReceipt(String monthofReceipt) {
        MonthofReceipt = monthofReceipt;
    }

    public String getActualTimeofGivenStatusEvent() {
        return ActualTimeofGivenStatusEvent;
    }

    public void setActualTimeofGivenStatusEvent(String actualTimeofGivenStatusEvent) {
        ActualTimeofGivenStatusEvent = actualTimeofGivenStatusEvent;
    }

    public String getAirportCodeofReceipt() {
        return nullUpperCase(AirportCodeofReceipt);
    }

    public void setAirportCodeofReceipt(String airportCodeofReceipt) {
        AirportCodeofReceipt = airportCodeofReceipt;
    }

    public String getReceivedfromDetail() {
        return nullUpperCase(ReceivedfromDetail);
    }

    public void setReceivedfromDetail(String receivedfromDetail) {
        ReceivedfromDetail = receivedfromDetail;
    }
}
