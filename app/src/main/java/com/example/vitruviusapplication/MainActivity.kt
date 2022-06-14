package com.example.vitruviusapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.rememberNavController
import com.example.vitruviusapplication.graphs.RootNavigationGraph
import com.example.vitruviusapplication.ui.theme.VitruviusApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            VitruviusApplicationTheme {
                RootNavigationGraph(navController = rememberNavController())
            }
        }
    }
}
