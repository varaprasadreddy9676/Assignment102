package com.example.sdc.assignment102;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mTextMessage;
    private TextView mDesc;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    mTextMessage.setText(R.string.title_home);
                    mDesc.setText(Html.fromHtml(getString(R.string.home_description)));
                    return true;
                case R.id.navigation_about_us:
                    mTextMessage.setText(R.string.about_us_title);
                    mDesc.setText(Html.fromHtml(getString(R.string.about_us_description)));
                    return true;
                case R.id.navigation_academics:
                    mTextMessage.setText(R.string.academics_title);
                    mDesc.setText(Html.fromHtml(getString(R.string.academics_des)));
                    return true;
                case R.id.navigation_departments:
                    mTextMessage.setText(R.string.departments_title);
                    mDesc.setText(Html.fromHtml(getString(R.string.departments_desc)));
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextMessage = (TextView) findViewById(R.id.message);
        mDesc = findViewById(R.id.desc);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        navigation.setSelectedItemId(R.id.navigation_home);
    }

}
