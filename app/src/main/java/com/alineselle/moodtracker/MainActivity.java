package com.alineselle.moodtracker;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.mancj.slideup.SlideUp;

import static com.alineselle.moodtracker.R.drawable.smiley_super_happy;

public class MainActivity extends AppCompatActivity {

    private ViewPager mViewPager;
    private ImageAdapter mAdapter;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       mViewPager = findViewById(R.id.viewPager);
        mAdapter = new ImageAdapter(this);

        mViewPager.setAdapter(mAdapter);

        //this methode is used to set up the app with the second smile
        mViewPager.setCurrentItem(1);


    }
}
