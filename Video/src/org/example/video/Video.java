package org.example.video;

import android.app.Activity;
import android.os.Bundle;
import android.widget.VideoView;
public class Video extends Activity {
	@Override
	public void onCreate(Bundle savedInstanceState) {
			super.onCreate(savedInstanceState);
			// Fill view from resource
				setContentView(R.layout.activity_video);
				VideoView video = (VideoView) findViewById(R.id.video);
				// Load and start the movie
				video.setVideoPath("/data/samplevideo.3gp");
				video.start();
		}
}