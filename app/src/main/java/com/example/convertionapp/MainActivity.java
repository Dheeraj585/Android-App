package com.example.convertionapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

public class MainActivity extends AppCompatActivity {
    ImageButton ib ;
    TextView tw ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ib = findViewById(R.id.logoImageButton);
        tw = findViewById(R.id.titleTextView);
        showToast("Press anywhere to start");


    }
    public void onImageButtonClick(View view) {
        showToast("ImageButton Clicked");
        Intent intent = new Intent(MainActivity.this,convertionMenu.class);
        startActivity(intent);
        // Add code to navigate to the next page or perform desired action
    }

    private void showToast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}
