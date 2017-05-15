package com.example.enigma.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int ScoreTeamA = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showscore(View view) {
        displayForTeamA(ScoreTeamA);
        ScoreTeamA = ScoreTeamA + 2;

    }

    public void showscore1(View view) {
        displayForTeamA(ScoreTeamA);
        ScoreTeamA = ScoreTeamA + 2;

    }

    public void showscore3(View view) {
        displayForTeamA(ScoreTeamA);
        ScoreTeamA = ScoreTeamA + 3;
    }

    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }


}
