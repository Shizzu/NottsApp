package com.example.user.nottspark.View.ViewerPage;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.app.FragmentTransaction;

import com.example.user.nottspark.Model.Car;
import com.example.user.nottspark.Model.User;
import com.example.user.nottspark.View.Fragments.LeaverFragment;
import com.example.user.nottspark.View.Fragments.ParkerFragment;
import com.example.user.nottspark.View.Fragments.UserHistoryFragment;
import com.example.user.nottspark.View.Fragments.UserProfileFragment;

public class ViewerPageAdapter extends FragmentStatePagerAdapter {
    int mNumOfTabs;
    private Car car1 = new Car(6001, "Proton", "Saga", "CAD 2035");//testing please delete
    private User user1 = new User(20002,"admin2012", "Admin", "0124547896", "admin@ne.com", car1,"05/01/2017 3:00pm", "Student", "root");//testing please delete
    public ViewerPageAdapter(FragmentManager fm, int NumOfTabs) {
        super(fm);
        this.mNumOfTabs = NumOfTabs;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                ParkerFragment parkerFragment = new ParkerFragment();
                return parkerFragment;
            case 1:
                LeaverFragment leaverFragment = new LeaverFragment();
                return leaverFragment;
            case 2:
                Fragment fragment = UserHistoryFragment.newInstance(user1);
                return fragment;
            case 3:
                UserProfileFragment userProfileFragment = new UserProfileFragment();
                return userProfileFragment;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return mNumOfTabs;
    }
}