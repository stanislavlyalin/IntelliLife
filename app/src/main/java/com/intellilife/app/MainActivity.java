package com.intellilife.app;

import java.util.Locale;

import android.support.v7.app.ActionBarActivity;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.view.Menu;
import android.view.MenuItem;


public class MainActivity extends ActionBarActivity {

    SectionsPagerAdapter mSectionsPagerAdapter;
    ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Create the adapter that will return a fragment for each of the three
        // primary sections of the activity.
        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());

        // Set up the ViewPager with the sections adapter.
        mViewPager = (ViewPager) findViewById(R.id.pager);
        mViewPager.setAdapter(mSectionsPagerAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public class SectionsPagerAdapter extends FragmentPagerAdapter {

        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {

            switch (position) {
                case 0: return GoalsFragment.newInstance();
                case 1: return TodayFragment.newInstance();
                case 2: return RegularFragment.newInstance();
            }
            return null;    // TODO: is this correct?
        }

        @Override
        public int getCount() {
            return 3;   // Show 3 total pages.
        }

        @Override
        public CharSequence getPageTitle(int position) {
            Locale l = Locale.getDefault();
            switch (position) {
                case 0: return getString(R.string.goals_tab_title).toUpperCase(l);
                case 1: return getString(R.string.today_tab_title).toUpperCase(l);
                case 2: return getString(R.string.regular_tab_title).toUpperCase(l);
            }
            return null;
        }
    }
}
