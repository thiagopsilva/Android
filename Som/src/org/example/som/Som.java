package org.example.som;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;

public class Som extends Activity {
	ImageButton btplay, btpausar, btstop;
	MediaPlayer player;
	//boolean Click;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_som);

		btplay = (ImageButton) findViewById(R.id.bttocar);
		btpausar = (ImageButton) findViewById(R.id.btpausar);
		player = MediaPlayer.create(this, R.raw.musica);
		btstop = (ImageButton) findViewById(R.id.btstop);
		

		try {
			player.prepare();
		} catch (Exception e) {
		}

		
		OnClickListener comeca = new View.OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				if (player == null){
				    player = MediaPlayer.create(Som.this, R.raw.musica);
				    player.start();
				}else{ 
					
						player.start();
					}
			}
		};

		
		btplay.setOnClickListener(comeca);
		
		btstop.setOnClickListener(new View.OnClickListener(){
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				player.stop();
				if (player != null);
					player.release();
					player = null;
			}
		});

		btpausar.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View arg0) {

				player.pause();

			}
		});
		
		
	}

}