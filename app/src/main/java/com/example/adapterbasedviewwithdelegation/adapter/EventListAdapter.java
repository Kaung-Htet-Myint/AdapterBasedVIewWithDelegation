package com.example.adapterbasedviewwithdelegation.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.adapterbasedviewwithdelegation.R;
import com.example.adapterbasedviewwithdelegation.activities.CarRentalActivity;
import com.example.adapterbasedviewwithdelegation.delegate.EventItemDelegate;
import com.example.adapterbasedviewwithdelegation.views.holder.EventItemViewHolder;

public class EventListAdapter extends RecyclerView.Adapter {
    EventItemDelegate mEventItemDelegate;

    public EventListAdapter(EventItemDelegate mEventItemDelegate) {
        this.mEventItemDelegate = mEventItemDelegate;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.car_rental_item_view,parent,false);
        return new EventItemViewHolder(itemView,mEventItemDelegate);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 10;
    }
}

