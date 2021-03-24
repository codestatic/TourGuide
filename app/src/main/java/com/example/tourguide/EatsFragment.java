package com.example.tourguide;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class EatsFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_eats, container, false);

        ArrayList<Items> itemsList = new ArrayList<>();

        itemsList.add(new Items(getString(R.string.LMBTitle), (getString(R.string.LosMuertosBrewing)), R.drawable.los_muertos_brewing, getString(R.string.losMuertosAddress)));
        itemsList.add(new Items(getString(R.string.madalena), (getString(R.string.laMadalena)), R.drawable.la_madalena, getString(R.string.madalenaAddress)));
        itemsList.add(new Items(getString(R.string.desArtistes), (getString(R.string.cafeDesArtistes)), R.drawable.cafe_des_artistes, getString(R.string.artistesAddress)));
        itemsList.add(new Items(getString(R.string.laLeche), (getString(R.string.laLecheSummary)), R.drawable.la_leche, getString(R.string.lecheAddress)));
        itemsList.add(new Items(getString(R.string.greenPlace), (getString(R.string.greenPlaceSummary)), R.drawable.green_place, getString(R.string.greenAddress)));
        itemsList.add(new Items(getString(R.string.CasaTradicional), (getString(R.string.casaTradicional)), R.drawable.casa_tradicional_cocina, getString(R.string.tradicionalAddress)));

        ItemsAdapter adapter = new ItemsAdapter(getActivity(), itemsList);

        ListView listview = rootView.findViewById(R.id.eats_list_view);

        listview.setAdapter(adapter);

        return rootView;

    }
}