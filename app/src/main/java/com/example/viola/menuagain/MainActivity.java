package com.example.viola.menuagain;

//import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.RadioButton;
import android.support.v4.view.ViewPager;
import android.view.MenuItem;
import android.view.Menu;


public class MainActivity extends AppCompatActivity {

    RadioButton fries;
    RadioButton cheese;
    RadioButton nachos;
    RadioButton burger;
    RadioButton sandwich;
    RadioButton macNcheese;
    RadioButton pie;
    RadioButton iceCreame;
    RadioButton cookie;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tab_layout);
        tabLayout.addTab(tabLayout.newTab().setText("Appitizer"));
        tabLayout.addTab(tabLayout.newTab().setText("Entree"));
        tabLayout.addTab(tabLayout.newTab().setText("Dessert"));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

        final ViewPager viewPager = (ViewPager) findViewById(R.id.pager);
        final PagerAdapter adapter = new PagerAdapter(getSupportFragmentManager(), tabLayout.getTabCount());
        viewPager.setAdapter(adapter);
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            public void onTabUnselected(TabLayout.Tab tab) {

            }

            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

    }
    /*public boolean onCreateOperationMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main,menu);
        return true;
    }

    public boolean onCreateOptionMenu(MenuItem item){
        int id = item.getItemId();
        if(id==R.id.action_settings){
            return true;
        }
        return super.onOptionsItemSelected(item);
    }*/

    //fries = (RadioButton)findViewById(R.id.frenchFri);
    //cheese = (RadioButton) findViewById(R.id.cheeseCurd);


}

