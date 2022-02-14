package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ActivityTwo extends AppCompatActivity {
    private TextView mTvFirstName;
    private TextView mTvLastName;
    private TextView mTvEmailID;
    private TextView mTvPhoneNumber;
    private TextView mtvGender;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);
        Log.e("onCreate-Two", "onCreate");
        initView();
        setUserDate();


    }

    public void initView(){
        mTvFirstName = findViewById(R.id.tvFirstName);
        mTvLastName = findViewById(R.id.tvLastName);
        mTvEmailID = findViewById(R.id.tvEmailId);
        mTvPhoneNumber = findViewById(R.id.tvPhoneNo);
        mtvGender = findViewById(R.id.tvGender);
    }

    public void setUserDate() {
        Intent intent = getIntent();
        if (intent != null) {

            String firstName = intent.getStringExtra("FirstName");  //
            mTvFirstName.setText(firstName);
            String lastName = intent.getStringExtra("LastName");
            mTvLastName.setText(lastName);

            String emailID = intent.getStringExtra("EmailID");
            mTvEmailID.setText(emailID);

            String phoneNo = intent.getStringExtra("PhoneNumber");
            mTvPhoneNumber.setText(phoneNo);

            String gender = intent.getStringExtra("Gender");
            mtvGender.setText(gender);

        }
    }


    @Override
    protected void onStart() {
        super.onStart();
        Log.e("onStart-Two", "onStart");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("onResume-Two", "onResume");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("onPause-Two", "onPause");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("onStop-Two", "onStop");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("onDestroy-Two", "onDestroy");

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e("onRestart-Two", "onRestart");

    }

}