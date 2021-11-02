package com.vdm.msgwebservice.model.usm;

import lombok.Data;

import java.util.List;


@Data
public class UcmBody {
    private String TransmissionChannel;
    private boolean DeletedULD;
    private String CarrierCode;
    private String FlightNumberFirst;
    private String FlightNumberSecond;
    private String DayOfMonth;
    private String AircraftRegistration;
    private String AirportCode;
    private List<IN> IN;
    private List<OUT> OUT;
    private List<String> SIDetail;
}
