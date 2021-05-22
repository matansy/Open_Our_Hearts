package com.example.open_our_hearts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button aboutUsBtn;
    Button askForHelpBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        aboutUsBtn = findViewById(R.id.whoWeAreBtn);
        askForHelpBtn = findViewById(R.id.askForHelpBtn);
        aboutUsBtn.setOnClickListener(v ->
                startActivity(new Intent(getApplicationContext(), AboutUsActivity.class)));
        askForHelpBtn.setOnClickListener(v ->{Intent intent = new Intent(MainActivity.this, siteContentShow.class);
            intent.putExtra("siteURL", "https://docs.google.com/forms/d/1Ccc4kNLcCZTKQm3KO59pYPkJDvivz0gTVqcqMF9jXko/viewform?ts=5fa1aac3&edit_requested=true");
            //intent.putExtra("scroll", 1558);
            startActivity(intent);});


    }


}