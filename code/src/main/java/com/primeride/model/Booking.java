package com.primeride.model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Booking {
    private String bookingId;
    private String pickup;
    private String destination;
    private LocalDateTime dateTime;
    private String rideType;
    private String status;
    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

    public Booking(String bookingId, String pickup, String destination, LocalDateTime dateTime, String rideType, String status) {
        this.bookingId = bookingId;
        this.pickup = pickup;
        this.destination = destination;
        this.dateTime = dateTime;
        this.rideType = rideType;
        this.status = status;
    }

    // Getters and Setters
    public String getBookingId() { return bookingId; }
    public void setBookingId(String bookingId) { this.bookingId = bookingId; }

    public String getPickup() { return pickup; }
    public void setPickup(String pickup) { this.pickup = pickup; }

    public String getDestination() { return destination; }
    public void setDestination(String destination) { this.destination = destination; }

    public LocalDateTime getDateTime() { return dateTime; }
    public void setDateTime(LocalDateTime dateTime) { this.dateTime = dateTime; }

    public String getRideType() { return rideType; }
    public void setRideType(String rideType) { this.rideType = rideType; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    @Override
    public String toString() {
        return bookingId + "," + pickup + "," + destination + "," + dateTime.format(FORMATTER) + "," + rideType + "," + status;
    }

    public static Booking fromString(String line) {
        String[] parts = line.split(",");
        LocalDateTime dateTime = LocalDateTime.parse(parts[3], FORMATTER);
        return new Booking(parts[0], parts[1], parts[2], dateTime, parts[4], parts[5]);
    }
}