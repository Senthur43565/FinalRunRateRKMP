package org.example.finalrunrater

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import finalrunrater.composeapp.generated.resources.Res
import finalrunrater.composeapp.generated.resources.compose_multiplatform
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.ui.tooling.preview.Preview

import kotlinx.datetime.*
import org.example.finalrunrater.MAIN.presentation.ui.activities.Screens.BetScreen
import org.example.finalrunrater.MAIN.presentation.ui.activities.Screens.HomeScreen
import org.example.finalrunrater.MAIN.presentation.ui.navigation.RunraterNavHost


@Composable
@Preview
fun App() {
    MaterialTheme {
        var showContent by remember { mutableStateOf(false) }

        val navController: NavHostController = rememberNavController()

        Column(
            Modifier
                .fillMaxSize()
                .padding(16.dp)
        ) {
            RunraterNavHost(navController = navController)
        }
    }
}





