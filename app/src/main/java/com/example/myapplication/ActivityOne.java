package com.example.myapplication;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.Log;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ActivityOne extends AppCompatActivity implements View.OnClickListener {
    private EditText mEdtFirstName;
    private EditText mEdtLastName;
    private EditText mEdtEmailID;
    private EditText mEdtPhoneNumber;
    private TextView mEdtGender;
    private RadioGroup mRadioGroup;
    private RadioButton mRadioButton1;
    private RadioButton mRadioButton2;
    private String genderType;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one);
        Log.e("onCreate -One", "onCreate");
        initViews();

        mRadioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId==R.id.rbMale)
                {

                    genderType="Male";
                }
                else {
                    genderType="Female";
                }
            }
        });


    }



    public static boolean isValidEmail(CharSequence myEmail) {
        return (!TextUtils.isEmpty(myEmail) && Patterns.EMAIL_ADDRESS.matcher(myEmail).matches());
    }

    public void initViews() {

        mEdtFirstName = findViewById(R.id.edtFirstName);
        mEdtLastName = findViewById(R.id.edtLastName);
        mEdtEmailID = findViewById(R.id.edtEmailId);
        mEdtPhoneNumber = findViewById(R.id.edtPhoneNo);
        mEdtGender = findViewById(R.id.edtGender);
        Button mBtn = findViewById(R.id.btn);
        mRadioGroup = findViewById(R.id.rgGender);
        mRadioButton1 = findViewById(R.id.rbMale);
        mRadioButton2 = findViewById(R.id.rbFemale);

       mBtn.setOnClickListener(this);
       // mRadioButton1.setOnClickListener(this);
        //mRadioButton2.setOnClickListener(this);
    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btn) {


            // Get the data from Edit Text.
            String mFirstName = mEdtFirstName.getText().toString();

            String mLastName = mEdtLastName.getText().toString();
            String mEmailID = mEdtEmailID.getText().toString().trim();
            String mPhoneNumber = mEdtPhoneNumber.getText().toString().trim();

            Intent intent = new Intent(this, ActivityTwo.class);
            intent.putExtra("FirstName", mFirstName);
            intent.putExtra("LastName", mLastName);
            intent.putExtra("EmailID", mEmailID);
            intent.putExtra("PhoneNumber", mPhoneNumber);
            intent.putExtra("Gender", genderType);


            if (isValidEmail(mEmailID))
            {
                startActivity(intent);
            }
            else {
                Toast.makeText(this, "Email not correct!", Toast.LENGTH_SHORT).show();
            }


        }

      /* if (v.getId()==R.id.rbMale){

       }

        if (v.getId()==R.id.rbFemale){

           // Toast.makeText(this, "Female", Toast.LENGTH_SHORT).show();
        }
*/
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("onStart -One", "onStart");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("onResume -One", "onResume");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("onPause-One", "onPause");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("onStop -One", "onStop");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("onDestroy -One", "onDestroy");

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e("onRestart-One", "onRestart");

    }


}