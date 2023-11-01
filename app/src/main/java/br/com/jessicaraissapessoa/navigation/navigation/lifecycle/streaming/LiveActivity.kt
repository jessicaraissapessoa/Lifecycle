package br.com.jessicaraissapessoa.navigation.navigation.lifecycle.streaming

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class LiveActivity : AppCompatActivity() {

    private val liveVideo = LiveVideo()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        lifecycle.addObserver(liveVideo) //Adicionando o observer de liveVideo (liveVideo.kt)
    }

//    Implementação manual do LiveVideo
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        liveVideo.start()
//    }
//
//    override fun onPause() {
//        super.onPause()
//        liveVideo.stop()
//    }
//
//    override fun onDestroy() {
//        super.onDestroy()
//        liveVideo.release()
//    }

}