package com.example.adapterbasedviewwithdelegation.activities;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toolbar;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.adapterbasedviewwithdelegation.R;
import com.example.adapterbasedviewwithdelegation.adapter.EventListAdapter;
import com.example.adapterbasedviewwithdelegation.delegate.EventItemDelegate;

public class CarRentalActivity extends AppCompatActivity implements EventItemDelegate {

    @SuppressLint("WrongConstant")
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_car_rental);
      /*  Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);*/

        RecyclerView rvEvents = findViewById(R.id.rv_event);
        rvEvents.setLayoutManager(new LinearLayoutManager(getApplicationContext(),LinearLayoutManager.VERTICAL,false));

        EventListAdapter eventListAdapter = new EventListAdapter(this);
        rvEvents.setAdapter(eventListAdapter);


    }

    private void setSupportActionBar(Toolbar toolbar) {
    }

    @Override
    public void onTapEventItem() {
        startActivity(new Intent(this,CarRentalDetailActivity.class));
    }
}
