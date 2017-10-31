package com.shakibcsekuet.includetagexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button customButton;
    ImageView customImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        customButton = (Button) findViewById(R.id.customButton); // get the reference of custom Layout's Button
        customImageView = (ImageView) findViewById(R.id.customImageView); // get the reference of custom Layout's ImageView
        customButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
// display a toast on Button Click
                Toast.makeText(getApplicationContext(), "Custom Layout’s Button Clicked", Toast.LENGTH_LONG).show();
            }
        });
    }
}