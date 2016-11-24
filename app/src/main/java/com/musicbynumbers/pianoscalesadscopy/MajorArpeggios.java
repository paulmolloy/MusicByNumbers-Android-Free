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


public class MajorArpeggios extends Activity implements View.OnClickListener  {
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
		setContentView(R.layout.majorarpeggios);
		j  = new Intent(this, display.class);
		mainMenu = (ImageButton) findViewById(R.id.imagelogo);
		aflatmin = (Button) findViewById(R.id.aflatmajarpb);
		amin = (Button) findViewById(R.id.amajarpb);
		bflatmin = (Button) findViewById(R.id.bflatmajarpb);
		bmin = (Button) findViewById(R.id.bmajarpb);
		cmin = (Button) findViewById(R.id.cmajarpb);
		dflatmin = (Button) findViewById(R.id.dflatmajarpb);
		dmin = (Button) findViewById(R.id.dmajarpb);
		eflatmin = (Button) findViewById(R.id.eflatmajarpb);
		emin = (Button) findViewById(R.id.emajarpb);
		fmin = (Button) findViewById(R.id.fmajarpb);
		fsharpmin = (Button) findViewById(R.id.fsharpmajarpb);
		gmin = (Button) findViewById(R.id.gmajarpb);
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
		            Intent i =  new Intent(MajorArpeggios.this, MainMenu.class);
		            startActivity(i);
		            break;
		        case R.id.aflatmajarpb:
		        	scaleName = "aflatmajarp";
		        	j.putExtra("key", scaleName);
					
		            startActivity(j);
		            break;
		        case R.id.amajarpb:
		        	scaleName = "amajarp";
		        	j.putExtra("key", scaleName);
		        	startActivity(j);
		        	break;
		        case R.id.bflatmajarpb:
		        	scaleName = "bflatmajarp";
		        	j.putExtra("key", scaleName);
		        	startActivity(j);
		        	break;
		        case R.id.bmajarpb:
		        	scaleName = "bmajarp";
		        	j.putExtra("key", scaleName);
		            startActivity(j);
		            break;
		        case R.id.cmajarpb:
		        	scaleName = "cmajarp";
		        	j.putExtra("key", scaleName);
		            startActivity(j);
		            break;
		        case R.id.dflatmajarpb:
		        	scaleName = "dflatmajarp";
		        	j.putExtra("key", scaleName);
		            startActivity(j);
		            break;
		        case R.id.dmajarpb:
		        	scaleName = "dmajarp";
		        	j.putExtra("key", scaleName);
		            startActivity(j);
		            break;
		        case R.id.eflatmajarpb:
		        	scaleName = "eflatmajarp";
		        	j.putExtra("key", scaleName);
		            startActivity(j);
		            break;
		        case R.id.emajarpb:
		        	scaleName = "emajarp";
		        	j.putExtra("key", scaleName);
		            startActivity(j);
		            break;
		        case R.id.fmajarpb:
		        	scaleName = "fmajarp";
		        	j.putExtra("key", scaleName);
		            startActivity(j);
		            break;
		        case R.id.fsharpmajarpb:
		        	scaleName = "fsharpmajarp";
		        	j.putExtra("key", scaleName);
		            startActivity(j);
		            break;
		        case R.id.gmajarpb:
		        	scaleName = "gmajarp";
		        	j.putExtra("key", scaleName);
		            startActivity(j);
		            break;
		        
		           
		        
	
	}

}
}
		

