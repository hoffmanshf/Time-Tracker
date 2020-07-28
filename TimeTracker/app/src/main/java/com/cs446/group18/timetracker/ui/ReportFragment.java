package com.cs446.group18.timetracker.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import com.cs446.group18.timetracker.R;
import com.cs446.group18.timetracker.adapter.PageAdapter;
import com.google.android.material.tabs.TabLayout;

public class ReportFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_report,  container, false);

        TabLayout tabBar = v.findViewById(R.id.tab_bar_time);
        final ViewPager viewPager = v.findViewById(R.id.viewPager);

        PageAdapter pageAdapter = new PageAdapter(getParentFragmentManager(), tabBar.getTabCount());
        viewPager.setAdapter(pageAdapter);

        tabBar.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        return v;
    }
}