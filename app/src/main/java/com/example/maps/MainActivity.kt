package com.example.maps

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.graphics.BlendMode.Companion.Screen
import com.example.maps.ui.screens.HomeScreen
import com.example.maps.ui.screens.MapCajamarcaScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            var screen by remenber { mutableStateOf(Screen.Home) }

            when (screen) {
                "home" -> HomeScreen(
                    onGoMap = { screen = Screen.Map },
                    onGoLocation = { screen = Screen.Location }
                )
                "map" -> MapCajamarcaScreen()
                "location" -> LocationScreen()
            }
        }
    }
}