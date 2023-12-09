package abs.apps.schorle_app.ui.screens


import abs.apps.schorle_app.R
import abs.apps.schorle_app.ui.navigation.INavigationDestination
import android.media.MediaPlayer
import android.util.Log
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kotlin.random.Random

object StartDestination : INavigationDestination {
    override val route = "start"
    override val titleResource = R.string.app_name
}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun StartScreen(
    navigateToSchorleCounter: () -> Unit,
    navigateToBagageTracking: () -> Unit
) {
    var playSound by remember { mutableStateOf(false) }

    if (playSound) {
        PlayQuote()
        playSound = false // Reset the state
    }

    Scaffold()
    { padding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(padding),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        )
        {
            LargeTileButton(text = "Zufall Zitat", onClick = { playSound = true})
            Spacer(modifier = Modifier.height(16.dp))
            LargeTileButton(text = "D'Schorle Zähler", onClick = navigateToSchorleCounter)
            Spacer(modifier = Modifier.height(16.dp))
            LargeTileButton(text = "Bring en neie Schorlinski zu de Bagage",
                onClick = navigateToBagageTracking
            )
        }

    }
}


@Composable
fun LargeTileButton(text: String, onClick: () -> Unit) {
    Button(
        onClick = { onClick() },
        modifier = Modifier
            .fillMaxWidth()
            .heightIn(min = 150.dp)
    ) {
        Text(text = text, fontSize = 20.sp)
    }
}

@Composable
fun PlayQuote() {
    val context = LocalContext.current
    val sounds = listOf(
        R.raw.aggression,
        R.raw.bringwaszumfressen,
        R.raw.fettequalle,
        R.raw.kalkleiste,
        R.raw.kohlen,
        R.raw.lalala,
        R.raw.landvogt,
        R.raw.fuck3,
        R.raw.shutthefuck,
        R.raw.walterwhites
    )

        val randomSoundId = sounds[Random.nextInt(sounds.size)]
        val mediaPlayer = MediaPlayer.create(context, randomSoundId)
        mediaPlayer.start()
}

