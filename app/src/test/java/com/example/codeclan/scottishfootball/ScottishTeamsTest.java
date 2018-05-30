package com.example.codeclan.scottishfootball;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ScottishTeamsTest {

    @Test
    public void getTeamListTest(){
        ScottishTeams scottishTeams = new ScottishTeams();
        assertEquals(7, scottishTeams.getTeams().size());
    }
}
