package com.app.uts;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ProfileActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile_activity);
        TextView tvDetail = findViewById(R.id.detailTextView);

        String detail = "Detail Not Set";

        Bundle extras = getIntent().getExtras();
        if(extras != null){
            detail = extras.getString("detail");
        }

        tvDetail.setText(detail);
    }
}


