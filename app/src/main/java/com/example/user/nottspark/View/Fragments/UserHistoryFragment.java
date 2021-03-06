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
import com.example.user.nottspark.View.HistoryListAdapter;
import com.example.user.nottspark.View.LeaverListAdapter;
import com.example.user.nottspark.View.ViewerPage.MainActivity;

import java.text.SimpleDateFormat;
import java.util.Date;

import getresult.example.asus.nottspark.R;

public class UserHistoryFragment extends Fragment {
    private static final int DATASET_COUNT = 6;
    private RecyclerView mRecyclerView;
    private HistoryListAdapter mAdapter;
    private Leaver[] mDataset;
    private User user;

    public UserHistoryFragment() {

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        user = MainActivity.getUserinfo();
        initDataset();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.user_history_fragment, container, false);

        mRecyclerView = (RecyclerView) view.findViewById(R.id.recyclerView);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        mRecyclerView.scrollToPosition(((LinearLayoutManager) mRecyclerView.getLayoutManager()).findFirstCompletelyVisibleItemPosition());
        mAdapter = new HistoryListAdapter(mDataset);
        mRecyclerView.setAdapter(mAdapter);
        return view;
    }


    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);
    }

    private void initDataset() {
        mDataset = new Leaver[DATASET_COUNT];
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat sdf2 = new SimpleDateFormat("h:mm:ss a");
        String formattedDate = sdf.format(date);
        String formattedTime = sdf2.format(date);
        SpecificLocation sl = new SpecificLocation(30001, "Faculty of Science and Faculty of Engineering", "Blue", "Near Blue Building", "file:///android_asset/bbparking");//testing please delete

        mDataset[0] = new Leaver(10001, formattedDate, formattedTime, user, sl, "Taken");
        mDataset[1] = new Leaver(10002, formattedDate, formattedTime, user, sl, "Not Taken");
        mDataset[2] = new Leaver(10003, formattedDate, formattedTime, user, sl, "Waiting");
        mDataset[3] = new Leaver(10004, formattedDate, formattedTime, user, sl, "Taken");
        mDataset[4] = new Leaver(10005, formattedDate, formattedTime, user, sl, "Taken");
        mDataset[5] = new Leaver(10006, formattedDate, formattedTime, user, sl, "Taken");

    }


}

