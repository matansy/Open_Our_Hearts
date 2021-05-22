package com.example.open_our_hearts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Donation_page extends AppCompatActivity {

    Button bitBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_donation_page);

        bitBtn = findViewById(R.id.Bit_button);
//        bitBtn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                boolean installed = isAppInstalled("com.bit");
//
//                if(installed) {
//                    Intent intent = new Intent(Intent.ACTION_VIEW);
//                    intent.setData(Uri.parse("http://api.whatsapp.com/send?=" + donatePhoneNumber + text));
//                    startActivity(intent);
//                }
//                else{
////                    Toast.makeText(MainActivity.this, "Whatsapp is not installed!",Toast.LENGTH_SHORT).show();
//                }
//            }
//        });
    }


}