package com.onepagetoanother;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class SecondPage extends Activity{
	Button b1;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.secondpage);
		b1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Toast.makeText(getApplicationContext(), "From Second page to first page", Toast.LENGTH_LONG).show();
				Intent i = new Intent(SecondPage.this, MainActivity.class);
			    startActivity(i);
			    
			}
		});
	}

}
