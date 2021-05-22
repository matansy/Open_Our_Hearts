package com.example.open_our_hearts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class contact_page extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_contact_page);
		ImageButton btn_call_us = (ImageButton) findViewById(R.id.call_button);
		String number = "0533444151";
		btn_call_us.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {
				Intent intent = new Intent(Intent.ACTION_CALL);
				intent.setData(Uri.parse("tel:" + number));
				startActivity(intent);

			}
		});

		ImageButton btn_mail_us = (ImageButton) findViewById(R.id.mail_button);
		btn_mail_us.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				String mailto = "mailto:giving.with.love.heart@gmail.com" +
								"?cc=" +
								"&subject=" + Uri.encode("Your subject") +
								"&body=" + Uri.encode("Your mail body");
				Intent emailIntent = new Intent(Intent.ACTION_SENDTO);
				emailIntent.setData(Uri.parse(mailto));
//				startActivity(emailIntent);

				try {
					startActivity(emailIntent);
				} catch (ActivityNotFoundException e) {
					Toast.makeText(contact_page.this, "Error to open email app", Toast.LENGTH_SHORT).show();
				}
			}
		});

		ImageButton facebook_page_button = (ImageButton)findViewById(R.id.facebook_page);
		facebook_page_button.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Uri uri = Uri.parse("https://www.facebook.com/profile.php?id=100044531319621");
				Intent intent = new Intent(Intent.ACTION_VIEW, uri);
				startActivity(intent);
			}
		});

		ImageButton facebook_group_button = (ImageButton)findViewById(R.id.facebook_group);
		facebook_group_button.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Uri uri = Uri.parse("https://www.facebook.com/groups/2108864115830859/");
				Intent intent = new Intent(Intent.ACTION_VIEW, uri);
				startActivity(intent);
			}
		});

		ImageButton facebook_likes_button = (ImageButton)findViewById(R.id.facebook_like_page);
		facebook_likes_button.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Uri uri = Uri.parse("https://www.facebook.com/pothemetalev");
				Intent intent = new Intent(Intent.ACTION_VIEW, uri);
				startActivity(intent);
			}
		});


		ImageButton instagram_button = (ImageButton)findViewById(R.id.instagram_button);
		instagram_button.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Uri uri = Uri.parse("https://www.facebook.com/pothemetalev");
				Intent intent = new Intent(Intent.ACTION_VIEW, uri);
				startActivity(intent);
			}
		});

	}
}