package com.primeride.model;

public class Driver {
    private String id;
    private String name;
    private double rating;
    private String car;
    private String license;
    private boolean isAvailable;

    public Driver(String id, String name, double rating, String car, String license, boolean isAvailable) {
        this.id = id;
        this.name = name;
        this.rating = rating;
        this.car = car;
        this.license = license;
        this.isAvailable = isAvailable;
    }

    // Getters and Setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public double getRating() { return rating; }
    public void setRating(double rating) { this.rating = rating; }

    public String getCar() { return car; }
    public void setCar(String car) { this.car = car; }

    public String getLicense() { return license; }
    public void setLicense(String license) { this.license = license; }

    public boolean isAvailable() { return isAvailable; }
    public void setAvailable(boolean available) { isAvailable = available; }

    @Override
    public String toString() {
        return id + "," + name + "," + rating + "," + car + "," + license + "," + isAvailable;
    }

    public static Driver fromString(String line) {
        String[] parts = line.split(",");
        return new Driver(parts[0], parts[1], Double.parseDouble(parts[2]), parts[3], parts[4], Boolean.parseBoolean(parts[5]));
    }
}