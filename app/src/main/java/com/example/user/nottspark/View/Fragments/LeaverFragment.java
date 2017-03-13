package com.example.user.nottspark.View.Fragments;

import android.app.Activity;
import android.app.Dialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.text.format.DateFormat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TimePicker;

import com.example.user.nottspark.Model.User;
import com.example.user.nottspark.View.ViewerPage.MainActivity;

import java.util.Calendar;

import getresult.example.asus.nottspark.R;

public class LeaverFragment extends Fragment {

    OnHeadlineSelectedListener mCallback;
    private User user;
    private EditText new_building, new_desc;
    private Spinner new_vehicle;
    private FragmentActivity myContext;

    public LeaverFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        user = MainActivity.getUserinfo();
    }

    @Override
    public void onAttach(Activity activity) {
        myContext = (FragmentActivity) activity;
        super.onAttach(activity);
    }

    public void showTimePickerDialog() {
        DialogFragment newFragment = new TimePickerFragment();
        newFragment.show(myContext.getSupportFragmentManager(), "timePicker");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_leaver, container, false);
//        final NottsParkDatabase db = new NottsParkDatabase(getActivity(), null, null, 1);
//        new_building = (EditText) view.findViewById(R.id.leaverBuilding);
//        new_vehicle = (Spinner) view.findViewById(R.id.leaverSpinner);
//        new_desc = (EditText) view.findViewById(R.id.leaverDescription);
//
//        final Button button = (Button) view.findViewById(R.id.btnTimepicker);
//        button.setOnClickListener(new View.OnClickListener() {
//            public void onClick(View v) {
//                showTimePickerDialog();
//            }
//        });
//
//        Button leaveButton = (Button) view.findViewById(R.id.btnLeave);
//        leaveButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                String temp_building = new_building.getText().toString();
//                String temp_vehicle = new_vehicle.getSelectedItem().toString();
//                String temp_desc = new_desc.getText().toString();
//                //db.addLeaver(new Leaver(1,1,));
//            }
//        });
        return view;
    }

    // Container Activity must implement this interface
    public interface OnHeadlineSelectedListener {
        public void onArticleSelected(int position);
    }

    public static class TimePickerFragment extends DialogFragment
            implements TimePickerDialog.OnTimeSetListener {

        @Override
        public Dialog onCreateDialog(Bundle savedInstanceState) {
            // Use the current time as the default values for the picker
            final Calendar c = Calendar.getInstance();
            int hour = c.get(Calendar.HOUR_OF_DAY);
            int minute = c.get(Calendar.MINUTE);

            // Create a new instance of TimePickerDialog and return it
            return new TimePickerDialog(getActivity(), this, hour, minute,
                    DateFormat.is24HourFormat(getActivity()));
        }

        public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
            // Do something with the time chosen by the user
        }

    }
}

