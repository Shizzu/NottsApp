package com.example.user.nottspark.Database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.user.nottspark.Model.Car;

import java.util.ArrayList;
import java.util.List;

public class carLocalDB extends SQLiteOpenHelper {

    // DATABASE AND TABLE DECLARATION //////////////////////////////////////////////////////////////////
    // DATABASE CAR
    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME =
            "Car List";

    // TABLE BRAND
    private static final String TABLE_CAR =
            "Car";
    private static final String KEY_CAR_ID =
            "car_id";
    private static final String KEY_CAR_MAKE =
            "car_make";
    private static final String KEY_CAR_MODEL =
            "car_model";
    private static final String KEY_CAR_PLATE =
            "car_plate";

    // END /////////////////////////////////////////////////////////////////////////////////////////////

    // For Activity
    public carLocalDB(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    // Create Database with all the Tables /////////////////////////////////////////////////////////////
    @Override
    public void onCreate(SQLiteDatabase db) {
        // CREATE TABLE CAR
        String CREATE_CAR_TABLE = "CREATE TABLE " + TABLE_CAR + "("
                + KEY_CAR_ID + " INTEGER PRIMARY KEY,"
                + KEY_CAR_MAKE + " TEXT,"
                + KEY_CAR_MODEL + " TEXT,"
                + KEY_CAR_PLATE + " TEXT"
                + ")";
        db.execSQL(CREATE_CAR_TABLE);
    }
    // END /////////////////////////////////////////////////////////////////////////////////////////////

    // Delete Tables and Re-create Database with all the Tables
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_CAR);
        onCreate(db);
    }

    // Register a new car
    public void addCar(Car car) {
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();
        //values.put(KEY_CAR_ID, car.getCarID()); // User ID
        values.put(KEY_CAR_MAKE, car.getCarMake()); // Username
        values.put(KEY_CAR_MODEL, car.getCarModel()); // User's Name
        values.put(KEY_CAR_PLATE, car.getCarPlate()); // User Contact Number

        db.insert(TABLE_CAR, null, values);
        db.close();
    }

    // Getting All Users
    public List<Car> getAllCars() {
        List<Car> carList = new ArrayList<>();
        String selectQuery = "SELECT * FROM " + TABLE_CAR;

        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);
        if (cursor.moveToFirst()) {
            do {
                Car car = new Car();
                car.setCarID(Integer.parseInt(cursor.getString(0)));
                car.setCarMake(cursor.getString(1));
                car.setCarModel(cursor.getString(2));
                car.setCarPlate(cursor.getString(3));

                carList.add(car);
            } while (cursor.moveToNext());
        }
        return carList;
    }

    public void deleteAll(){
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete(TABLE_CAR,null,null);
    }
}