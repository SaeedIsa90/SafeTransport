package com.androiddevelopments.saeedisa.safetransport;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class TechMenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tech_menu);
    }

    public void studentList(View view) {
        Intent intent = new Intent(this, TecherStudenActivity.class);
        startActivity(intent);
    }
}

