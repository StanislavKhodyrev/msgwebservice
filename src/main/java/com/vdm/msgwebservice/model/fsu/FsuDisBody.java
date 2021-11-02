package com.vdm.msgwebservice.model.fsu;

public class FsuDisBody extends DrawBody {
    private String CarrierCode;
    private String FlightNumber;
    private String DayofDiscrepancy;
    private String MonthofDiscrepancy;
    private String ActualTimeofGivenStatusEvent;
    private String AirportCodeofDiscrepancy;
    private String DiscrepancyCode;

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

    public String getDayofDiscrepancy() {
        return DayofDiscrepancy;
    }

    public void setDayofDiscrepancy(String dayofDiscrepancy) {
        DayofDiscrepancy = dayofDiscrepancy;
    }

    public String getMonthofDiscrepancy() {
        return nullUpperCase(MonthofDiscrepancy);
    }

    public void setMonthofDiscrepancy(String monthofDiscrepancy) {
        MonthofDiscrepancy = monthofDiscrepancy;
    }

    public String getActualTimeofGivenStatusEvent() {
        return ActualTimeofGivenStatusEvent;
    }

    public void setActualTimeofGivenStatusEvent(String actualTimeofGivenStatusEvent) {
        ActualTimeofGivenStatusEvent = actualTimeofGivenStatusEvent;
    }

    public String getAirportCodeofDiscrepancy() {
        return nullUpperCase(AirportCodeofDiscrepancy);
    }

    public void setAirportCodeofDiscrepancy(String airportCodeofDiscrepancy) {
        AirportCodeofDiscrepancy = airportCodeofDiscrepancy;
    }

    public String getDiscrepancyCode() {
        return nullUpperCase(DiscrepancyCode);
    }

    public void setDiscrepancyCode(String discrepancyCode) {
        DiscrepancyCode = discrepancyCode;
    }

}
