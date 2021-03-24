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
        View rootView = inflater.inflate(R.layout.fragment_beaches, container, false);

        ArrayList<Items> itemsList = new ArrayList<>();

        itemsList.add(new Items(getString(R.string.LosMuertosTitle), (getString(R.string.LosMuertos)), R.drawable.los_muertos));
        itemsList.add(new Items(getString(R.string.ChinasBeachTitle), (getString(R.string.ConchasChinasBeach)), R.drawable.conchas_chinas));
        itemsList.add(new Items(getString(R.string.CamaronesTitle), (getString(R.string.PlayaCamarones)), R.drawable.playa_camarones));
        itemsList.add(new Items(getString(R.string.AmapasTitle), (getString(R.string.LasAmapas)), R.drawable.playa_amapas));
        itemsList.add(new Items(getString(R.string.DestiladerasTitle), (getString(R.string.PlayaDestiladeras)), R.drawable.destiladeras));
        itemsList.add(new Items(getString(R.string.OroTitle), (getString(R.string.PlayaDeOro)), R.drawable.playa_oro));

        ItemsAdapter adapter = new ItemsAdapter(getActivity(), itemsList);

        ListView listview = rootView.findViewById(R.id.beach_list_view);

        listview.setAdapter(adapter);

        return rootView;

    }
}