package com.vdm.msgwebservice.waybillevwnt.data;

import java.sql.Timestamp;

public class Segments {
    private String origin;
    private String dest;
    private String flightNum;
    private String flightCat;
    private String flightDate;
    private String arrivalDate;
    private Timestamp arrivalTime;
    private Integer numPieces;
    private Integer weight;
    private Integer volume;
    private String status;
    private String eventDate;
    private String eventTime;
    private String statusCode;


    public Segments(String origin, String dest, String flightNum, String flightCat, String flightDate, String arrivalDate, Timestamp arrivalTime, Integer numPieces, Integer weight, Integer volume, String status, String eventDate, String eventTime, String statusCode) {
        this.origin = origin;
        this.dest = dest;
        this.flightNum = flightNum;
        this.flightCat = flightCat;
        this.flightDate = flightDate;
        this.arrivalDate = arrivalDate;
        this.arrivalTime = arrivalTime;
        this.numPieces = numPieces;
        this.weight = weight;
        this.volume = volume;
        this.status = status;
        this.eventDate = eventDate;
        this.eventTime = eventTime;
        this.statusCode = statusCode;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDest() {
        return dest;
    }

    public void setDest(String dest) {
        this.dest = dest;
    }

    public String getFlightNum() {
        return flightNum;
    }

    public void setFlightNum(String flightNum) {
        this.flightNum = flightNum;
    }

    public String getFlightCat() {
        return flightCat;
    }

    public void setFlightCat(String flightCat) {
        this.flightCat = flightCat;
    }

    public String getFlightDate() {
        return flightDate;
    }

    public void setFlightDate(String flightDate) {
        this.flightDate = flightDate;
    }

    public String getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(String arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public Timestamp getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(Timestamp arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public Integer getNumPieces() {
        return numPieces;
    }

    public void setNumPieces(Integer numPieces) {
        this.numPieces = numPieces;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getEventDate() {
        return eventDate;
    }

    public void setEventDate(String eventDate) {
        this.eventDate = eventDate;
    }

    public String getEventTime() {
        return eventTime;
    }

    public void setEventTime(String eventTime) {
        this.eventTime = eventTime;
    }

    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }
}
