package com.musicbynumbers.pianoscalesadscopy;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.graphics.PixelFormat;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;
import com.musicbynumbers.pianoscalesadscopy.R;

public class minorMelodic extends Activity implements View.OnClickListener {
	Button aflatmin, amin, bflatmin, bmin, cmin, dflatmin, dmin, eflatmin,
			emin, fmin, fsharpmin, gmin;
	ImageButton mainMenu;
	Intent j;
	String scaleName;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		getWindow().setFormat(PixelFormat.RGBA_8888);
		getWindow().addFlags(WindowManager.LayoutParams.FLAG_DITHER);
		setContentView(R.layout.minormelodic);
		j = new Intent(this, display.class);
		mainMenu = (ImageButton) findViewById(R.id.imagelogo);
		aflatmin = (Button) findViewById(R.id.aflatmelb);
		amin = (Button) findViewById(R.id.amelb);
		bflatmin = (Button) findViewById(R.id.bflatmelb);
		bmin = (Button) findViewById(R.id.bmelb);
		cmin = (Button) findViewById(R.id.cmelb);
		dflatmin = (Button) findViewById(R.id.dflatmelb);
		dmin = (Button) findViewById(R.id.dmelb);
		eflatmin = (Button) findViewById(R.id.eflatmelb);
		emin = (Button) findViewById(R.id.emelb);
		fmin = (Button) findViewById(R.id.fmelb);
		fsharpmin = (Button) findViewById(R.id.fsharpmelb);
		gmin = (Button) findViewById(R.id.gmelb);
		mainMenu.setOnClickListener(this);
		aflatmin.setOnClickListener(this);
		amin.setOnClickListener(this);
		bflatmin.setOnClickListener(this);
		bmin.setOnClickListener(this);
		cmin.setOnClickListener(this);
		dflatmin.setOnClickListener(this);
		dmin.setOnClickListener(this);
		eflatmin.setOnClickListener(this);
		emin.setOnClickListener(this);
		fmin.setOnClickListener(this);
		fsharpmin.setOnClickListener(this);
		gmin.setOnClickListener(this);

	}

	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		switch (arg0.getId()) {
		case R.id.imagelogo:
			Intent i = new Intent(minorMelodic.this, MainMenu.class);
			startActivity(i);
			break;
		case R.id.aflatmelb:
			scaleName = "aflatmelmin";
			j.putExtra("key", scaleName);

			startActivity(j);
			break;
		case R.id.amelb:
			scaleName = "amelmin";
			j.putExtra("key", scaleName);
			startActivity(j);
			break;
		case R.id.bflatmelb:
			scaleName = "bflatmelmin";
			j.putExtra("key", scaleName);
			startActivity(j);
			break;
		case R.id.bmelb:
			scaleName = "bmelmin";
			j.putExtra("key", scaleName);
			startActivity(j);
			break;
		case R.id.cmelb:
			scaleName = "cmelmin";
			j.putExtra("key", scaleName);
			startActivity(j);
			break;
		case R.id.dflatmelb:
			scaleName = "dflatmelmin";
			j.putExtra("key", scaleName);
			startActivity(j);
			break;
		case R.id.dmelb:
			scaleName = "dmelmin";
			j.putExtra("key", scaleName);
			startActivity(j);
			break;
		case R.id.eflatmelb:
			scaleName = "eflatmelmin";
			j.putExtra("key", scaleName);
			startActivity(j);
			break;
		case R.id.emelb:
			scaleName = "emelmin";
			j.putExtra("key", scaleName);
			startActivity(j);
			break;
		case R.id.fmelb:
			scaleName = "fmelmin";
			j.putExtra("key", scaleName);
			startActivity(j);
			break;
		case R.id.fsharpmelb:
			scaleName = "fsharpmelmin";
			j.putExtra("key", scaleName);
			startActivity(j);
			break;
		case R.id.gmelb:
			scaleName = "gmelmin";
			j.putExtra("key", scaleName);
			startActivity(j);
			break;

		}

	}
}
