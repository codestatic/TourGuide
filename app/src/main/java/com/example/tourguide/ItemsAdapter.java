package com.example.tourguide;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

public class ItemsAdapter extends ArrayAdapter<Items> {

    public ItemsAdapter(Context context, ArrayList<Items> itemsList) {
        super(context, 0, itemsList);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_items, parent, false);
        }

        Items currentItems = getItem(position);

        // Find the TextView
        TextView titleTextView = (TextView) listItemView.findViewById(R.id.title_view);

        titleTextView.setText(currentItems.getItemsTitle());

        // Find the TextView
        TextView summaryTextView = (TextView) listItemView.findViewById(R.id.summary_view);

        summaryTextView.setText(currentItems.getItemsSummary());

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image_view);

        imageView.setImageResource(currentItems.getItemsBeach());

        TextView addressTextView = (TextView) listItemView.findViewById(R.id.address_phone);

        // Check if an image is provided for this word or not
        if (currentItems.hasText()) {
            // If an image is available, display the provided image based on the resource ID
            addressTextView.setText(currentItems.getAddressPhone());
            // Make sure the view is visible
            addressTextView.setVisibility(View.VISIBLE);
        } else {
            // Otherwise hide the ImageView (set visibility to GONE)
            addressTextView.setVisibility(View.GONE);
        }
        return listItemView;
    }
}
