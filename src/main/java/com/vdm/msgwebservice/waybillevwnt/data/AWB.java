package com.vdm.msgwebservice.waybillevwnt.data;

public class AWB {
    private String awb_num;
    private String awborigin;
    private String awbdestination;
    private Integer awbpieces;
    private Integer awbweight;
    private Integer volume;

    public String getAwb_num() {
        return awb_num;
    }

    public void setAwb_num(String awb_num) {
        this.awb_num = awb_num;
    }

    public String getAwborigin() {
        return awborigin;
    }

    public void setAwborigin(String awborigin) {
        this.awborigin = awborigin;
    }

    public String getAwbdestination() {
        return awbdestination;
    }

    public void setAwbdestination(String awbdestination) {
        this.awbdestination = awbdestination;
    }

    public Integer getAwbpieces() {
        return awbpieces;
    }

    public void setAwbpieces(Integer awbpieces) {
        this.awbpieces = awbpieces;
    }

    public Integer getAwbweight() {
        return awbweight;
    }

    public void setAwbweight(Integer awbweight) {
        this.awbweight = awbweight;
    }

    public Integer getVolume() {
        return volume;
    }

    public void setVolume(Integer volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "AWB{" +
                "awb_num='" + awb_num + '\'' +
                ", awborigin='" + awborigin + '\'' +
                ", awbdestination='" + awbdestination + '\'' +
                ", awbpieces=" + awbpieces +
                ", awbweight=" + awbweight +
                ", volume=" + volume +
                '}';
    }
}
