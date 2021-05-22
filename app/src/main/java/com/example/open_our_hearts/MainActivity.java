package com.example.open_our_hearts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button aboutUsBtn;
    Button askForHelpBtn;
    Button volunteerBtn;
    Button contactUs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        aboutUsBtn = findViewById(R.id.whoWeAreBtn);
        askForHelpBtn = findViewById(R.id.askForHelpBtn);
        volunteerBtn = findViewById(R.id.volunteerBtn);
        contactUs = findViewById(R.id.contactUsBtn);

        String donatePhoneNumber = "972543372873";//972545830076
        String text = "אני פונה בקשר להתנדבות בארגון פותחים את הלב ונותנים באהבה,שמי ";

        aboutUsBtn.setOnClickListener(v ->
                startActivity(new Intent(getApplicationContext(), AboutUsActivity.class)));
        askForHelpBtn.setOnClickListener(v ->{Intent intent = new Intent(MainActivity.this, siteContentShow.class);
            intent.putExtra("siteURL", "https://docs.google.com/forms/d/1Ccc4kNLcCZTKQm3KO59pYPkJDvivz0gTVqcqMF9jXko/viewform?ts=5fa1aac3&edit_requested=true");
            //intent.putExtra("scroll", 1558);
            startActivity(intent);});


        contactUs.setOnClickListener(v ->
                startActivity(new Intent(getApplicationContext(), contact_page.class)));

        volunteerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean installed = isAppInstalled("com.whatsapp");

                if(installed) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse("http://api.whatsapp.com/send?=" + donatePhoneNumber + text));
                    startActivity(intent);
                }
                else{
                    Toast.makeText(MainActivity.this, "Whatsapp is not installed!",Toast.LENGTH_SHORT).show();
                }
            }
        });


    }

    private boolean isAppInstalled(String s) {
        PackageManager packageManager = getPackageManager();
        boolean is_installed;

        try{
            packageManager.getPackageInfo(s,PackageManager.GET_ACTIVITIES);
            is_installed = true;
        } catch (PackageManager.NameNotFoundException e) {
            is_installed = false;
            e.printStackTrace();
        }
        return is_installed;
    }


}