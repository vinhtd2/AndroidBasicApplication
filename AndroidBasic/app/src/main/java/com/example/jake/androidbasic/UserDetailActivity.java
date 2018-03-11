package com.example.jake.androidbasic;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/*
 * Created by jake on 10/03/2018.
 */

public class UserDetailActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_detail);

        Intent intent = getIntent();
        String name = intent.getStringExtra("hello name");
        String job = intent.getStringExtra("hello job");
        TextView nameShow = findViewById(R.id.text);
        TextView jobShow = findViewById(R.id.job);
        nameShow.setText(name);
        jobShow.setText(job);
    }
}
