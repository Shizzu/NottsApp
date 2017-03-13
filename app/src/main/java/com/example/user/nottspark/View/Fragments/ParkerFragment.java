package com.example.user.nottspark.View.Fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.Spinner;

import com.example.user.nottspark.Model.User;
import com.example.user.nottspark.View.ViewerPage.MainActivity;

import getresult.example.asus.nottspark.R;


// In this case, the fragment displays simple text based on the page
public class ParkerFragment extends Fragment {

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

}