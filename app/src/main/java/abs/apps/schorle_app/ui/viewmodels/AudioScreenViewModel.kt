package abs.apps.schorle_app.ui.viewmodels

import abs.apps.schorle_app.data.files.IFileRepository
import abs.apps.schorle_app.ui.audio.IAudioPlayer
import abs.apps.schorle_app.ui.audio.IAudioRecorder
import androidx.lifecycle.ViewModel

class AudioScreenViewModel(
    private val recorder: IAudioRecorder,
    private val player: IAudioPlayer,
    private val repository: IFileRepository
) : ViewModel() {

    fun startRecording(fileName: String) {
        recorder.start(repository.getFile(fileName));
    }

    fun stopRecording() {
        recorder.stop();
    }

    fun playRecord(fileName: String) {
        player.play(repository.getFile(fileName))
    }
}