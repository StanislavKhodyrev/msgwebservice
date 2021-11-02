package com.vdm.msgwebservice.model.usm;

import lombok.Data;

import java.util.List;

@Data
public class OUT {
    private List<OUT.Element> Element;

    @Data
    public class Element {
        private String ULDIATACode;
        private String ULDSerialNumber;
        private String ULDOwnerCode;
        private String AirportCodeofUnloading;
        private String ContentCode;
    }
}
