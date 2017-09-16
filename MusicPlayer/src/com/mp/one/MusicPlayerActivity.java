package com.mp.one;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MusicPlayerActivity extends Activity {
	Button shuru, rukja;
	MediaPlayer song;
	Uri uri;
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        song=MediaPlayer.create(getApplicationContext(),R.raw.sng);
        shuru = (Button)findViewById(R.id.Button2);
        rukja = (Button)findViewById(R.id.Button1);
        shuru.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				song.start();
				
			}
		});
        rukja.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				song.pause();//calling pause method
				Intent i = new Intent(android.content.Intent.ACTION_GET_CONTENT);
				i.setType("audio/*");										//Searches for audio files
				startActivityForResult(i, 0);
			}
		});
    }
	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		song.release();				//It releases the memory occupied by the music file
	}
	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		// TODO Auto-generated method stub
		super.onActivityResult(requestCode, resultCode, data);
		uri=data.getData();
        song=MediaPlayer.create(getApplicationContext(),uri);
	}
	
	
    
}