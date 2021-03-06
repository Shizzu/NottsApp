package com.example.user.nottspark.View.Fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Spinner;

import com.example.user.nottspark.Model.User;
import com.example.user.nottspark.View.EditProfileActivity;
import com.example.user.nottspark.View.ViewerPage.MainActivity;
import com.rey.material.widget.EditText;

import getresult.example.asus.nottspark.R;

public class UserProfileFragment extends Fragment {
    private EditText profileName, profileEmail, profileContact;
    private Spinner vehicleSpinner;
    private Button editProfile;
    private User user;

    public UserProfileFragment() {

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        user = MainActivity.getUserinfo();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.user_profile_fragment, container, false);
        profileName = (EditText) view.findViewById(R.id.profileName);
        profileEmail = (EditText) view.findViewById(R.id.profileEmail);
        profileContact = (EditText) view.findViewById(R.id.profileContact);

        profileName.setKeyListener(null);
        profileEmail.setKeyListener(null);
        profileContact.setKeyListener(null);

        editProfile = (Button) view.findViewById(R.id.editProfile);
        editProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editProfile();

            }
        });
        return view;
    }

    private void editProfile() {
        Intent intent = new Intent(getActivity(), EditProfileActivity.class);
        getActivity().startActivity(intent);
    }
}


