package com.example.viola.menuagain;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class PagerAdapter extends FragmentStatePagerAdapter {
    int numOfTabs;

    public PagerAdapter(FragmentManager fm, int numOfTabs){
        super(fm);
        this.numOfTabs = numOfTabs;
    }

    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                AppetizerFragment aTab = new AppetizerFragment();
                return aTab;
            case 1:
                EntreeFragment eTab= new EntreeFragment();
                return eTab;
            case 2:
                DessertFragment dTab = new DessertFragment();
                return dTab;
            default:
                return null;
        }
    }

    public int getCount(){
        return numOfTabs;
    }
}
