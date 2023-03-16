package com.example.evchargingstation;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Station {

    @Id
    private String station_id;
    private String station_name;
    private String station_image;
    private String station_pricing;
    private String station_address;

    public String getStation_id() {
        return station_id;
    }

    public void setStation_id(String station_id) {
        this.station_id = station_id;
    }

    public String getStation_name() {
        return station_name;
    }

    public void setStation_name(String station_name) {
        this.station_name = station_name;
    }

    public String getStation_image() {
        return station_image;
    }

    public void setStation_image(String station_image) {
        this.station_image = station_image;
    }

    public String getStation_pricing() {
        return station_pricing;
    }

    public void setStation_pricing(String station_pricing) {
        this.station_pricing = station_pricing;
    }

    public String getStation_address() {
        return station_address;
    }

    public void setStation_address(String station_address) {
        this.station_address = station_address;
    }

    public Station(String station_id, String station_name, String station_image, String station_pricing, String station_address) {
        this.station_id = station_id;
        this.station_name = station_name;
        this.station_image = station_image;
        this.station_pricing = station_pricing;
        this.station_address = station_address;
    }
    public Station(){
    }
}
