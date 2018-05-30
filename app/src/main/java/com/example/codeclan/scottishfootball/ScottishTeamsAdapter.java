package com.example.codeclan.scottishfootball;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class ScottishTeamsAdapter extends ArrayAdapter<Team> {

    public ScottishTeamsAdapter(Context context, ArrayList<Team> teams) {
        super(context, 0, teams);
    }

    @Override
    public View getView(int position, View listItemView, ViewGroup parent){
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.teams_item, parent, false);
        }

        Team currentTeam = getItem(position);

        TextView name = listItemView.findViewById(R.id.name);
        name.setText(currentTeam.getName());

        TextView colours = listItemView.findViewById(R.id.colours);
        colours.setText(currentTeam.getColours());

        TextView year = listItemView.findViewById(R.id.year);
        year.setText(currentTeam.getYear().toString());

        listItemView.setTag(currentTeam);

        return listItemView;
    }
}
