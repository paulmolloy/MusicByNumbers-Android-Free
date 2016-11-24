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

public class PentatonicScales extends Activity implements View.OnClickListener  {
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
		setContentView(R.layout.pentatonicscales);
		j  = new Intent(this, display.class);
		mainMenu = (ImageButton) findViewById(R.id.imagelogo);
		aflatmaj = (Button) findViewById(R.id.aflatpentb);
		amaj = (Button) findViewById(R.id.apentb);
		bflatmaj = (Button) findViewById(R.id.bflatpentb);
		bmaj = (Button) findViewById(R.id.bpentb);
		cmaj = (Button) findViewById(R.id.cpentb);
		dflatmaj = (Button) findViewById(R.id.dflatpentb);
		dmaj = (Button) findViewById(R.id.dpentb);
		eflatmaj = (Button) findViewById(R.id.eflatpentb);
		emaj = (Button) findViewById(R.id.epentb);
		fmaj = (Button) findViewById(R.id.fpentb);
		fsharpmaj = (Button) findViewById(R.id.fsharppentb);
		gmaj = (Button) findViewById(R.id.gpentb);
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
		            Intent i =  new Intent(PentatonicScales.this, MainMenu.class);
		            startActivity(i);
		            break;
		        case R.id.aflatpentb:
		        	scaleName = "aflatmajpent";
		        	j.putExtra("key", scaleName);
					
		            startActivity(j);
		            break;
		        case R.id.apentb:
		        	scaleName = "apent";
		        	j.putExtra("key", scaleName);
		        	startActivity(j);
		        	break;
		        case R.id.bflatpentb:
		        	scaleName = "bflatpent";
		        	j.putExtra("key", scaleName);
		        	startActivity(j);
		        	break;
		        case R.id.bpentb:
		        	scaleName = "bmajpent";
		        	j.putExtra("key", scaleName);
		            startActivity(j);
		            break;
		        case R.id.cpentb:
		        	scaleName = "cpent";
		        	j.putExtra("key", scaleName);
		            startActivity(j);
		            break;
		        case R.id.dflatpentb:
		        	scaleName = "dflatpent";
		        	j.putExtra("key", scaleName);
		            startActivity(j);
		            break;
		        case R.id.dpentb:
		        	scaleName = "dpent";
		        	j.putExtra("key", scaleName);
		            startActivity(j);
		            break;
		        case R.id.eflatpentb:
		        	scaleName = "eflatpent";
		        	j.putExtra("key", scaleName);
		            startActivity(j);
		            break;
		        case R.id.epentb:
		        	scaleName = "epent";
		        	j.putExtra("key", scaleName);
		            startActivity(j);
		            break;
		        case R.id.fpentb:
		        	scaleName = "fpent";
		        	j.putExtra("key", scaleName);
		            startActivity(j);
		            break;
		        case R.id.fsharppentb:
		        	scaleName = "fsharppent";
		        	j.putExtra("key", scaleName);
		            startActivity(j);
		            break;
		        case R.id.gpentb:
		        	scaleName = "gpent";
		        	j.putExtra("key", scaleName);
		            startActivity(j);
		            break;
		        
		           
		        
	
	}

}
}
		
