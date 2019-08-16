package com.example.adapterbasedviewwithdelegation.views.holder;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.adapterbasedviewwithdelegation.delegate.EventItemDelegate;

public class EventItemViewHolder extends RecyclerView.ViewHolder {
    private EventItemDelegate mEventItemDelegate;

    public EventItemViewHolder(@NonNull View itemView,EventItemDelegate eventItemDelegate) {
        super(itemView);
        mEventItemDelegate = eventItemDelegate;

        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mEventItemDelegate.onTapEventItem();
            }
        });
    }
}
