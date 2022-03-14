package com.kotlin.videoviewplayer

import android.net.Uri
import android.os.Bundle
import android.widget.MediaController
import android.widget.VideoView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //initial the video view player
        val videoView = findViewById<VideoView>(R.id.video_view)

        //set live url
        val uri = Uri.parse("https://commondatastorage.googleapis.com/gtv-videos-bucket/sample/Sintel.mp4")

        //set video player url
        videoView.setVideoURI(uri)

        //add media controller
        val mediaController = MediaController(this)

        //Video view add to media anchor
        mediaController.setAnchorView(videoView)

        //set mediaplayer in video view
        mediaController.setMediaPlayer(videoView)

        //finally added to media player in video view
        videoView.setMediaController(mediaController)

        //video view start
        videoView.start()
    }
}

















