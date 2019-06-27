package coffeecode.co.viewpagerfragment.adapter;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import coffeecode.co.viewpagerfragment.fragment.MobilFragment;
import coffeecode.co.viewpagerfragment.fragment.MotorFragment;
import coffeecode.co.viewpagerfragment.fragment.PesawatFragment;

public class FragmentPagerAdapter extends FragmentStatePagerAdapter {

    public FragmentPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new MobilFragment();
            case 1:
                return new MotorFragment();
            case 2:
                return new PesawatFragment();
            default:
                return new MobilFragment();
        }
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0:
                return "Mobil";
            case 1:
                return "Motor";
            case 2:
                return "Pesawat";
            default:
                return "Mobil";
        }
    }
}
