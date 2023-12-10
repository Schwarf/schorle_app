package abs.apps.schorle_app.ui.audio

import java.io.File

interface IAudioPlayer {
    fun play(file: File)
    fun stop()
}