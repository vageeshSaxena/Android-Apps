package com.calculator;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {
	 Button b1,b2,b3,b4;
	 EditText et1,et2;
	 TextView tv;
	 String num1,num2;
	 double result;
	 
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = (Button)findViewById(R.id.button1);
        b2 = (Button)findViewById(R.id.button2);
        b3 = (Button)findViewById(R.id.button3);
        b4 = (Button)findViewById(R.id.button4);
        
        et1 = (EditText)findViewById(R.id.editText1);
        et2 = (EditText)findViewById(R.id.editText2);
        
        tv = (TextView)findViewById(R.id.textView1);
        b1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				num1 = et1.getText().toString();
				num2 = et2.getText().toString();
				result = Double.parseDouble(num1) + Double.parseDouble(num2);
				tv.setText(Double.toString(result));
			}
		});
    }


    
}
