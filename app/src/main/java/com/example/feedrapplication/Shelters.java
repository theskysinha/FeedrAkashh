package com.example.feedrapplication;

import java.util.ArrayList;

public class Shelters {
    ArrayList<String> stringArray = new ArrayList<String>();

    public Shelters() {
    }

    public Shelters(String email, String name, String type, String location) {
        this.name = name;
        this.location = location;
    }
}
