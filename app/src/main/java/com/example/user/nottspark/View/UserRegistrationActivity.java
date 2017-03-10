package com.example.user.nottspark.View;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.user.nottspark.Database.NottsParkDatabase;
import com.example.user.nottspark.Model.User;

import java.util.Objects;

import getresult.example.asus.nottspark.R;


public class UserRegistrationActivity extends AppCompatActivity {

    private EditText mUsernameField, mPasswordField, mPasswordVerifyField, mName, mPhone, mContact, mEmail;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_registration);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        final NottsParkDatabase db = new NottsParkDatabase(this); // new object DBHandlerCreds

        mUsernameField = (EditText) findViewById(R.id.username);
        mPasswordField = (EditText) findViewById(R.id.password);
        mPasswordVerifyField = (EditText) findViewById(R.id.passwordReconfirm);

        mName = (EditText) findViewById(R.id.accName);
        mPhone = (EditText) findViewById(R.id.contactNum);
        mContact = (EditText) findViewById(R.id.contactNum); // layout have to change in UI
        mEmail = (EditText) findViewById(R.id.regEmail); // layout have to change in UI

        Button mSignUp = (Button) findViewById(R.id.addUser);
        mSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String new_username = mUsernameField.getText().toString();
                String new_pw = mPasswordField.getText().toString();
                String new_pw_verify = mPasswordVerifyField.getText().toString();

                String new_name = mName.getText().toString();
                String new_phone = mPhone.getText().toString();
                String new_email = mContact.getText().toString();
                String new_accType = mEmail.getText().toString();

                if (Objects.equals(new_pw, new_pw_verify)) {
                    db.addUser(new User(1, new_username, new_name, new_phone, new_email, new_accType, new_pw));
                }
            }
        });
    }
}