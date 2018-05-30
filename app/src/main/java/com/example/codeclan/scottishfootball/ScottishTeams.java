package com.example.codeclan.scottishfootball;

import java.util.ArrayList;

public class ScottishTeams {

    private ArrayList<Team> teams;

    public ScottishTeams() {
        teams = new ArrayList<Team>();
        teams.add(new Team("Celtic", "Green and White", 1888));
        teams.add(new Team("Rangers", "Light Blue", 2012));
        teams.add(new Team("Aberdeen", "Red", 1903));
        teams.add(new Team("Hibernian", "Green and White", 1875));
        teams.add(new Team("Heart of Midlothian", "Maroon and White", 1874));
        teams.add(new Team("Kilmarnock", "Blue and White", 1869));
        teams.add(new Team("Motherwell", "Maroon and Gold", 1886));
    }

    public ArrayList<Team> getTeams() {
        return new ArrayList<Team>(teams);
    }
}
