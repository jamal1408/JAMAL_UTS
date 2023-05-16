package com.app.uts;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class TeamsActivity extends AppCompatActivity {

    private RecyclerView rvClub;
    private ClubAdapter.RecyclerViewClickListener listener;
    private final ArrayList<Club> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_club);

        rvClub = findViewById(R.id.rv_club);
        rvClub.setHasFixedSize(true);

        list.addAll(ClubData.getListData());
        showRecyclerList();
    }
    private void showRecyclerList(){
        setOnClickListener();
        rvClub.setLayoutManager(new LinearLayoutManager(this));
        ClubAdapter ClubAdapter = new ClubAdapter(list, listener);
        rvClub.setAdapter(ClubAdapter);
    }

    private void setOnClickListener() {
        listener = new ClubAdapter.RecyclerViewClickListener() {
            @Override
            public void onClick(View view, int position) {
                Intent intent = new Intent(getApplicationContext(), ProfileActivity.class);
                intent.putExtra("detail",list.get(position).getDetail());
                startActivity(intent);
            }
        };
    }
}