package com.example.user.nottspark.View;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toolbar;

import com.example.user.nottspark.Database.NottsParkDatabase;
import com.example.user.nottspark.Database.carLocalDB;
import com.example.user.nottspark.Model.Car;
import com.example.user.nottspark.Model.User;
import com.example.user.nottspark.View.ViewerPage.MainActivity;

import java.util.List;
import java.util.Objects;

import getresult.example.asus.nottspark.R;

/**
 * A login screen that offers login via email/password.
 */
public class LoginActivity extends AppCompatActivity {

    public User current_user;
    boolean flag = false;
    private AutoCompleteTextView mUsernameView;
    private EditText mPasswordView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setActionBar(toolbar);

        final NottsParkDatabase db = new NottsParkDatabase(this);
        final carLocalDB db_car = new carLocalDB(this);

        //db.deleteAll();
        //db_car.deleteAll();

        // Reading all users
        Log.d("Reading: ", "Reading all users..");
        List<User> users = db.getAllUser();

        for (User user : users) {
            String log = "Id: " + user.getUserID() + " ,Username: " + user.getUserUsername() + " ,Name: " + user.getUserName()
                    + " ,Contact Num: " + user.getUserContactNum() + " ,Email: " + user.getUserEmail() + " ,Account Type: " + user.getUserAccountType() + " ,PW: " + user.getUserPassword();
        // Writing users to log
            Log.d("User: : ", log);
        }
        // Reading all cars
        Log.d("Reading: ", "Reading all cars..");
        List<Car> cars = db_car.getAllCars();

        for (Car car : cars) {
            String log = "Id: " + car.getCarID() + " ,Make: " + car.getCarMake() + " ,Model: " + car.getCarModel()
                    + " ,Plate: " + car.getCarPlate();
            // Writing cars to log
            Log.d("Car: : ", log);
        }

        mUsernameView = (AutoCompleteTextView) findViewById(R.id.username);
        mPasswordView = (EditText) findViewById(R.id.password);

        Button mUsernameSignInButton = (Button) findViewById(R.id.btnSignIn);
        mUsernameSignInButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                String temp_username = mUsernameView.getText().toString();
                String temp_password = mPasswordView.getText().toString();

                List<User> users = db.getAllUser(); // will have to change to comparing it online instead of storing it in a local arraylist
                for (User user : users) {
                    if ((Objects.equals(user.getUserUsername(), temp_username) && (Objects.equals(user.getUserPassword(), temp_password)))) {
                        current_user = db.getUser(user.getUserID());
                        attemptLogin(view);
                    }
                }

            }
        });

        Button mRegisterButton = (Button) findViewById(R.id.btnRegister);
        mRegisterButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                userRegistration(view);
            }
        });
    }

    public void userRegistration(View v) {
        Intent intent = new Intent(this, UserRegistrationActivity.class);
        startActivity(intent);
    }

    public void attemptLogin(View v) {
        String username = mUsernameView.getText().toString();

        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("USERNAME", username);

        startActivity(intent);
    }
//
}

