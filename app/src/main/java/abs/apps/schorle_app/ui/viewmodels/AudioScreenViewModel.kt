package abs.apps.schorle_app.ui.viewmodels

import abs.apps.schorle_app.ui.audio.IAudioPlayer
import abs.apps.schorle_app.ui.audio.IAudioRecorder
import androidx.compose.ui.platform.LocalContext
import androidx.lifecycle.ViewModel

class AudioScreenViewModel(private val recorder: IAudioRecorder, private val player: IAudioPlayer) : ViewModel(){

    fun startRecording()
    {
        val context = LocalContext.current

        recorder.start();
    }

    fun stopRecording()
    {
        recorder.stop();
    }

    fun saveRecordingAs(name: String)
    {
        recorder.stop();
    }


    fun playRecord()
    {
        re;
    }
}