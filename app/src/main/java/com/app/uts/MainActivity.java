package com.app.uts;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    CardView Teams = findViewById(R.id.cardTeams);
    Teams.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick (View view){
            startActivity(new Intent(MainActivity.this, TeamsActivity.class));
    }
    });

    CardView Results = findViewById(R.id.cardResults);
    Results.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            startActivity(new Intent(MainActivity.this, ResultsActivity.class));
        }
    });

    CardView Standings = findViewById(R.id.cardStandings);
    Standings.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            startActivity(new Intent(MainActivity.this, StandingsActivity.class));
        }
    });

    CardView FootballNews = findViewById(R.id.cardArticles);
    FootballNews.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            startActivity(new Intent(MainActivity.this, NewsActivity.class));
        }
    });

    CardView Formation = findViewById(R.id.cardFormation);
    Formation.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            startActivity(new Intent(MainActivity.this, LineupActivity.class));
        }
    });

    CardView Exit = findViewById(R.id.cardExit);
    Exit.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            startActivity(new Intent(MainActivity.this, Exit.class));
        }
    });
    }
}