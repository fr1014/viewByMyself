package com.study.viewbymyself;

import android.os.Bundle;

import android.support.annotation.LayoutRes;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.study.viewbymyself.adapter.PagerAdapter;
import com.study.viewbymyself.fragment.PageFragment;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ViewPager viewPager;
    TabLayout tableLayout;
    List<String> titleList = new ArrayList<>();
    List<PageModel> pageModelList = new ArrayList<>();
    PageFragment pageFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = findViewById(R.id.pager);
        viewPager.setAdapter(new PagerAdapter(getSupportFragmentManager(), getFragmentList(), getTitleList()));
        tableLayout = findViewById(R.id.tabLayout);
        tableLayout.setupWithViewPager(viewPager);
    }

    private List<String> getTitleList() {
        titleList.add("drawCircle()");
        titleList.add("drawColor()");
        titleList.add("drawHeart()");
        return titleList;
    }

    private List<Fragment> getFragmentList() {
        pageModelList.add(new PageModel(R.layout.pratice_circle));
        pageModelList.add(new PageModel(R.layout.pratice_color));
        pageModelList.add(new PageModel(R.layout.pratice_heart));

        List<Fragment> fragmentList = new ArrayList<>();

        for (int i = 0; i < pageModelList.size(); i++) {
            pageFragment = PageFragment.newInstance(pageModelList.get(i).practiceLayoutRes);
            fragmentList.add(pageFragment);
        }
        return fragmentList;
    }

    class PageModel {
        @LayoutRes
        int practiceLayoutRes;

        PageModel(@LayoutRes int practiceLayoutRes) {
            this.practiceLayoutRes = practiceLayoutRes;
        }
    }

}
