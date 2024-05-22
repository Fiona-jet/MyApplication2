package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
/**
 * The MainActivity class represents the main activity of the Android application.
 */
public class MainActivity extends AppCompatActivity {
Button button;
TextView text;
    /**
     * Called when the activity is starting. This is where most initialization should go:
     * calling setContentView(int) to inflate the activity's UI, initializing views, and
     * restoring any saved state.
     *
     * @param savedInstanceState If the activity is being re-initialized after previously
     *    being shut down then this Bundle contains the data it most recently supplied in
     *    onSaveInstanceState(Bundle). Note: Otherwise, it is null.
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
}