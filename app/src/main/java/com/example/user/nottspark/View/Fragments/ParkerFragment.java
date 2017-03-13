package com.example.user.nottspark.View.Fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.Spinner;

import com.example.user.nottspark.Model.Leaver;
import com.example.user.nottspark.Model.SpecificLocation;
import com.example.user.nottspark.Model.User;
import com.example.user.nottspark.View.LeaverListAdapter;
import com.example.user.nottspark.View.ViewerPage.MainActivity;

import java.text.SimpleDateFormat;
import java.util.Date;

import getresult.example.asus.nottspark.R;


// In this case, the fragment displays simple text based on the page
public class ParkerFragment extends Fragment {
    private static final int DATASET_COUNT = 6;
    private RecyclerView mRecyclerView;
    private LeaverListAdapter mAdapter;
    private Leaver[] mDataset;
    private EditText new_building;
    private Spinner new_vehicle;
    private User user;

    public ParkerFragment() {
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);user = MainActivity.getUserinfo();
    }
    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Bundle bundle = getArguments();
        if (bundle != null) {
            user = (User) (bundle.getSerializable("userinfo"));
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
//        final DBHandlerParker db_parker = new DBHandlerParker(getActivity(), null, null, 1);

//        new_building = (EditText) view.findViewById(R.id.parkerBuilding);
//        new_vehicle = (Spinner) view.findViewById(R.id.parkerSpinner);

        View view = inflater.inflate(R.layout.fragment_parker, container, false);
        mRecyclerView = (RecyclerView) view.findViewById(R.id.recyclerView);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        mRecyclerView.scrollToPosition(((LinearLayoutManager) mRecyclerView.getLayoutManager()).findFirstCompletelyVisibleItemPosition());
        mAdapter = new LeaverListAdapter(mDataset);
        mRecyclerView.setAdapter(mAdapter);

//        Button searchButton = (Button) view.findViewById(R.id.btnSearchLeaver);
//        searchButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
////                String temp_building = new_building.getText().toString();
////                String temp_vehicle = new_vehicle.getSelectedItem().toString();
////                db_parker.addParker(new ParkerInfo(1, temp_building, temp_vehicle, 1));
//
//            }
//        });
        return view;
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