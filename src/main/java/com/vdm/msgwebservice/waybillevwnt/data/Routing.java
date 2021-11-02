package com.vdm.msgwebservice.waybillevwnt.data;

import java.sql.Timestamp;

public class Routing {
    private String flightorigin;
    private String flightdest;
    private String flightnum;
    private String flightdate;
    private String alloc;
    private Integer pieces;
    private Integer weight;
    private Integer volume;
    private String flightcat;
    private String typeofdeparturetime;
    private String departuredate;
    private Timestamp departuretime;
    private String typeofarrivaltime;
    private String arrivaldate;
    private Timestamp arrivaltime;
    private String status;
    private String statusdesc;

    public Routing(String flightorigin, String flightdest, String flightnum, String flightdate, String alloc, Integer pieces, Integer weight, Integer volume, String flightcat, String typeofdeparturetime, String departuredate, Timestamp departuretime, String typeofarrivaltime, String arrivaldate, Timestamp arrivaltime, String status, String statusdesc) {
        this.flightorigin = flightorigin;
        this.flightdest = flightdest;
        this.flightnum = flightnum;
        this.flightdate = flightdate;
        this.alloc = alloc;
        this.pieces = pieces;
        this.weight = weight;
        this.volume = volume;
        this.flightcat = flightcat;
        this.typeofdeparturetime = typeofdeparturetime;
        this.departuredate = departuredate;
        this.departuretime = departuretime;
        this.typeofarrivaltime = typeofarrivaltime;
        this.arrivaldate = arrivaldate;
        this.arrivaltime = arrivaltime;
        this.status = status;
        this.statusdesc = statusdesc;
    }

    public String getFlightorigin() {
        return flightorigin;
    }

    public void setFlightorigin(String flightorigin) {
        this.flightorigin = flightorigin;
    }

    public String getFlightdest() {
        return flightdest;
    }

    public void setFlightdest(String flightdest) {
        this.flightdest = flightdest;
    }

    public String getFlightnum() {
        return flightnum;
    }

    public void setFlightnum(String flightnum) {
        this.flightnum = flightnum;
    }

    public String getFlightdate() {
        return flightdate;
    }

    public void setFlightdate(String flightdate) {
        this.flightdate = flightdate;
    }

    public String getAlloc() {
        return alloc;
    }

    public void setAlloc(String alloc) {
        this.alloc = alloc;
    }

    public Integer getPieces() {
        return pieces;
    }

    public void setPieces(Integer pieces) {
        this.pieces = pieces;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Integer getVolume() {
        return volume;
    }

    public void setVolume(Integer volume) {
        this.volume = volume;
    }

    public String getFlightcat() {
        return flightcat;
    }

    public void setFlightcat(String flightcat) {
        this.flightcat = flightcat;
    }

    public String getTypeofdeparturetime() {
        return typeofdeparturetime;
    }

    public void setTypeofdeparturetime(String typeofdeparturetime) {
        this.typeofdeparturetime = typeofdeparturetime;
    }

    public String getDeparturedate() {
        return departuredate;
    }

    public void setDeparturedate(String departuredate) {
        this.departuredate = departuredate;
    }

    public Timestamp getDeparturetime() {
        return departuretime;
    }

    public void setDeparturetime(Timestamp departuretime) {
        this.departuretime = departuretime;
    }

    public String getTypeofarrivaltime() {
        return typeofarrivaltime;
    }

    public void setTypeofarrivaltime(String typeofarrivaltime) {
        this.typeofarrivaltime = typeofarrivaltime;
    }

    public String getArrivaldate() {
        return arrivaldate;
    }

    public void setArrivaldate(String arrivaldate) {
        this.arrivaldate = arrivaldate;
    }

    public Timestamp getArrivaltime() {
        return arrivaltime;
    }

    public void setArrivaltime(Timestamp arrivaltime) {
        this.arrivaltime = arrivaltime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatusdesc() {
        return statusdesc;
    }

    public void setStatusdesc(String statusdesc) {
        this.statusdesc = statusdesc;
    }

    @Override
    public String toString() {
        return "Routing{" +
                "flightorigin='" + flightorigin + '\'' +
                ", flightdest='" + flightdest + '\'' +
                ", flightnum='" + flightnum + '\'' +
                ", flightdate='" + flightdate + '\'' +
                ", alloc='" + alloc + '\'' +
                ", pieces=" + pieces +
                ", weight=" + weight +
                ", volume=" + volume +
                ", flightcat='" + flightcat + '\'' +
                ", typeofdeparturetime='" + typeofdeparturetime + '\'' +
                ", departuredate='" + departuredate + '\'' +
                ", departuretime=" + departuretime +
                ", typeofarrivaltime='" + typeofarrivaltime + '\'' +
                ", arrivaldate='" + arrivaldate + '\'' +
                ", arrivaltime=" + arrivaltime +
                ", status='" + status + '\'' +
                ", statusdesc='" + statusdesc + '\'' +
                '}';
    }
}
