package com.example.vitruviusapplication.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavController
import com.example.vitruviusapplication.R
import com.example.vitruviusapplication.ui.theme.VitruviusTheme

@Composable
fun TestAppBar(
    title: String,
    navController: NavController
) {
    TopAppBar(
        navigationIcon = {
            IconButton(onClick = { navController.popBackStack()}) {
                Icon(
                    painter = painterResource(id = R.drawable.ic_arrow_back),
                    contentDescription = "Arrow Back"
                )

            }
        },
        title = {
            Text(
                modifier = Modifier.fillMaxWidth(),
                text = title
            )
        },
        backgroundColor = VitruviusTheme.colors.primaryBackground,
        contentColor = VitruviusTheme.colors.primaryText,
        actions = {}
    )
}
//
//@Composable
//fun VerticalMenu() {
//    IconButton(onClick = { }) {
//        Icon(
//            painter = painterResource(id = R.drawable.ic_vertical_menu),
//            contentDescription = "Vertical Menu Icon",
//            tint = Color.White
//        )
//    }
//}