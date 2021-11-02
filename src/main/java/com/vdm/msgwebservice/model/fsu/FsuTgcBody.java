package com.vdm.msgwebservice.model.fsu;

public class FsuTgcBody extends DrawBody{

    private String CarrierCode;
    private String DayofTransfer;
    private String MonthofTransfer;
    private String ActualTimeofGivenStatusEvent;
    private String AirportCodeofTransfer;

    public FsuTgcBody() {
    }

    public String getCarrierCode() {
        return nullUpperCase(CarrierCode);
    }

    public void setCarrierCode(String carrierCode) {
        CarrierCode = carrierCode;
    }


    public String getDayofTransfer() {
        return DayofTransfer;
    }

    public void setDayofTransfer(String dayofTransfer) {
        DayofTransfer = dayofTransfer;
    }

    public String getMonthofTransfer() {
        return nullUpperCase(MonthofTransfer);
    }

    public void setMonthofTransfer(String monthofTransfer) {
        MonthofTransfer = monthofTransfer;
    }

    public String getActualTimeofGivenStatusEvent() {
        return ActualTimeofGivenStatusEvent;
    }

    public void setActualTimeofGivenStatusEvent(String actualTimeofGivenStatusEvent) {
        ActualTimeofGivenStatusEvent = actualTimeofGivenStatusEvent;
    }

    public String getAirportCodeofTransfer() {
        return nullUpperCase(AirportCodeofTransfer);
    }

    public void setAirportCodeofTransfer(String airportCodeofTransfer) {
        AirportCodeofTransfer = airportCodeofTransfer;
    }
}
