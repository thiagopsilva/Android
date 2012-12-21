package org.example.audio;

import android.app.Activity;
import org.example.audio.R;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;
import android.view.View.OnClickListener;
import android.view.View;
	
public class Audio extends Activity implements OnClickListener {
	private MediaPlayer mp;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_audio);
		setVolumeControlStream(AudioManager.STREAM_MUSIC);
		findViewById(R.id.button_1).setOnClickListener(this);
		findViewById(R.id.button_2).setOnClickListener(this);
		findViewById(R.id.button_3).setOnClickListener(this);
		findViewById(R.id.button_4).setOnClickListener(this);
		findViewById(R.id.button_5).setOnClickListener(this);
		findViewById(R.id.button_6).setOnClickListener(this);
		findViewById(R.id.button_7).setOnClickListener(this);
		findViewById(R.id.button_8).setOnClickListener(this);
		findViewById(R.id.button_9).setOnClickListener(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_audio, menu);
		return true;
	}
	
	public void onClick(View v) {
		int	resId;
		switch (v.getId()){
		case R.id.button_1: resId = R.raw.button_1; break;
		case R.id.button_2: resId = R.raw.button_2; break;
		case R.id.button_3: resId = R.raw.button_3; break;
		case R.id.button_4: resId = R.raw.button_4; break;
		case R.id.button_5: resId = R.raw.button_5; break;
		case R.id.button_6: resId = R.raw.button_6; break;
		case R.id.button_7: resId = R.raw.button_7; break;
		case R.id.button_8: resId = R.raw.button_8; break;
		case R.id.button_9: resId = R.raw.button_9; break;
		default: 			resId = R.raw.button_1; break;
		}
		// Release any resourses from previous MediaPlayer
		if (mp != null) {
			mp.release();
		}
		// Create a new MediaPlayer to play this sound
		mp = MediaPlayer.create(this, resId);
		mp.start();
	}
}
