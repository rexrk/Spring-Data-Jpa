package com.raman.learnjpaandhibernate.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Characters {
    @Id
    private long id;
    private String name;
    private String power;
    private Boolean fruit_powers;

    public Characters() {}

    public Characters(long id, String name, String power, Boolean fruit_powers) {
        this.id = id;
        this.name = name;
        this.power = power;
        this.fruit_powers = fruit_powers;
    }

    public Long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public Boolean getFruit_powers() {
        return fruit_powers;
    }

    public void setFruit_powers(Boolean fruit_powers) {
        this.fruit_powers = fruit_powers;
    }

    @Override
    public String toString() {
        return "Characters{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", power='" + power + '\'' +
                ", fruit_power=" + fruit_powers +
                '}';
    }
}
