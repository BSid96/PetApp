package com.example.petapp;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;


import android.content.Context;

import android.os.Build;
import android.os.Bundle;

import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Arrays;

import java.time.LocalDate;
import java.time.Period;
import java.util.Date;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.trial);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        if (getCurrentFocus() != null) {
            InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
            imm.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(), 0);
        }
        return super.dispatchTouchEvent(ev);
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    public void done(View view){

//        EditText text = (EditText)findViewById(R.id.age);
//        String today = text.getText().toString();
//        List<String> myList = Arrays.asList(today.split("/"));
//
//        int d = Integer.parseInt(myList.get(0));
//        int m = Integer.parseInt(myList.get(1));
//        int y = Integer.parseInt(myList.get(2));
//
//        LocalDate start_Local_date = LocalDate.of(y, m, d);
//        LocalDate end_Local_date = LocalDate.now();
//        Period period_Between = Period.between(start_Local_date, end_Local_date);
//        TextView ans = findViewById(R.id.answer);
//        String age = "Yo sorry ass is "+ period_Between.getYears() + " years " + period_Between.getMonths() + " months " + period_Between.getDays() + " days old!!";
//        ans.setText(age);

        DatePicker d =  findViewById(R.id.datePicker1);
        int day = d.getDayOfMonth();
        int month = d.getMonth() + 1;
        int year = d.getYear();

        LocalDate start_Local_date = LocalDate.of(year, month, day);
        LocalDate end_Local_date = LocalDate.now();
        Period period_Between = Period.between(start_Local_date, end_Local_date);
        TextView ans = findViewById(R.id.answer);
        String age = "Yo sorry ass is "+ period_Between.getYears() + " years " + period_Between.getMonths() + " months " + period_Between.getDays() + " days old!!";
        ans.setText(age);
        // just checking the git functionality!!!!

    }











}
