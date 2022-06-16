package com.example.vitruviusapplication.screens.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.vitruviusapplication.R
import com.example.vitruviusapplication.ui.theme.LARGE_PADDING

@ExperimentalMaterialApi
@Composable
fun HomeContent(onClick: () -> Unit) {
    Scaffold(
        topBar = { MainAppBar {

        }},
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
                        .padding(bottom = 12.dp),
                    onClick = { onClick() },
                    elevation = 10.dp,
                    backgroundColor = MaterialTheme.colors.primary
                ) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.Center
                    ) {
                        Icon(
                            modifier = Modifier.size(64.dp),
                            painter = painterResource(id = R.drawable.ic_sand),
                            contentDescription = "Card Icon",
                            tint = Color.LightGray
                        )
                        Text(
                            modifier = Modifier
                                .weight(8f),
                            text = "Песок",
                            fontWeight = FontWeight.Bold,
                            style = MaterialTheme.typography.h5
                        )
                        Icon(
                            imageVector = Icons.Filled.KeyboardArrowRight,
                            contentDescription = "Arrow Right"
                        )
                    }
                }
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(bottom = 12.dp),
                    onClick = { onClick() },
                    elevation = 10.dp,
                    backgroundColor = MaterialTheme.colors.primary
                ) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.Center
                    ) {
                        Icon(
                            modifier = Modifier.size(64.dp),
                            painter = painterResource(id = R.drawable.ic_sand),
                            contentDescription = "Card Icon",
                            tint = Color.LightGray
                        )
                        Text(
                            modifier = Modifier
                                .weight(8f),
                            text = "Бетон",
                            fontWeight = FontWeight.Bold,
                            style = MaterialTheme.typography.h5
                        )
                        Icon(
                            imageVector = Icons.Filled.KeyboardArrowRight,
                            contentDescription = "Arrow Right"
                        )
                    }
                }
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(bottom = 12.dp),
                    onClick = { onClick() },
                    elevation = 10.dp,
                    backgroundColor = MaterialTheme.colors.primary
                ) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.Center
                    ) {
                        Icon(
                            modifier = Modifier.size(64.dp),
                            painter = painterResource(id = R.drawable.ic_sand),
                            contentDescription = "Card Icon",
                            tint = Color.LightGray
                        )
                        Text(
                            modifier = Modifier
                                .weight(8f),
                            text = "Асфальт",
                            fontWeight = FontWeight.Bold,
                            style = MaterialTheme.typography.h5
                        )
                        Icon(
                            imageVector = Icons.Filled.KeyboardArrowRight,
                            contentDescription = "Arrow Right"
                        )
                    }
                }
//                Button(
//                    modifier = Modifier.fillMaxWidth(),
//                    onClick = { onClick() },
//                    border = BorderStroke(1.dp, Color.DarkGray),
//                ) {
//                    Text(
//                        text = "Песок",
//                        fontSize = 25.sp
//                    )
//                }
//                Divider(
//                    modifier = Modifier.height(MEDIUM_PADDING),
//                    color = MaterialTheme.colors.background
//                )
//                OutlinedButton(
//                    modifier = Modifier.fillMaxWidth(),
//                    onClick = { /*TODO*/ },
//                    border = BorderStroke(1.dp, Color.DarkGray),
//                ) {
//                    Text(
//                        text = "Бетон",
//                        fontSize = 25.sp
//                    )
//                }
            }
        },

    )
}

@ExperimentalMaterialApi
@Composable
@Preview
fun HomeContentPreview() {
    HomeContent(onClick = {})
}
