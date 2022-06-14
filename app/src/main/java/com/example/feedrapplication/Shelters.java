package com.example.feedrapplication;

import java.util.ArrayList;

public class Shelters {
    public static ArrayList<String> names = new ArrayList<String>();
    public static ArrayList<String> locations = new ArrayList<String>();
    public static ArrayList<String> types = new ArrayList<String>();
    public Shelters() {
    }

    public Shelters(String name, String loc, String type) {
        names.add(name);
        locations.add(loc);
        types.add(type);
    }
}
