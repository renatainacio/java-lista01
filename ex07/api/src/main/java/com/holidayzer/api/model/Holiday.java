package com.holidayzer.api.model;

public class Holiday {
    private String date;
    private String description;

    public Holiday(String date, String description){
        this.date = date;
        this.description = description;
    }

    public String getDate(){
        return this.date;
    }

    public String getDescription(){
        return this.description;
    }

}
