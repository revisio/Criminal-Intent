package com.example.phorust.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by phorust on 4/4/18.
 */

public class CrimeListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment(){
        return new CrimeListFragment();
    }
}
