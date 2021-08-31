package com.example.Airlines.models;

import javax.persistence.Entity;

@Entity
public class Airplane {
    private int id;
    private String type;
    private String plateName;
    private int fuel;

    public Airplane(int id, String type, String plateName, int fuel) {
        this.id = id;
        this.type = type;
        this.plateName = plateName;
        this.fuel = fuel;
    }
    public Airplane(){

    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPlateName() {
        return plateName;
    }

    public void setPlateName(String plateName) {
        this.plateName = plateName;
    }

    public int getFuel() {
        return fuel;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }


}
