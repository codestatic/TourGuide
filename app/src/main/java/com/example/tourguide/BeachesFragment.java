package com.example.tourguide;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;

import java.util.ArrayList;

public class BeachesFragment extends Fragment {

    FragmentAdapter fragmentAdapter;
    ViewPager2 pager2;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView =  inflater.inflate(R.layout.fragment_beaches, container, false);

        ArrayList<Beaches> beachesList = new ArrayList<>();

        beachesList.add(new Beaches("beaches title 1", "beaches summary 1", R.drawable.beach_temp));
        beachesList.add(new Beaches("beaches title 2", "beaches summary 2", R.drawable.beach_temp));
        beachesList.add(new Beaches("beaches title 3", "beaches summary 3", R.drawable.beach_temp));
        beachesList.add(new Beaches("beaches title 4", "beaches summary 4", R.drawable.beach_temp));
        beachesList.add(new Beaches("beaches title 5", "beaches summary 5", R.drawable.beach_temp));
        beachesList.add(new Beaches("beaches title 6", "beaches summary 6", R.drawable.beach_temp));

        BeachesAdapter adapter = new BeachesAdapter(getActivity(), beachesList);

        ListView listview = rootView.findViewById(R.id.beach_list_view);

        listview.setAdapter(adapter);

        return rootView;

    }
}