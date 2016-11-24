package com.musicbynumbers.pianoscalesadscopy;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.PixelFormat;
import android.util.EventLogTags.Description;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

//import com.google.ads.AdRequest;
//import com.google.ads.AdView;
import com.musicbynumbers.pianoscalesadscopy.R;
import com.musicbynumbers.pianoscalesadscopy.R.string;






//public class MainMenu extends  LicenseCheckActivity implements View.OnClickListener   {
public class MainMenu extends Activity implements View.OnClickListener   {

	Button majScales, minHarm, minMel, majArp, minArp, chrome, cont, pent,how,buy ;
	ImageButton mainMenu;
	Intent j;
	Intent k;
	Intent l;
	Intent m;
	Intent n;
	Intent o;
	Intent p;
	Intent q;
	Intent r;

	

	
	@Override
	protected void onStart() {
		// TODO Auto-generated method stub
		super.onStart();
		
		SharedPreferences settings = this.getSharedPreferences("MyApp",0);
		boolean firstrun=settings.getBoolean("firstrun",true);
		if (firstrun) {
		  SharedPreferences.Editor e = settings.edit();
		  e.putBoolean("firstrun",false);
		  e.commit();
		 
		       

		    AlertDialog.Builder builder = new AlertDialog.Builder(this);
		    builder.setTitle("Buy the Full Version");
		    builder.setMessage(string.appinfo).setPositiveButton("Go to the App Store", dialogClickListener)
		        .setNegativeButton("Cancel", dialogClickListener).show();}
		    
		    //

		  // Do something here that you only want to happen the first time
		}
		    //
		    DialogInterface.OnClickListener dialogClickListener = new DialogInterface.OnClickListener() {
		        @Override
		        public void onClick(DialogInterface dialog, int which) {
		            switch (which){
		            case DialogInterface.BUTTON_POSITIVE:
		                //Yes button clicked
		            	try {
			        	    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("market://details?id=com.musicbynumbers.pianoscalesfull")));
			        	} catch (android.content.ActivityNotFoundException anfe) {
			        	    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=com.musicbynumbers.pianoscalesfull")));
			        	}
		            	
		                break;

		            case DialogInterface.BUTTON_NEGATIVE:
		                //No button clicked
		                break;
		            }
		        }
		    };

		
		    
		    //
		
	









	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		 requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFormat(PixelFormat.RGBA_8888);
		getWindow().addFlags(WindowManager.LayoutParams.FLAG_DITHER);
		setContentView(R.layout.activity_main_menu);
		// Toast.makeText(this, "Checking Application License", Toast.LENGTH_SHORT).show();
          // Check the license
          //checkLicense();
		 // AdView ad = (AdView)findViewById(R.id.ad);
		  //ad.loadAd(new AdRequest());
		  
		  
		 
		j = new Intent(MainMenu.this, majorScales.class);
		 k = new Intent(MainMenu.this, minorHarmonic.class);
		 l = new Intent(MainMenu.this, MajorArpeggios.class);
		 m = new Intent(MainMenu.this, MinorArpeggios.class);
		 n = new Intent(MainMenu.this, ChromaticScales.class);
		 o = new Intent(MainMenu.this, ContraryMotion.class);
		 p = new Intent(MainMenu.this, PentatonicScales.class);
		 q = new Intent(MainMenu.this, minorMelodic.class);
		 r = new Intent(MainMenu.this, HowItWorks.class);

		mainMenu = (ImageButton) findViewById(R.id.imagelogo);
		majScales = (Button) findViewById(R.id.majorscalesb);
		buy = (Button) findViewById(R.id.bBuyfull);
		
		minMel = (Button) findViewById(R.id.minormelodicb);
		
		how = (Button) findViewById(R.id.howitworksb);
		majScales.setOnClickListener(this);
		mainMenu.setOnClickListener(this);
		buy.setOnClickListener(this);
		
		minMel.setOnClickListener(this);
		
		
		how.setOnClickListener(this);
		
		
	
	}
	
		
		
		
		




		@Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
		SharedPreferences settings = this.getSharedPreferences("MyApp",0);
		  SharedPreferences.Editor e = settings.edit();
		  e.putBoolean("firstrun",true);
		  e.commit();}
		
	









		@Override
		    public void onClick(View arg0) {
		        // TODO Auto-generated method stub
		        switch(arg0.getId()){
		        case R.id.imagelogo:
		            Intent i =  new Intent(MainMenu.this, MainMenu.class);
		            startActivity(i);
		            break;
		        case R.id.majorscalesb:
		            
		            startActivity(j);
		            break;
		        		        case R.id.minormelodicb:
		        	
		        	startActivity(q);
		        	break;
		        	
		        case R.id.howitworksb:
		        	
		        	startActivity(r);
		        	break;
		        case R.id.bBuyfull:
		        	try {
		        	    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("market://details?id=com.musicbynumbers.pianoscalesfull")));
		        	} catch (android.content.ActivityNotFoundException anfe) {
		        	    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=com.musicbynumbers.pianoscalesfull")));
		        	}
		        	break;
		        
		        	
	
	}

}
		
}
	