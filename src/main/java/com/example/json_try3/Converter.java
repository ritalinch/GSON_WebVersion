package com.example.json_try3;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Converter {
    public static String getResult(String initString) {
        Gson gson = new GsonBuilder().create();
        return gson.fromJson(initString, Person.class).toString();
    }
}