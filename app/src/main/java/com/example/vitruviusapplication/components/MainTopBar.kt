package com.example.vitruviusapplication.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.example.vitruviusapplication.ui.theme.VitruviusTheme

@Composable
fun MainTopBar(
    title: String
) {
    TopAppBar(
        title = {
            Box(
                modifier = Modifier.fillMaxWidth(),
                Alignment.Center
            ) {
                Text(
                    text = title
                )
            }
        },
        backgroundColor = VitruviusTheme.colors.primaryBackground,
        contentColor = VitruviusTheme.colors.primaryText,
//        navigationIcon = {
//            IconButton(onClick = {}) {
//                Icon(
//                    imageVector = Icons.Filled.Menu,
//                    contentDescription = "Toggle Drawer"
//                )
//
//            }
//        },
//        actions = {
//            VerticalMenu()
//        },
//        elevation = 0.dp
    )
}
