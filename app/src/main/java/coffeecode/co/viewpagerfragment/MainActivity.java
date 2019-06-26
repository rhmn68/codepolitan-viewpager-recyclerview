package coffeecode.co.viewpagerfragment;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    ViewPager vpMain;
    TabLayout tlMain;
    FragmentPagerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        vpMain = findViewById(R.id.vpMain);
        tlMain = findViewById(R.id.tlMain);

        adapter = new FragmentPagerAdapter(getSupportFragmentManager());
        vpMain.setAdapter(adapter);
        tlMain.setupWithViewPager(vpMain);
    }
}
