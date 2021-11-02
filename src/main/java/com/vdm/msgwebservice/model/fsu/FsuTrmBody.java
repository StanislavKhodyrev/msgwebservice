package com.vdm.msgwebservice.model.fsu;

public class FsuTrmBody extends DrawBody {
    private String CarrierCode;
    private String AirportCodeofTransfer;

    public FsuTrmBody() {
    }

    public String getCarrierCode() {
        return nullUpperCase(CarrierCode);
    }

    public void setCarrierCode(String carrierCode) {
        CarrierCode = carrierCode;
    }

    public String getAirportCodeofTransfer() {
        return nullUpperCase(AirportCodeofTransfer);
    }

    public void setAirportCodeofTransfer(String airportCodeofTransfer) {
        AirportCodeofTransfer = airportCodeofTransfer;
    }
}
