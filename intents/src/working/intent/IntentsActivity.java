package working.intent;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class IntentsActivity extends Activity{
   Button b;
   EditText et;
  // public static final String Extraval="hey wats up!!!";
   
   public static final String EXTRA_MESSAGE="hey wats up!!!";
	/** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        b=(Button)findViewById(R.id.button1);
        et=(EditText)findViewById(R.id.editText1);
        b.setOnClickListener(new OnClickListener(){
        	
        @Override
      public void onClick(View v) {
       Intent i=new Intent(IntentsActivity.this,Second.class);
       String data=et.getText().toString();
       String  msg="Hey Wats Up!!!";
       i.putExtra(EXTRA_MESSAGE,msg);
       
        Bundle packet=new Bundle();
				packet.putString("key", data);
				i.putExtras(packet);
				startActivity(i);
				finish();
        
       
       

   // 
     // i.putExtra(EXTRA_MESSAGE,mesg);
   
     // startActivity(i);
        	
        }
        	
        	
        });
        
    }
}