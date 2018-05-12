package sms.one;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SMSActivity extends Activity {
	EditText ET1, ET2;
	Button Btn1;
	SmsManager sms;
	PendingIntent pi1, pi2; 
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        ET1 = (EditText)findViewById(R.id.EditText1);
        ET2 = (EditText)findViewById(R.id.EditText2);
        Btn1 = (Button)findViewById(R.id.Button1);
        sms=SmsManager.getDefault();
        /////////Sending Intent
        Intent i = new Intent("Msg_Sent");
        pi1 = PendingIntent.getBroadcast(getApplicationContext(), 0, i, 0);
        registerReceiver(new BroadcastReceiver() {
			
			@Override
			public void onReceive(Context arg0, Intent arg1) {
				// TODO Auto-generated method stub
				if(getResultCode()==Activity.RESULT_OK)
					Toast.makeText(getApplicationContext(), "Message was sent", Toast.LENGTH_LONG).show();
				
			}
		}, new IntentFilter("Msg_Sent"));
        ///////Sending Intent Ends
        
        
        ///////Delivery Report Intent
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        i = new Intent("Del_report");
        pi2 = PendingIntent.getBroadcast(getApplicationContext(), 0, i, 0);
        registerReceiver(new BroadcastReceiver() {
			
			@Override
			public void onReceive(Context arg0, Intent arg1) {
				// TODO Auto-generated method stub
				if(getResultCode()==Activity.RESULT_OK)
					Toast.makeText(arg0, "Delivery Report", Toast.LENGTH_LONG).show();
							
			}
		}, new IntentFilter("Del_report"));        
        /////////Delivery Report Intent ends
        
        Btn1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				String number, message;
				number = ET1.getText().toString();
				message = ET2.getText().toString();
				sms.sendTextMessage(number, null, message, pi1, pi2);
				
			}
		});
    }
}