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


public class ChromaticScales extends Activity implements View.OnClickListener  {
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
		setContentView(R.layout.chromaticscales);
		j  = new Intent(this, display.class);
		mainMenu = (ImageButton) findViewById(R.id.imagelogo);
		aflatmaj = (Button) findViewById(R.id.aflatchromeb);
		amaj = (Button) findViewById(R.id.achromeb);
		bflatmaj = (Button) findViewById(R.id.bflatchromeb);
		bmaj = (Button) findViewById(R.id.bchromeb);
		cmaj = (Button) findViewById(R.id.cchromeb);
		dflatmaj = (Button) findViewById(R.id.dflatchromeb);
		dmaj = (Button) findViewById(R.id.dchromeb);
		eflatmaj = (Button) findViewById(R.id.eflatchromeb);
		emaj = (Button) findViewById(R.id.echromeb);
		fmaj = (Button) findViewById(R.id.fchromeb);
		fsharpmaj = (Button) findViewById(R.id.fsharpchromeb);
		gmaj = (Button) findViewById(R.id.gchromeb);
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
		            Intent i =  new Intent(ChromaticScales.this, MainMenu.class);
		            startActivity(i);
		            break;
		        case R.id.aflatchromeb:
		        	scaleName = "aflatchrome";
		        	j.putExtra("key", scaleName);
					
		            startActivity(j);
		            break;
		        case R.id.achromeb:
		        	scaleName = "achrome";
		        	j.putExtra("key", scaleName);
		        	startActivity(j);
		        	break;
		        case R.id.bflatchromeb:
		        	scaleName = "bflatchrome";
		        	j.putExtra("key", scaleName);
		        	startActivity(j);
		        	break;
		        case R.id.bchromeb:
		        	scaleName = "bchrome";
		        	j.putExtra("key", scaleName);
		            startActivity(j);
		            break;
		        case R.id.cchromeb:
		        	scaleName = "cchrome";
		        	j.putExtra("key", scaleName);
		            startActivity(j);
		            break;
		        case R.id.dflatchromeb:
		        	scaleName = "dflatchrome";
		        	j.putExtra("key", scaleName);
		            startActivity(j);
		            break;
		        case R.id.dchromeb:
		        	scaleName = "dchrome";
		        	j.putExtra("key", scaleName);
		            startActivity(j);
		            break;
		        case R.id.eflatchromeb:
		        	scaleName = "eflatchrome";
		        	j.putExtra("key", scaleName);
		            startActivity(j);
		            break;
		        case R.id.echromeb:
		        	scaleName = "echrome";
		        	j.putExtra("key", scaleName);
		            startActivity(j);
		            break;
		        case R.id.fchromeb:
		        	scaleName = "fchrome";
		        	j.putExtra("key", scaleName);
		            startActivity(j);
		            break;
		        case R.id.fsharpchromeb:
		        	scaleName = "fsharpchrome";
		        	j.putExtra("key", scaleName);
		            startActivity(j);
		            break;
		        case R.id.gchromeb:
		        	scaleName = "gchrome";
		        	j.putExtra("key", scaleName);
		            startActivity(j);
		            break;
		        
		           
		        
	
	}

}
}
		
