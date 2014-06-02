package com.intellilife.app;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

// class describes plan for current day
class TodayFragment extends Fragment {

    public static TodayFragment newInstance() {
        TodayFragment fragment = new TodayFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);
        //TextView textView = (TextView) rootView.findViewById(R.id.tabTitleTextView);
        TextView textView = (TextView) rootView.findViewById(R.id.section_label);
        textView.setText(getResources().getString(R.string.today_tab_title));
        return rootView;
    }
}