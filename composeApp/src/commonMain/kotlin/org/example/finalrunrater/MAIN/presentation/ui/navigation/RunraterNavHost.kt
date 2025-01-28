package org.example.finalrunrater.MAIN.presentation.ui.navigation

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import org.example.finalrunrater.MAIN.presentation.ui.activities.Screens.BetScreen
import org.example.finalrunrater.MAIN.presentation.ui.activities.Screens.HomeScreen

@Composable
fun RunraterNavHost(navController: NavHostController) {
    // Navigation Host
    NavHost(
        navController = navController,
        startDestination = "home_screen",
//                modifier = Modifier
//                    .weight(1f)
//                    .fillMaxWidth() // Ensures navigation fills the space
    ) {
        // First Screen: AppScreen
        composable("home_screen") {
            HomeScreen(
                onNavigateToBet = { navController.navigate("bet_screen") }
            )
        }
        // Second Screen: HomeScreen
        composable("bet_screen") {
            BetScreen (
                onNavigateBack = { navController.popBackStack() }
            )
        }
    }
}
