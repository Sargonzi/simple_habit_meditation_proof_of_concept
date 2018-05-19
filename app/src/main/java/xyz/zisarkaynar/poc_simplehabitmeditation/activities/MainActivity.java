package xyz.zisarkaynar.poc_simplehabitmeditation.activities;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import butterknife.BindView;
import butterknife.ButterKnife;
import xyz.zisarkaynar.poc_simplehabitmeditation.R;
import xyz.zisarkaynar.poc_simplehabitmeditation.adapters.OneAdapter;
import xyz.zisarkaynar.poc_simplehabitmeditation.adapters.PageAdapter;
import xyz.zisarkaynar.poc_simplehabitmeditation.fragments.OnTheGoFragment;
import xyz.zisarkaynar.poc_simplehabitmeditation.fragments.SeriesFragment;
import xyz.zisarkaynar.poc_simplehabitmeditation.fragments.TeachersFragment;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.toolbar)
    Toolbar toolbar;

    @BindView(R.id.vp_viewpager)
    ViewPager viewPager;

    @BindView(R.id.tl_tablayout)
    TabLayout tabLayout;


    private PageAdapter mPageAdapter;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    return true;
                case R.id.navigation_dashboard:
                    return true;
                case R.id.navigation_notifications:
                    return true;
            }
            return false;
        }
    };

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this, this);
        toolbar.setTitle("Meditate");
        setSupportActionBar(toolbar);

        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);


        mPageAdapter = new PageAdapter(getSupportFragmentManager());
        mPageAdapter.addTab(OnTheGoFragment.newInstance(), "ON THE GO");
        mPageAdapter.addTab(SeriesFragment.newInstance(), "SERIES");
        mPageAdapter.addTab(TeachersFragment.newInstance(), "TEACHERS");

        viewPager.setAdapter(mPageAdapter);
        viewPager.setOffscreenPageLimit(mPageAdapter.getCount());
        tabLayout.setupWithViewPager(viewPager);


    }

}
