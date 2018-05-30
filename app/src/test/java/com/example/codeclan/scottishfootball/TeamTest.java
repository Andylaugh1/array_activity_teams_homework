package com.example.codeclan.scottishfootball;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TeamTest {

    Team team;

    @Before
    public void before(){
        team = new Team("Celtic", "Green and White", 1888);
    }

    @Test
    public void getNameTest(){
        assertEquals("Celtic", team.getName());
    }

    @Test
    public void getColoursTest(){
        assertEquals("Green and White", team.getColours());
    }

    @Test
    public void getYearTest(){
        assertEquals((Integer)1888, team.getYear());
    }
}
