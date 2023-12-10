package abs.apps.schorle_app.ui.audio

import java.io.File

interface IAudioRecorder {
    fun start(outputFile: File)
    fun stop()
}