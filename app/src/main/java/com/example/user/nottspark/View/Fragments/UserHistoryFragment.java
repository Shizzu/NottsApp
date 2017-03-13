package com.example.user.nottspark.View.Fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.user.nottspark.Model.Leaver;
import com.example.user.nottspark.Model.SpecificLocation;
import com.example.user.nottspark.Model.User;
import com.example.user.nottspark.View.UserHistoryAdapter;

import java.text.SimpleDateFormat;
import java.util.Date;

import getresult.example.asus.nottspark.R;

public class UserHistoryFragment extends Fragment {
    private static final String TAG = "RecyclerViewFragment";
    private static final String KEY_LAYOUT_MANAGER = "layoutManager";
    private static final int DATASET_COUNT = 6;
    protected LayoutManagerType mCurrentLayoutManagerType;
    protected RecyclerView mRecyclerView;
    protected UserHistoryAdapter mAdapter;
    protected RecyclerView.LayoutManager mLayoutManager;
    protected Leaver[] mDataset;
    private User mUserObj;

    public static UserHistoryFragment newInstance(User userObj) {
        UserHistoryFragment fragment = new UserHistoryFragment();
        Bundle bundle = new Bundle();
        bundle.putSerializable("UserObject", userObj);
        fragment.setArguments(bundle);
        return fragment;
    }
//
//    @Override
//    public void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//
//        // Initialize dataset, this data would usually come from a local content provider or
//        // remote server.
//
//    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        initDataset();
        View rootView = inflater.inflate(R.layout.user_history_fragment, container, false);
        rootView.setTag(TAG);
        mUserObj = (User) getArguments().getSerializable("UserObject");

        mRecyclerView = (RecyclerView) rootView.findViewById(R.id.recyclerView);

        // LinearLayoutManager is used here, this will layout the elements in a similar fashion
        // to the way ListView would layout elements. The RecyclerView.LayoutManager defines how
        // elements are laid out.
        mLayoutManager = new LinearLayoutManager(getActivity());

        mCurrentLayoutManagerType = LayoutManagerType.LINEAR_LAYOUT_MANAGER;

        if (savedInstanceState != null) {
            // Restore saved layout manager type.
            mCurrentLayoutManagerType = (LayoutManagerType) savedInstanceState
                    .getSerializable(KEY_LAYOUT_MANAGER);
            setRecyclerViewLayoutManager(mCurrentLayoutManagerType);
        }

        mAdapter = new UserHistoryAdapter(mDataset);
        // Set UserHistoryAdapter as the adapter for RecyclerView.
        mRecyclerView.setAdapter(mAdapter);


        return rootView;
    }

    public void setRecyclerViewLayoutManager(LayoutManagerType layoutManagerType) {
        int scrollPosition = 0;

        // If a layout manager has already been set, get current scroll position.
        if (mRecyclerView.getLayoutManager() != null) {
            scrollPosition = ((LinearLayoutManager) mRecyclerView.getLayoutManager())
                    .findFirstCompletelyVisibleItemPosition();
        }

        switch (layoutManagerType) {

            case LINEAR_LAYOUT_MANAGER:
                mLayoutManager = new LinearLayoutManager(getActivity());
                mCurrentLayoutManagerType = LayoutManagerType.LINEAR_LAYOUT_MANAGER;
                break;
            default:
                mLayoutManager = new LinearLayoutManager(getActivity());
                mCurrentLayoutManagerType = LayoutManagerType.LINEAR_LAYOUT_MANAGER;
        }

        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.scrollToPosition(scrollPosition);
    }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        // Save currently selected layout manager.
        savedInstanceState.putSerializable(KEY_LAYOUT_MANAGER, mCurrentLayoutManagerType);
        super.onSaveInstanceState(savedInstanceState);
    }

    /**
     * Generates Strings for RecyclerView's adapter. This data would usually come
     * from a local content provider or remote server.
     */
    private void initDataset() {
        mDataset = new Leaver[DATASET_COUNT];
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy h:mm:ss a");
        String formattedDate = sdf.format(date);
        SpecificLocation sl = new SpecificLocation(30001, "Faculty of Science and Faculty of Engineering", "Blue", "Near Blue Building", "file:///android_asset/bbparking");
        mDataset[0] = new Leaver(10001, formattedDate, mUserObj, sl, "Taken");
        mDataset[1] = new Leaver(10002, formattedDate, mUserObj, sl, "Not Taken");
        mDataset[2] = new Leaver(10003, formattedDate, mUserObj, sl, "Waiting");
        mDataset[3] = new Leaver(10004, formattedDate, mUserObj, sl, "Taken");
        mDataset[4] = new Leaver(10005, formattedDate, mUserObj, sl, "Taken");
        mDataset[5] = new Leaver(10006, formattedDate, mUserObj, sl, "Taken");

    }

    private enum LayoutManagerType {
        LINEAR_LAYOUT_MANAGER
    }

}

