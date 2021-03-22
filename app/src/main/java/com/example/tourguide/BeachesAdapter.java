package com.example.tourguide;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.ArrayAdapter;
import java.util.ArrayList;

public class BeachesAdapter extends ArrayAdapter<Beaches> {

    public BeachesAdapter(Context context, ArrayList<Beaches> beachesList) {
        super(context, 0, beachesList);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.beaches_list_items, parent, false);
        }

        Beaches currentBeaches = getItem(position);

        // Find the TextView
        TextView songTextView = (TextView) listItemView.findViewById(R.id.title_view);

        songTextView.setText(currentBeaches.getBeachTitle());

        // Find the TextView
        TextView artistTextView = (TextView) listItemView.findViewById(R.id.summary_view);

        artistTextView.setText(currentBeaches.getBeachSummary());

        return listItemView;
    }
}
