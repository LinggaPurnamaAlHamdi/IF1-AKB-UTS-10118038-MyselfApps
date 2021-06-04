/*
Tanggal pengerjaan : 1 Juni 2021
        NIM : 10118038
        Nama : Lingga Purnama Al Hamdi
        Kelas : IF-1
*/
package com.example.myselfapps;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.myselfapps.fragments.Fragment1;
import com.example.myselfapps.fragments.Fragment2;
import com.example.myselfapps.fragments.Fragment3;

import java.util.ArrayList;
import java.util.List;

public class Walkthrough extends AppCompatActivity {

    private ViewPager pager;
    private PagerAdapter pagerAdapter;

    TextView counter;
    Button btn1;
    int total = 3, count = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_walkthrough);

        List<Fragment> list = new ArrayList<>();
        list.add(new Fragment1());
        list.add(new Fragment2());
        list.add(new Fragment3());

        counter = findViewById(R.id.counter);
        counter.setText(count+"/"+total);
        btn1 = findViewById(R.id.btn1);

        pager = findViewById(R.id.pager);
        pagerAdapter = new SlidePager(getSupportFragmentManager(),list);

        pager.setAdapter(pagerAdapter);

        pager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                count = 0;
                count = position + 1;
                counter.setText(count+"/"+total);

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }

    public void skip(View view) {
        Intent intent1 = new Intent(Walkthrough.this, Menu.class);
        startActivity(intent1);
        finish();
    }
}