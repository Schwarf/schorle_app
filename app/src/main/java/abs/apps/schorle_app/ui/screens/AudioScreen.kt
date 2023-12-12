package abs.apps.schorle_app.ui.screens

import abs.apps.schorle_app.R
import abs.apps.schorle_app.ui.navigation.INavigationDestination
import androidx.compose.runtime.Composable

object AudioScreenDestination : INavigationDestination {
    override val route = "audio_screen"
    override val titleResource = R.string.audio_title
}

@Composable
fun AudioScreen(){

}

