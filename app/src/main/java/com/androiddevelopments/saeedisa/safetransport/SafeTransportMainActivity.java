package com.androiddevelopments.saeedisa.safetransport;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;

public class SafeTransportMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_safe_transport_main);
    }

    public void login(View view) {
        Intent intent = new Intent(this, TechMenuActivity.class);
        startActivity(intent);
    }
}
