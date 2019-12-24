package com.example.locatetheplace;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView latitudeText;
    TextView longitudeText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         latitudeText = findViewById(R.id.latitudeText);
         longitudeText = findViewById(R.id.longitudeText);
    }

    public void goToMaps(View view){

        Double latitudeTextInt = Double.parseDouble(latitudeText.getText().toString());
        Double longitudeTextInt = Double.parseDouble(longitudeText.getText().toString());
        Intent intent = new Intent(getApplicationContext(),MapsActivity.class);

        intent.putExtra("Latitude",latitudeTextInt);
        intent.putExtra("Longitude",longitudeTextInt);

        startActivity(intent);

    }

}
