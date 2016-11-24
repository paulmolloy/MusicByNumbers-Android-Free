package com.musicbynumbers.pianoscalesadscopy;



import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.graphics.PixelFormat;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton; 

import com.google.ads.AdRequest;
import com.google.ads.AdView;
import com.musicbynumbers.pianoscalesadscopy.R;

public class majorScales extends Activity implements View.OnClickListener  {
	Button aflatmaj, amaj, bflatmaj, bmaj, cmaj, dflatmaj, dmaj, eflatmaj, emaj, fmaj, fsharpmaj, gmaj;  
	ImageButton mainMenu;
	Intent j;
	String scaleName;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		getWindow().setFormat(PixelFormat.RGBA_8888);
		getWindow().addFlags(WindowManager.LayoutParams.FLAG_DITHER);
		setContentView(R.layout.majorscales);
		 AdView ad = (AdView)findViewById(R.id.ad);
		  ad.loadAd(new AdRequest());
		  
		j  = new Intent(this, display.class);
		mainMenu = (ImageButton) findViewById(R.id.imagelogo);
		aflatmaj = (Button) findViewById(R.id.aflatmajb);
		amaj = (Button) findViewById(R.id.amajb);
		bflatmaj = (Button) findViewById(R.id.bflatmajb);
		bmaj = (Button) findViewById(R.id.bmajb);
		cmaj = (Button) findViewById(R.id.cmajb);
		dflatmaj = (Button) findViewById(R.id.dflatmajb);
		dmaj = (Button) findViewById(R.id.dmajb);
		eflatmaj = (Button) findViewById(R.id.eflatmajb);
		emaj = (Button) findViewById(R.id.emajb);
		fmaj = (Button) findViewById(R.id.fmajb);
		fsharpmaj = (Button) findViewById(R.id.fsharpmajb);
		gmaj = (Button) findViewById(R.id.gmajb);
		mainMenu.setOnClickListener(this);
		aflatmaj.setOnClickListener(this);
		amaj.setOnClickListener(this);
		bflatmaj.setOnClickListener(this);
		bmaj.setOnClickListener(this);
		cmaj.setOnClickListener(this);
		dflatmaj.setOnClickListener(this);
		dmaj.setOnClickListener(this);
		eflatmaj.setOnClickListener(this);
		emaj.setOnClickListener(this);
		fmaj.setOnClickListener(this);
		fsharpmaj.setOnClickListener(this);
		gmaj.setOnClickListener(this);
		
		
	
	}
	

	
		
		
		
		 @Override
		    public void onClick(View arg0) {
		        // TODO Auto-generated method stub
		        switch(arg0.getId()){
		        case R.id.imagelogo:
		            Intent i =  new Intent(majorScales.this, MainMenu.class);
		            startActivity(i);
		            break;
		        case R.id.aflatmajb:
		        	scaleName = "aflatmaj";
		        	j.putExtra("key", scaleName);
					
		            startActivity(j);
		            break;
		        case R.id.amajb:
		        	scaleName = "amaj";
		        	j.putExtra("key", scaleName);
		        	startActivity(j);
		        	break;
		        case R.id.bflatmajb:
		        	scaleName = "bflatmaj";
		        	j.putExtra("key", scaleName);
		        	startActivity(j);
		        	break;
		        case R.id.bmajb:
		        	scaleName = "bmaj";
		        	j.putExtra("key", scaleName);
		            startActivity(j);
		            break;
		        case R.id.cmajb:
		        	scaleName = "cmaj";
		        	j.putExtra("key", scaleName);
		            startActivity(j);
		            break;
		        case R.id.dflatmajb:
		        	scaleName = "dflatmaj";
		        	j.putExtra("key", scaleName);
		            startActivity(j);
		            break;
		        case R.id.dmajb:
		        	scaleName = "dmaj";
		        	j.putExtra("key", scaleName);
		            startActivity(j);
		            break;
		        case R.id.eflatmajb:
		        	scaleName = "eflatmaj";
		        	j.putExtra("key", scaleName);
		            startActivity(j);
		            break;
		        case R.id.emajb:
		        	scaleName = "emaj";
		        	j.putExtra("key", scaleName);
		            startActivity(j);
		            break;
		        case R.id.fmajb:
		        	scaleName = "fmaj";
		        	j.putExtra("key", scaleName);
		            startActivity(j);
		            break;
		        case R.id.fsharpmajb:
		        	scaleName = "fsharpmaj";
		        	j.putExtra("key", scaleName);
		            startActivity(j);
		            break;
		        case R.id.gmajb:
		        	scaleName = "gmaj";
		        	j.putExtra("key", scaleName);
		            startActivity(j);
		            break;
		        
		           
		        
	
	}

}
}
		
