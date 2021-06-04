/*
Tanggal pengerjaan : 1 Juni 2021
        NIM : 10118038
        Nama : Lingga Purnama Al Hamdi
        Kelas : IF-1
*/
package com.example.myselfapps;


import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.fragment.app.ListFragment;

import java.util.List;

public class SlidePager extends FragmentStatePagerAdapter {

    private List<Fragment> fragmentList;

    public SlidePager(FragmentManager fm, List<Fragment> fragmentList) {
        super(fm);
        this.fragmentList = fragmentList;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) { return fragmentList.get(position);}

    @Override
    public int getCount() { return fragmentList.size();}
}
