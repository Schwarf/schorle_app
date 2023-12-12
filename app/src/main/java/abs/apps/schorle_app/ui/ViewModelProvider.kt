package abs.apps.schorle_app.ui

import abs.apps.schorle_app.ui.audio.AudioRecorder
import abs.apps.schorle_app.ui.viewmodels.AudioScreenViewModel
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory

object ViewModelProvider {
    val Factory = viewModelFactory {
        // Initializer for HomeViewModel
        initializer {
            AudioScreenViewModel(AudioRecorder, )
        }
    }