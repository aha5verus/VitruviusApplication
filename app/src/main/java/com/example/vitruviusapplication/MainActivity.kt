package com.example.vitruviusapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.material.ExperimentalMaterialApi
import androidx.navigation.compose.rememberNavController
import com.example.vitruviusapplication.graphs.RootNavigationGraph
import com.example.vitruviusapplication.ui.theme.VitruviusApplicationTheme

@ExperimentalMaterialApi
@ExperimentalFoundationApi
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
