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

public class minorHarmonic extends Activity implements View.OnClickListener  {
	Button aflatmin, amin, bflatmin, bmin, cmin, dflatmin, dmin, eflatmin, emin, fmin, fsharpmin, gmin;  
	ImageButton mainMenu;
	Intent j;
	String scaleName;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		getWindow().setFormat(PixelFormat.RGBA_8888);
		getWindow().addFlags(WindowManager.LayoutParams.FLAG_DITHER);
		setContentView(R.layout.minorharmonic);
		j  = new Intent(this, display.class);
		mainMenu = (ImageButton) findViewById(R.id.imagelogo);
		aflatmin = (Button) findViewById(R.id.aflatharmb);
		amin = (Button) findViewById(R.id.aharmb);
		bflatmin = (Button) findViewById(R.id.bflatharmb);
		bmin = (Button) findViewById(R.id.bharmb);
		cmin = (Button) findViewById(R.id.charmb);
		dflatmin = (Button) findViewById(R.id.dflatharmb);
		dmin = (Button) findViewById(R.id.dharmb);
		eflatmin = (Button) findViewById(R.id.eflatharmb);
		emin = (Button) findViewById(R.id.eharmb);
		fmin = (Button) findViewById(R.id.fharmb);
		fsharpmin = (Button) findViewById(R.id.fsharpharmb);
		gmin = (Button) findViewById(R.id.gharmb);
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
		        switch(arg0.getId()){
		        case R.id.imagelogo:
		            Intent i =  new Intent(minorHarmonic.this, MainMenu.class);
		            startActivity(i);
		            break;
		        case R.id.aflatharmb:
		        	scaleName = "aflatharmmin";
		        	j.putExtra("key", scaleName);
					
		            startActivity(j);
		            break;
		        case R.id.aharmb:
		        	scaleName = "aharmmin";
		        	j.putExtra("key", scaleName);
		        	startActivity(j);
		        	break;
		        case R.id.bflatharmb:
		        	scaleName = "bflatharmmin";
		        	j.putExtra("key", scaleName);
		        	startActivity(j);
		        	break;
		        case R.id.bharmb:
		        	scaleName = "bharmmin";
		        	j.putExtra("key", scaleName);
		            startActivity(j);
		            break;
		        case R.id.charmb:
		        	scaleName = "charmmin";
		        	j.putExtra("key", scaleName);
		            startActivity(j);
		            break;
		        case R.id.dflatharmb:
		        	scaleName = "dflatharmmin";
		        	j.putExtra("key", scaleName);
		            startActivity(j);
		            break;
		        case R.id.dharmb:
		        	scaleName = "dharmmin";
		        	j.putExtra("key", scaleName);
		            startActivity(j);
		            break;
		        case R.id.eflatharmb:
		        	scaleName = "eflatharmmin";
		        	j.putExtra("key", scaleName);
		            startActivity(j);
		            break;
		        case R.id.eharmb:
		        	scaleName = "eharmmin";
		        	j.putExtra("key", scaleName);
		            startActivity(j);
		            break;
		        case R.id.fharmb:
		        	scaleName = "fharmmin";
		        	j.putExtra("key", scaleName);
		            startActivity(j);
		            break;
		        case R.id.fsharpharmb:
		        	scaleName = "fsharpharmmin";
		        	j.putExtra("key", scaleName);
		            startActivity(j);
		            break;
		        case R.id.gharmb:
		        	scaleName = "gharmmin";
		        	j.putExtra("key", scaleName);
		            startActivity(j);
		            break;
		        
		           
		        
	
	}

}
}
		
