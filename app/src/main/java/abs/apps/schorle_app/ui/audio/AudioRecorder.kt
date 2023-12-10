package abs.apps.schorle_app.ui.audio

import android.content.Context
import android.media.MediaRecorder
import java.io.File

class AudioRecorder(private val context: Context) : IAudioRecorder {

    private var recorder : MediaRecorder? = null

    private fun createRecorder()
    override fun start(outputFile : File)
    {

    }

    override fun stop() {
        TODO("Not yet implemented")
    }
}