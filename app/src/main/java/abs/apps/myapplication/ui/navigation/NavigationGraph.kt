package abs.apps.myapplication.ui.navigation

import abs.apps.myapplication.ui.screens.StartupDestination
import android.annotation.SuppressLint
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
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
//    NavHost(
//        navController = navController,
//        startDestination = StartupDestination.route,
//        modifier = modifier
//    )
}
