package com.example.codeclan.scottishfootball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ScottishTeamsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scottish_teams);

        ScottishTeams scottishTeams = new ScottishTeams();
        ArrayList<Team> teams = scottishTeams.getTeams();

        ScottishTeamsAdapter teamAdapter = new ScottishTeamsAdapter(this, teams);

        ListView listview = findViewById(R.id.teams);
        listview.setAdapter(teamAdapter);

    }
}
