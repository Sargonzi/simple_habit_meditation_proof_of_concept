package xyz.zisarkaynar.poc_simplehabitmeditation.activities;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import butterknife.BindView;
import butterknife.ButterKnife;
import xyz.zisarkaynar.poc_simplehabitmeditation.R;
import xyz.zisarkaynar.poc_simplehabitmeditation.adapters.MeditateScreenAdapter;
import xyz.zisarkaynar.poc_simplehabitmeditation.adapters.PagerAdapter;
import xyz.zisarkaynar.poc_simplehabitmeditation.fragments.OnTheGoFragment;
import xyz.zisarkaynar.poc_simplehabitmeditation.fragments.SeriesFragment;
import xyz.zisarkaynar.poc_simplehabitmeditation.fragments.TeachersFragment;


public class MainActivity extends BaseActivity {

    @BindView(R.id.toolbar)
    Toolbar toolbar;

    @BindView(R.id.vp_viewpager)
    ViewPager viewPager;

    @BindView(R.id.tl_tablayout)
    TabLayout tabLayout;

    private PagerAdapter mPagerAdapter;
    private MeditateScreenAdapter mMeditateScreenAdapter;

    public static Intent newIntent(Context context) {
        Intent intent = new Intent(context, MainActivity.class);
        return intent;
    }

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    return true;
                case R.id.navigation_dashboard:
                    navigateToMe();
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

        mPagerAdapter = new PagerAdapter(getSupportFragmentManager());
        mPagerAdapter.addTab(OnTheGoFragment.newInstance(), "ON THE GO");
        mPagerAdapter.addTab(SeriesFragment.newInstance(), "SERIES");
        mPagerAdapter.addTab(TeachersFragment.newInstance(), "TEACHERS");

        viewPager.setAdapter(mPagerAdapter);
        viewPager.setOffscreenPageLimit(mPagerAdapter.getCount());
        tabLayout.setupWithViewPager(viewPager);

    }

    public void navigateToMe() {
        Intent intent = MeActivity.newIntent(this);
        startActivity(intent);
    }


}
