package com.example.rachitsinghal.splashscreen;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by Rachit Singhal on 27-12-2017.
 */

public class SwipeAdapter extends FragmentStatePagerAdapter {
    public SwipeAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                // current main fragment showing how to send arguments to fragment
                Fragment fragment = new firstFragment();
                Bundle data = new Bundle();
                data.putInt("current_page", position + 1);
                fragment.setArguments(data);
                return fragment;
            case 1:
                // Calling a Fragment without sending arguments
                return new secondFragment();
            case 2:
                // Calling a Fragment without sending arguments
                return new thirdFragment();

            default:
                return null;

        }
    }

    @Override
    public int getCount() {
        return 3;
    }
}
