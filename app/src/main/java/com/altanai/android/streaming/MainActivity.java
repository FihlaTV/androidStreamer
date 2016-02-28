package com.altanai.android.streaming;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

    private Button mCameraStreamingBtn;
    private Button mAudioStreamingBtn;
    private Button mScreencaptureStreamingBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mScreencaptureStreamingBtn = (Button) findViewById(R.id.screencapture_streaming_btn);
        mScreencaptureStreamingBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ScreenCaptureActivity.class);
                startActivity(intent);
            }
        });

        mCameraStreamingBtn = (Button) findViewById(R.id.start_camera_streaming_btn);
        mCameraStreamingBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, CameraStreamingActivity.class);
                startActivity(intent);
            }
        });

        mAudioStreamingBtn = (Button) findViewById(R.id.start_pure_audio_streaming_btn);
        mAudioStreamingBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, AudioStreamingActivity.class);
                startActivity(intent);
            }
        });
    }
}
