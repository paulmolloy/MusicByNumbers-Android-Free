package com.musicbynumbers.pianoscalesadscopy;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.Toast;

import com.musicbynumbers.pianoscalesadscopy.R;


public class display extends Activity {
	
	ImageView displayScale;
	String gotScale;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.display);
		Initalize();
		gotScale = getIntent().getStringExtra("key");
		displayScale = (ImageView) findViewById(R.id.displayImage);
		//aflatmaj-gotscale
		int id = getResources().getIdentifier("com.musicbynumbers.pianoscalesadscopy:drawable/" + gotScale, null, null);
		Log.d("display", gotScale);
		displayScale.setImageResource(id);
		//String uri = "drawable/"+gotScale;
		//int id = getResources().getIdentifier(uri, "drawable", getPackageName()); // your res id.
		
	}

	private void Initalize() {
		 //TODO Auto-generated method stub
		displayScale = (ImageView) findViewById(R.id.displayImage);
		gotScale = "ic_launcher.png";

	}}

	
	