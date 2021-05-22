package com.example.open_our_hearts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AboutUsActivity extends AppCompatActivity {

    Button odotButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);

        odotButton = findViewById(R.id.odotBtn);
        odotButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AboutUsActivity.this, siteContentShow.class);
                intent.putExtra("siteURL", "https://www.pothim-lev.co.il/%d7%90%d7%95%d7%93%d7%95%d7%aa/");
                startActivity(intent);
            }
        });
    }
}