package edu.utsa.cs3443.qcw519_lab6.model;

import android.graphics.Color;

public class Avenger extends Person{
    String name;
    String heightFeet;
    String heightInches;
    String weight;
    String alias;
    String power;
    Color dotColor;
    int latitude;
    int longitude;

    public Avenger(String name, String alias, String heightFeet, String heightInches, String weight, String power, int latitude, int longitude) {
        super(name, heightFeet, heightInches, weight);
        this.alias = alias;
        this.power = power;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHeightFeet() {
        return heightFeet;
    }

    public void setHeightFeet(String heightFeet) {
        this.heightFeet = heightFeet;
    }

    @Override
    public String getHeightInches() {
        return heightInches;
    }

    @Override
    public void setHeightInches(String heightInches) {
        this.heightInches = heightInches;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String isSpecialAbilities() {
        return power;
    }

    public void setSpecialAbilities(String power) {
        this.power = power;
    }

    public Color getDotColor() {
        return dotColor;
    }

    public void setDotColor(Color dotColor) {
        this.dotColor = dotColor;
    }

    public int getLatitude() {
        return latitude;
    }

    public void setLatitude(int latitude) {
        this.latitude = latitude;
    }

    public int getLongitude() {
        return longitude;
    }

    public void setLongitude(int longitude) {
        this.longitude = longitude;
    }

}
