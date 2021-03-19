package com.example.tourguide;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.tourguide.BeachesFragment;
import com.example.tourguide.EatsFragment;
import com.example.tourguide.HotelsFragment;
import com.example.tourguide.ToursFragment;

public class FragmentAdapter extends FragmentStateAdapter {

    public FragmentAdapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {

        switch (position) {
            case 1 :
                return new EatsFragment();
            case 2 :
                return new ToursFragment();
            case 3 :
                return new HotelsFragment();
        }
        return new BeachesFragment();
    }

    @Override
    public int getItemCount() {
        return 4;
    }
}
