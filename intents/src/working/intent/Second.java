package working.intent;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

public class Second extends Activity{
	EditText et1;
	String s2;
	String name;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.secondxml);
		et1=(EditText)findViewById(R.id.editText2);
		Intent i=getIntent();
	
	s2= i.getStringExtra(IntentsActivity.EXTRA_MESSAGE);
	//i.setData(Uri.parse(et1.getText().toString()));
	Toast.makeText(getBaseContext(),s2,Toast.LENGTH_LONG).show();
	
	 Bundle receive=new Bundle();
		receive=getIntent().getExtras();
		name=receive.getString("key");
		et1.setText("Welcome "+name);
	 
	
	
	
	
	
	
	//	setResult(RESULT_OK,i);
		//Toast.makeText(getBaseContext(), s2,Toast.LENGTH_SHORT).show();
	//	TextView textView = new TextView(this);
	  //  textView.setTextSize(40);
	//    textView.setText("my page"+message);
		
		//setContentView(textView);
	}

}
