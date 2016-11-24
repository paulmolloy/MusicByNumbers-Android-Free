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


public class ContraryMotion extends Activity implements View.OnClickListener  {
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
		setContentView(R.layout.contrarymotion);
		j  = new Intent(this, display.class);
		mainMenu = (ImageButton) findViewById(R.id.imagelogo);
		aflatmaj = (Button) findViewById(R.id.aflatcontb);
		amaj = (Button) findViewById(R.id.acontb);
		bflatmaj = (Button) findViewById(R.id.bflatcontb);
		bmaj = (Button) findViewById(R.id.bcontb);
		cmaj = (Button) findViewById(R.id.ccontb);
		dflatmaj = (Button) findViewById(R.id.dflatcontb);
		dmaj = (Button) findViewById(R.id.dcontb);
		eflatmaj = (Button) findViewById(R.id.eflatcontb);
		emaj = (Button) findViewById(R.id.econtb);
		fmaj = (Button) findViewById(R.id.fcontb);
		fsharpmaj = (Button) findViewById(R.id.fsharpcontb);
		gmaj = (Button) findViewById(R.id.gcontb);
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
		            Intent i =  new Intent(ContraryMotion.this, MainMenu.class);
		            startActivity(i);
		            break;
		        case R.id.aflatcontb:
		        	scaleName = "aflatmajharmcont";
		        	j.putExtra("key", scaleName);
					
		            startActivity(j);
		            break;
		        case R.id.acontb:
		        	scaleName = "amajharmcont";
		        	j.putExtra("key", scaleName);
		        	startActivity(j);
		        	break;
		        case R.id.bflatcontb:
		        	scaleName = "bflatmajharmcont";
		        	j.putExtra("key", scaleName);
		        	startActivity(j);
		        	break;
		        case R.id.bcontb:
		        	scaleName = "bmajharmcont";
		        	j.putExtra("key", scaleName);
		            startActivity(j);
		            break;
		        case R.id.ccontb:
		        	scaleName = "cmajharmcont";
		        	j.putExtra("key", scaleName);
		            startActivity(j);
		            break;
		        case R.id.dflatcontb:
		        	scaleName = "dflatmajharmcont";
		        	j.putExtra("key", scaleName);
		            startActivity(j);
		            break;
		        case R.id.dcontb:
		        	scaleName = "dmajharmcont";
		        	j.putExtra("key", scaleName);
		            startActivity(j);
		            break;
		        case R.id.eflatcontb:
		        	scaleName = "eflatmajharmcont";
		        	j.putExtra("key", scaleName);
		            startActivity(j);
		            break;
		        case R.id.econtb:
		        	scaleName = "emajharmcont";
		        	j.putExtra("key", scaleName);
		            startActivity(j);
		            break;
		        case R.id.fcontb:
		        	scaleName = "fmajharmcont";
		        	j.putExtra("key", scaleName);
		            startActivity(j);
		            break;
		        case R.id.fsharpcontb:
		        	scaleName = "fsharpmajharmcont";
		        	j.putExtra("key", scaleName);
		            startActivity(j);
		            break;
		        case R.id.gcontb:
		        	scaleName = "gmajharmcont";
		        	j.putExtra("key", scaleName);
		            startActivity(j);
		            break;
		        
		           
		        
	
	}

}
}
		

