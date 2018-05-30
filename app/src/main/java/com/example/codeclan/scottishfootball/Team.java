package com.example.codeclan.scottishfootball;

public class Team {

    private String name;
    private String colours;
    private Integer year;

    public Team(String name, String colours, Integer year){
        this.name = name;
        this.colours = colours;
        this.year = year;

    }

    public String getName(){
        return name;
    }

    public String getColours(){
        return colours;
    }

    public Integer getYear(){
        return year;
    }


}
