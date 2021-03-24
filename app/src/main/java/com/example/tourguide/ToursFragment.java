package com.example.tourguide;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class ToursFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_tours, container, false);

        // new array list for tour info
        ArrayList<Items> itemsList = new ArrayList<>();

        itemsList.add(new Items(getString(R.string.zipLine), (getString(R.string.zipLineSummary)), R.drawable.zip_line));
        itemsList.add(new Items(getString(R.string.caletasBeach), (getString(R.string.caletasBeachSummary)), R.drawable.caletas_beach_hideaway));
        itemsList.add(new Items(getString(R.string.utv), (getString(R.string.utvSummary)), R.drawable.utv_tour));
        itemsList.add(new Items(getString(R.string.parasailing), (getString(R.string.parasailingSummary)), R.drawable.parasailing));
        itemsList.add(new Items(getString(R.string.scubaDive), (getString(R.string.scubaDiveSummary)), R.drawable.scuba_dive));
        itemsList.add(new Items(getString(R.string.fishing), (getString(R.string.fishingSummary)), R.drawable.fishing));

        // new adapter, setting the view and returning the view
        ItemsAdapter adapter = new ItemsAdapter(getActivity(), itemsList);

        ListView listview = rootView.findViewById(R.id.tours_list_view);

        listview.setAdapter(adapter);

        return rootView;
    }
}