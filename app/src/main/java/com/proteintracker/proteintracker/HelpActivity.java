package com.proteintracker.proteintracker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class HelpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView myTextView = new TextView(this);


        Bundle b = getIntent().getExtras();

        String helpText = b.getString("helpString");
        myTextView.setText(helpText);
        setContentView(myTextView);
    }
}
