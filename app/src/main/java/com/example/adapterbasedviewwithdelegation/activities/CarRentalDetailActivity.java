package com.example.adapterbasedviewwithdelegation.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.adapterbasedviewwithdelegation.R;

public class CarRentalDetailActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_car_rental_detail);

        ImageView crossBtn = findViewById(R.id.iv_cross_btn);
        crossBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(CarRentalDetailActivity.this,CarRentalActivity.class));
                finish();
            }
        });
    }
}
