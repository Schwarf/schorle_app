package abs.apps.schorle_app.ui.navigation

import abs.apps.schorle_app.ui.screens.StartDestination
import abs.apps.schorle_app.ui.screens.StartScreen
import abs.apps.schorle_app.ui.screens.StartupDestination
import abs.apps.schorle_app.ui.screens.StartupScreen
import android.annotation.SuppressLint
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun SchorleNavigation(navController: NavHostController = rememberNavController()) {
    SchorleNavHost(navController = navController)
}

@Composable
fun SchorleNavHost(
    navController: NavHostController,
    modifier: Modifier = Modifier,
) {
    NavHost(
        navController = navController,
        startDestination = StartupDestination.route,
        modifier = modifier
    )
    {
        composable(route = StartupDestination.route){
            StartupScreen(navigateToStartScreen = {navController.navigate(StartDestination.route)})
        }

        composable(route = StartDestination.route)
        {
            StartScreen(navigateToSchorleCounter = {}, navigateToBagageTracking = {})
        }
    }
}
