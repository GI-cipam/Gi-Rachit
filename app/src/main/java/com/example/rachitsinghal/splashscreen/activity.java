package com.example.rachitsinghal.splashscreen;

import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.sembozdemir.viewpagerarrowindicator.library.ViewPagerArrowIndicator;

public class activity extends FragmentActivity {

    ViewPager viewPager;
    ViewPagerArrowIndicator viewPagerArrowIndicator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity);
        viewPager=(ViewPager)findViewById(R.id.viewPager);
        viewPagerArrowIndicator = (ViewPagerArrowIndicator) findViewById(R.id.viewPagerArrowIndicator);
        SwipeAdapter swipeAdapter=new SwipeAdapter(getSupportFragmentManager());
        viewPager.setAdapter(swipeAdapter);
        viewPagerArrowIndicator.bind(viewPager);
    }
}
