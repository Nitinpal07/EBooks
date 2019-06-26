package nitin.luckyproject.e_books.ui.main;

import android.content.Context;

import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import nitin.luckyproject.e_books.FragmentTab1;
import nitin.luckyproject.e_books.FragmentTab2;
import nitin.luckyproject.e_books.FragmentTab3;
import nitin.luckyproject.e_books.FragmentTab4;
import nitin.luckyproject.e_books.R;

/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
public class SectionsPagerAdapter extends FragmentPagerAdapter {

    @StringRes
    private static final int[] TAB_TITLES = new int[]{R.string.tab_text_1, R.string.tab_text_2,R.string.tab_text_3,R.string.tab_text_4};
    private final Context mContext;

    public SectionsPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        // getItem is called to instantiate the fragment for the given page.
        // Return a PlaceholderFragment (defined as a static inner class below).
        switch (position){
            case 0:
                return new FragmentTab1();
            case 1:
                return new FragmentTab2();
            case 2:
                return new FragmentTab3();
            case 3:
                return new FragmentTab4();
                default:
                    return null;

        }
    }

    @Override
    public int getCount() {
        // Show 2 total pages.
        return 4;
    }
}