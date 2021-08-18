package com.srlocator.srLocator.dao;
/*
* Optimize with lombok and jpa
* */
public class Location {

    int id;
    User user;
    double latitude;
    double longitude;
    long lastUpdatedEpoc;

    public Location() {
    }

    public Location(int id, User user, double latitude, double longitude, long lastUpdatedEpoc) {
        this.id = id;
        this.user = user;
        this.latitude = latitude;
        this.longitude = longitude;
        this.lastUpdatedEpoc = lastUpdatedEpoc;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public long getLastUpdatedEpoc() {
        return lastUpdatedEpoc;
    }

    public void setLastUpdatedEpoc(long lastUpdatedEpoc) {
        this.lastUpdatedEpoc = lastUpdatedEpoc;
    }
}