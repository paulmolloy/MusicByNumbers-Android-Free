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

public class HowItWorks extends Activity implements View.OnClickListener {
	
Button fingers, keyboard;
ImageButton mainMenu;
Intent j;
String scaleName;

@Override
protected void onCreate(Bundle savedInstanceState) {
	// TODO Auto-generated method stub
	super.onCreate(savedInstanceState);
	getWindow().setFormat(PixelFormat.RGBA_8888);
	getWindow().addFlags(WindowManager.LayoutParams.FLAG_DITHER);
	setContentView(R.layout.howitworks);
	j  = new Intent(this, display.class);
	mainMenu = (ImageButton) findViewById(R.id.imagelogo);
	fingers = (Button) findViewById(R.id.fingersb);
	keyboard = (Button) findViewById(R.id.keyboardsb);
	
	mainMenu.setOnClickListener(this);
	fingers.setOnClickListener(this);
	keyboard.setOnClickListener(this);
	
	
	

}



	
	
	
	 @Override
	    public void onClick(View arg0) {
	        // TODO Auto-generated method stub
	        switch(arg0.getId()){
	        case R.id.imagelogo:
	            Intent i =  new Intent(HowItWorks.this, MainMenu.class);
	            startActivity(i);
	            break;
	        case R.id.fingersb:
	        	scaleName = "fingers";
	        	j.putExtra("key", scaleName);
				
	            startActivity(j);
	            break;
	        case R.id.keyboardsb:
	        	scaleName = "keyboards";
	        	j.putExtra("key", scaleName);
	        	startActivity(j);
	        	break;
	        
	           
	        

}

}

	



	}


