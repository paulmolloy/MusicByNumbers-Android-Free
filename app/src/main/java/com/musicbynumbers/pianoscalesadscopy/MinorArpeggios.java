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

public class MinorArpeggios extends Activity implements View.OnClickListener  {
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
		setContentView(R.layout.minorarpeggios);
		j  = new Intent(this, display.class);
		mainMenu = (ImageButton) findViewById(R.id.imagelogo);
		aflatmaj = (Button) findViewById(R.id.aflatminarpb);
		amaj = (Button) findViewById(R.id.aminarpb);
		bflatmaj = (Button) findViewById(R.id.bflatminarpb);
		bmaj = (Button) findViewById(R.id.bminarpb);
		cmaj = (Button) findViewById(R.id.cminarpb);
		dflatmaj = (Button) findViewById(R.id.dflatminarpb);
		dmaj = (Button) findViewById(R.id.dminarpb);
		eflatmaj = (Button) findViewById(R.id.eflatminarpb);
		emaj = (Button) findViewById(R.id.eminarpb);
		fmaj = (Button) findViewById(R.id.fminarpb);
		fsharpmaj = (Button) findViewById(R.id.fsharpminarpb);
		gmaj = (Button) findViewById(R.id.gminarpb);
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
		            Intent i =  new Intent(MinorArpeggios.this, MainMenu.class);
		            startActivity(i);
		            break;
		        case R.id.aflatminarpb:
		        	scaleName = "aflatminarp";
		        	j.putExtra("key", scaleName);
					
		            startActivity(j);
		            break;
		        case R.id.aminarpb:
		        	scaleName = "aminarp";
		        	j.putExtra("key", scaleName);
		        	startActivity(j);
		        	break;
		        case R.id.bflatminarpb:
		        	scaleName = "bflatminarp";
		        	j.putExtra("key", scaleName);
		        	startActivity(j);
		        	break;
		        case R.id.bminarpb:
		        	scaleName = "bminarp";
		        	j.putExtra("key", scaleName);
		            startActivity(j);
		            break;
		        case R.id.cminarpb:
		        	scaleName = "cmaj";
		        	j.putExtra("key", scaleName);
		            startActivity(j);
		            break;
		        case R.id.dflatminarpb:
		        	scaleName = "dflatminarp";
		        	j.putExtra("key", scaleName);
		            startActivity(j);
		            break;
		        case R.id.dminarpb:
		        	scaleName = "dminarp";
		        	j.putExtra("key", scaleName);
		            startActivity(j);
		            break;
		        case R.id.eflatminarpb:
		        	scaleName = "eflatminarp";
		        	j.putExtra("key", scaleName);
		            startActivity(j);
		            break;
		        case R.id.eminarpb:
		        	scaleName = "eminarp";
		        	j.putExtra("key", scaleName);
		            startActivity(j);
		            break;
		        case R.id.fminarpb:
		        	scaleName = "fminarp";
		        	j.putExtra("key", scaleName);
		            startActivity(j);
		            break;
		        case R.id.fsharpminarpb:
		        	scaleName = "fsharpminarp";
		        	j.putExtra("key", scaleName);
		            startActivity(j);
		            break;
		        case R.id.gminarpb:
		        	scaleName = "gminarp";
		        	j.putExtra("key", scaleName);
		            startActivity(j);
		            break;
		        
		           
		        
	
	}

}
}
		
