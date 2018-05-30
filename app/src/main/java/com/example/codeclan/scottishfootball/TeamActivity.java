package com.example.codeclan.scottishfootball;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class TeamActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_team);

        Intent intent = getIntent();
        Team team = (Team)intent.getSerializableExtra("team");
        Log.d("TeamActivity: ", team.getName());
    }

    
}
