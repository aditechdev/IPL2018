package com.example.android.ipl2018;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public int scoreTeamA;
    public int scoreTeamB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    //Displays the given score for Team A.
    public void addOnePointsToA(View v) {
        scoreTeamA++;
        displayForTeamA(scoreTeamA);
    }

    public void addTwoPointsToA(View v) {
        scoreTeamA = +2;
        displayForTeamA(scoreTeamA);
    }

    public void addFourPointsToA(View v) {
        scoreTeamA = +4;
        displayForTeamA(scoreTeamA);
    }

    public void addSixPointsToA(View v) {
        scoreTeamA = +6;
        displayForTeamA(scoreTeamA);
    }

    //**display the score of team b//
    public void addOnePointsToB(View v) {
        scoreTeamB = +1;
        displayForTeamB(scoreTeamB);
    }

    public void addTwoPointsToB(View v) {
        scoreTeamB = +2;
        displayForTeamB(scoreTeamB);
    }

    public void addFourPointsToB(View v) {
        scoreTeamB = +4;
        displayForTeamB(scoreTeamB);
    }

    public void addSixPointsToB(View v) {
        scoreTeamB = +6;
        displayForTeamB(scoreTeamB);
    }

    //Reset score//
    public void reset_team_a_and_b(View v) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }

    // Display score for team A //
    public void displayForTeamA(int scoreTeamA) {
        TextView scoreViewA = findViewById(R.id.team_a_score);
        scoreViewA.setText(String.valueOf(scoreTeamA));
    }

    // Display score for team B //
    public void displayForTeamB(int scoreTeamB) {
        TextView scoreViewB = findViewById(R.id.team_b_score);
        scoreViewB.setText(String.valueOf(scoreTeamB));
    }

    //data save after rotation//
    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("countA", scoreTeamA);
        outState.putInt("countB", scoreTeamB);
    }

    // data restore //
    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        scoreTeamA = savedInstanceState.getInt("countA");
        scoreTeamB = savedInstanceState.getInt("countB");
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }
}