package com.example.tourguide;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class HotelsFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_hotels, container, false);

        ArrayList<Items> itemsList = new ArrayList<>();

        itemsList.add(new Items(getString(R.string.tropicon), (getString(R.string.trpiconHotel)), R.drawable.tropicon_hotel, getString(R.string.tropiconAddress)));
        itemsList.add(new Items(getString(R.string.paramar), (getString(R.string.theParamar)), R.drawable.paramar, getString(R.string.paramarAddress)));
        itemsList.add(new Items(getString(R.string.flamingo), (getString(R.string.flamingoVallarta)), R.drawable.flamingo_vallarta, getString(R.string.flamingoAddress)));
        itemsList.add(new Items(getString(R.string.secrets), (getString(R.string.secretsSummary)), R.drawable.secrets, getString(R.string.secretsAddress)));
        itemsList.add(new Items(getString(R.string.fiesta), (getString(R.string.fiestaInnSummary)), R.drawable.fiesta_inn, getString(R.string.fiestaAddress)));
        itemsList.add(new Items(getString(R.string.hacienda), (getString(R.string.haciendaSummary)), R.drawable.hacienda, getString(R.string.haciendaAddress)));

        ItemsAdapter adapter = new ItemsAdapter(getActivity(), itemsList);

        ListView listview = rootView.findViewById(R.id.hotels_list_view);

        listview.setAdapter(adapter);

        return rootView;
    }
}