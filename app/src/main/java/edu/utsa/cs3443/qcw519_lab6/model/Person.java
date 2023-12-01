package edu.utsa.cs3443.qcw519_lab6.model;

import android.widget.ImageView;

public abstract class Person {
    String name;
    String heightFeet;
    String heightInches;
    String weight;
    ImageView recentPhoto;

//or some way to implement the photo

    public Person(String name, String heightFeet, String heightInches, String weight) {
        this.name = name;
        this.heightFeet = heightFeet;
        this.heightInches = heightInches;
        this.weight = weight;
    }

    public String getHeightInches() {
        return heightInches;
    }

    public void setHeightInches(String heightInches) {
        this.heightInches = heightInches;
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

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public ImageView getRecentPhoto() {
        return recentPhoto;
    }

    public void setRecentPhoto(ImageView recentPhoto) {
        this.recentPhoto = recentPhoto;
    }

}
