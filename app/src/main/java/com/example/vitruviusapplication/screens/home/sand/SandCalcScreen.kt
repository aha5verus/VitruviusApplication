package com.example.vitruviusapplication.screens.home.sand

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.vitruviusapplication.ui.theme.LARGE_PADDING

@ExperimentalMaterialApi
@ExperimentalFoundationApi
@Composable
fun SandCalcScreen(name: String, onClick: () -> Unit) {
    Scaffold(
        topBar = {
            CalcAppBar()
        },
        content = {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .background(MaterialTheme.colors.background)
                    .padding(LARGE_PADDING)
            ) {
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(bottom = 12.dp)
                        .height(64.dp),
                    onClick = { onClick() },
                    elevation = 10.dp,
                    backgroundColor = MaterialTheme.colors.primary
                ) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.Center
                    ) {
                        Text(
                            text = "Определение пустотности материала",
                            fontWeight = FontWeight.Bold,
                            style = MaterialTheme.typography.subtitle2
                        )
                    }
                }
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(bottom = 12.dp)
                        .height(64.dp),
                    onClick = { onClick() },
                    elevation = 10.dp,
                    backgroundColor = MaterialTheme.colors.primary
                ) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.Center
                    ) {
                        Text(
                            text = "Определения гранулометрического состава материала",
                            fontWeight = FontWeight.Bold,
                            style = MaterialTheme.typography.subtitle2
                        )
                    }
                }
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(bottom = 12.dp)
                        .height(64.dp),
                    onClick = { onClick() },
                    elevation = 10.dp,
                    backgroundColor = MaterialTheme.colors.primary
                ) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.Center
                    ) {
                        Text(
                            text = "Определение насыпной плотности материала",
                            fontWeight = FontWeight.Bold,
                            style = MaterialTheme.typography.subtitle2
                        )
                    }
                }
            }
        }
    )
}

