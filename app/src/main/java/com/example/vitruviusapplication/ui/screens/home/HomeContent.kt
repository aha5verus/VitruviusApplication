package com.example.vitruviusapplication.ui.screens.home

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.FloatingActionButton
import androidx.compose.material.FloatingActionButtonDefaults
import androidx.compose.material.Icon
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.vitruviusapplication.R
import com.example.vitruviusapplication.components.MainTopBar
import com.example.vitruviusapplication.components.MaterialCard
import com.example.vitruviusapplication.ui.theme.VitruviusTheme


@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun HomeContent(
    onSandClick: () -> Unit,
    onConcreteClick: () -> Unit,
    onSettingsClick: () -> Unit
) {
    Scaffold(
        topBar = {
            MainTopBar(title = "Vitruvius")
        },
        backgroundColor = VitruviusTheme.colors.secondaryBackground,
        content = {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = VitruviusTheme.shapes.padding)
                    .verticalScroll(rememberScrollState()),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,

            ) {
                Row {
                    MaterialCard(onClick = { /*TODO*/ }, title = "Асфальт")
                    MaterialCard(onClick = { /*TODO*/ }, title = "Асф.бетон")
                }
                Row {
                    MaterialCard(onClick = { onConcreteClick() }, title = "Бетон")
                    MaterialCard(onClick = { /*TODO*/ }, title = "Грунт")

                }
                Row {
                    MaterialCard(onClick = { onSandClick() }, title = "Песок")
                    MaterialCard(onClick = { /*TODO*/ }, title = "...")
                }
            }
        },
        floatingActionButton = {
            FloatingActionButton(
                modifier = Modifier
                    .padding(bottom = 56.dp),
                onClick = { onSettingsClick() },
                backgroundColor = VitruviusTheme.colors.tintColor,
                contentColor = VitruviusTheme.colors.secondaryText,
                shape = RoundedCornerShape(12.dp),
                elevation = FloatingActionButtonDefaults.elevation(6.dp)

            ) {
                Icon(
                    painter = painterResource(id = R.drawable.ic_settings),
                    contentDescription = ""
                )
            }
        }
    )
}
//
//@Composable
//fun SettingsFAB(
//    onSettingsClick: () -> Unit
//    ) {
//    FloatingActionButton(
//        modifier = Modifier
//            .padding(bottom = 56.dp),
//        onClick = { onSettingsClick() },
//        backgroundColor = VitruviusTheme.colors.tintColor,
//        contentColor = VitruviusTheme.colors.secondaryText,
//        shape = RoundedCornerShape(12.dp),
//        elevation = FloatingActionButtonDefaults.elevation(6.dp)
//
//    ) {
//        Icon(
//            painter = painterResource(id = R.drawable.ic_settings),
//            contentDescription = ""
//        )
//    }
//}
//
//@Composable
//@Preview
//fun HomeContentPreview() {
//    HomeContent(
//        onSandClick = {},
//        onConcreteClick = {}
//    )
//}
