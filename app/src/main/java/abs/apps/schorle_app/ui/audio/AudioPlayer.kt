package abs.apps.schorle_app.ui.audio

import android.content.Context
import android.media.MediaPlayer
import android.media.MediaRecorder
import androidx.core.net.toUri
import java.io.File

class AudioPlayer(private val context: Context) : IAudioPlayer {

    private var player : MediaPlayer? = null
    override fun play(file: File) {
        MediaPlayer.create(context, file.toUri()).apply {
            player = this
            start()
        }
    }

    override fun stop() {
        player?.stop()
        player?.release()
        player =  null
    }
}