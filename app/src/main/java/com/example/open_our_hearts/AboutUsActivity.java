package com.example.open_our_hearts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AboutUsActivity extends AppCompatActivity {

    Button odotButton, ktavotButton, fieldButton, futureActButton, galleryButton, uploadButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);

        odotButton = findViewById(R.id.odotBtn);
        ktavotButton = findViewById(R.id.ktavotBtn);
        fieldButton = findViewById(R.id.fieldActvBtn);
        futureActButton = findViewById(R.id.FutureActvBtn);
        galleryButton = findViewById(R.id.galleryBtn);
        uploadButton = findViewById(R.id.uploadBtn);

        odotButton.setOnClickListener(v -> {
            Intent intent = new Intent(AboutUsActivity.this, siteContentShow.class);
            intent.putExtra("siteURL", "https://www.pothim-lev.co.il/%d7%90%d7%95%d7%93%d7%95%d7%aa/");
            intent.putExtra("scroll", 1558);
            startActivity(intent);
        });

        ktavotButton.setOnClickListener(v -> {
            Intent intent = new Intent(AboutUsActivity.this, siteContentShow.class);
            intent.putExtra("siteURL", "https://www.pothim-lev.co.il/%d7%9b%d7%aa%d7%91%d7%95%d7%aa/");
            intent.putExtra("scroll", 1695);
            startActivity(intent);
        });

        fieldButton.setOnClickListener(v -> {
            Intent intent = new Intent(AboutUsActivity.this, siteContentShow.class);
            intent.putExtra("siteURL", "https://www.pothim-lev.co.il/aa/");
            intent.putExtra("scroll", 1695);
            startActivity(intent);
        });

        futureActButton.setOnClickListener(v -> {
            Intent intent = new Intent(AboutUsActivity.this, siteContentShow.class);
            intent.putExtra("siteURL", "https://www.pothim-lev.co.il/%d7%a4%d7%a2%d7%99%d7%9c%d7%95%d7%aa-%d7%a2%d7%aa%d7%99%d7%93%d7%99%d7%aa/");
            intent.putExtra("scroll", 1695);
            startActivity(intent);
        });

        galleryButton.setOnClickListener(v -> {
            Intent intent = new Intent(AboutUsActivity.this, siteContentShow.class);
            intent.putExtra("siteURL", "https://www.pothim-lev.co.il/b/");
            intent.putExtra("scroll", 1558);
            startActivity(intent);
        });

        uploadButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}