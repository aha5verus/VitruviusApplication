package com.example.vitruviusapplication.ui.screens.home.sand.tests

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Close
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.vitruviusapplication.R
import com.example.vitruviusapplication.components.ExpandableCard
import com.example.vitruviusapplication.components.SubScriptText
import com.example.vitruviusapplication.components.TestAppBar
import com.example.vitruviusapplication.ui.theme.LARGE_PADDING
import com.example.vitruviusapplication.ui.theme.VitruviusTheme


@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@ExperimentalMaterialApi
@Composable
fun GranulometricCompositionScreen(navController: NavController) {
    var numberSieve by remember { mutableStateOf("") }
    var sampleMass by remember { mutableStateOf("") }
    var privateResidue by remember { mutableStateOf("") }
    val maxChar = 15
    val focusManager = LocalFocusManager.current

    Scaffold(
        backgroundColor = VitruviusTheme.colors.secondaryBackground,
        topBar = {
            TestAppBar(
                title = "Зерновой состав",
                navController = navController
            )
        },
        content = {
            Column(
                modifier = Modifier.verticalScroll(rememberScrollState())

            ) {
                ExpandableCard(
                    title = "Проведение испытания",
                    description = "1. Гранулометрический состав - относительное содержание в почве, горной породе или искусственной смеси частиц различных размеров (независимо от их химического или минералогического состава).\n" +
                            "2. Зерновой состав материала определяется при помощи сит с ячейками различного диаметра.\n" +
                            "3. Результатом испытания является масса фракции материала, оставшаяся на каждом сите."
                )
                Card(
                    modifier = Modifier
                        .padding(VitruviusTheme.shapes.padding)
                        .wrapContentHeight(),
                    elevation = 5.dp,
                    shape = VitruviusTheme.shapes.cornersStyle,
                    backgroundColor = VitruviusTheme.colors.primaryBackground
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(LARGE_PADDING),
                        horizontalAlignment = Alignment.Start,
                        verticalArrangement = Arrangement.Top
                    ) {
                        Text(
                            text = "Частный остаток",
                            fontSize = MaterialTheme.typography.h5.fontSize,
                            fontWeight = FontWeight.SemiBold,
                            color = VitruviusTheme.colors.primaryText
                        )
                        Box(
                            modifier = Modifier.fillMaxWidth(),
                            contentAlignment = Alignment.Center
                        ) {
                            Image(
                                modifier = Modifier.size(160.dp),
                                painter = painterResource(id = R.drawable.private_balance),
                                contentDescription = ""
                            )
                        }
                        SubScriptText(
                            normalText = "α",
                            subText = "i",
                            description = " – частный остаток на сите"
                        )
                        SubScriptText(
                            normalText = "m",
                            subText = "",
                            description = " – масса навески до испытания"
                        )
                        SubScriptText(
                            normalText = "m",
                            subText = "i",
                            description = " – масса остатка на данном сите"
                        )
                        SubScriptText(
                            normalText = "№",
                            subText = "",
                            description = " – номер сита"
                        )
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.Center,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            SubScriptText(
                                normalText = "№",
                                subText = "",
                                description = ""
                            )
                            TextField(
                                modifier = Modifier
                                    .padding(LARGE_PADDING)
                                    .width(180.dp),
                                value = numberSieve,
                                textStyle = LocalTextStyle.current.copy(
                                    textAlign = TextAlign.Center,
                                    fontSize = VitruviusTheme.typography.body.fontSize
                                ),
                                colors = TextFieldDefaults.textFieldColors(
                                    backgroundColor = VitruviusTheme.colors.primaryBackground,
                                    textColor = VitruviusTheme.colors.primaryText,
                                    cursorColor = VitruviusTheme.colors.activeColor,
                                    focusedIndicatorColor = VitruviusTheme.colors.activeColor,
                                    unfocusedIndicatorColor = VitruviusTheme.colors.disabledColor,
                                    trailingIconColor = VitruviusTheme.colors.tintColor
                                ),
                                onValueChange = {
                                    if (it.length <= maxChar) {
                                        numberSieve = it
                                    }
                                },
                                keyboardOptions = KeyboardOptions(
                                    keyboardType = KeyboardType.Number,
                                    imeAction = ImeAction.Next,
                                ),
                                singleLine = true,
                                leadingIcon = {},
                                trailingIcon = {
                                    if (numberSieve.isNotEmpty()) {
                                        IconButton(onClick = { numberSieve = "" }) {
                                            Icon(
                                                imageVector = Icons.Outlined.Close,
                                                contentDescription = ""
                                            )
                                        }
                                    }
                                }
                            )
                        }
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.Center,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            SubScriptText(
                                normalText = "m",
                                subText = "",
                                description = ""
                            )
                            TextField(
                                modifier = Modifier
                                    .padding(LARGE_PADDING)
                                    .width(180.dp),
                                value = sampleMass,
                                textStyle = LocalTextStyle.current.copy(
                                    textAlign = TextAlign.Center,
                                    fontSize = VitruviusTheme.typography.body.fontSize
                                ),
                                colors = TextFieldDefaults.textFieldColors(
                                    backgroundColor = VitruviusTheme.colors.primaryBackground,
                                    textColor = VitruviusTheme.colors.primaryText,
                                    cursorColor = VitruviusTheme.colors.activeColor,
                                    focusedIndicatorColor = VitruviusTheme.colors.activeColor,
                                    unfocusedIndicatorColor = VitruviusTheme.colors.disabledColor,
                                    trailingIconColor = VitruviusTheme.colors.tintColor
                                ),
                                onValueChange = {
                                    if (it.length <= maxChar) {
                                        sampleMass = it
                                    }
                                },
                                keyboardOptions = KeyboardOptions(
                                    keyboardType = KeyboardType.Number,
                                    imeAction = ImeAction.Next
                                ),
                                singleLine = true,
                                leadingIcon = {},
                                trailingIcon = {
                                    if (sampleMass.isNotEmpty()) {
                                        IconButton(onClick = {
                                            sampleMass = ""
                                        }) {
                                            Icon(
                                                imageVector = Icons.Outlined.Close,
                                                contentDescription = ""
                                            )
                                        }
                                    }
                                }
                            )
                            Text(
                                text = "г",
                                fontSize = MaterialTheme.typography.h6.fontSize,
                                color = VitruviusTheme.colors.primaryText
                            )
                        }
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.Center,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            SubScriptText(
                                normalText = "m",
                                subText = "i",
                                description = ""
                            )
                            TextField(
                                modifier = Modifier
                                    .padding(LARGE_PADDING)
                                    .width(180.dp),
                                value = privateResidue,
                                textStyle = LocalTextStyle.current.copy(
                                    textAlign = TextAlign.Center,
                                    fontSize = VitruviusTheme.typography.body.fontSize
                                ),
                                colors = TextFieldDefaults.textFieldColors(
                                    backgroundColor = VitruviusTheme.colors.primaryBackground,
                                    textColor = VitruviusTheme.colors.primaryText,
                                    cursorColor = VitruviusTheme.colors.activeColor,
                                    focusedIndicatorColor = VitruviusTheme.colors.activeColor,
                                    unfocusedIndicatorColor = VitruviusTheme.colors.disabledColor,
                                    trailingIconColor = VitruviusTheme.colors.tintColor
                                ),
                                onValueChange = {
                                    if (it.length <= maxChar) {
                                        privateResidue = it
                                    }
                                },
                                keyboardOptions = KeyboardOptions(
                                    keyboardType = KeyboardType.Number,
                                    imeAction = ImeAction.Done
                                ),
                                keyboardActions = KeyboardActions(
                                    onDone = {
                                        focusManager.clearFocus()
                                    }
                                ),
                                singleLine = true,
                                leadingIcon = {},
                                trailingIcon = {
                                    if (privateResidue.isNotEmpty()) {
                                        IconButton(onClick = { privateResidue = "" }) {
                                            Icon(
                                                imageVector = Icons.Outlined.Close,
                                                contentDescription = ""
                                            )
                                        }
                                    }
                                }
                            )
                            Text(
                                text = "г",
                                fontSize = MaterialTheme.typography.h6.fontSize,
                                color = VitruviusTheme.colors.primaryText
                            )
                        }
                    }
                }
                Card(
                    modifier = Modifier
                        .padding(VitruviusTheme.shapes.padding)
                        .fillMaxWidth()
                        .wrapContentHeight(),
                    elevation = 5.dp,
                    shape = VitruviusTheme.shapes.cornersStyle,
                    backgroundColor = VitruviusTheme.colors.primaryBackground
                ) {
                    Text(
                        modifier = Modifier.padding(16.dp),
                        text = "Результаты",
                        fontSize = MaterialTheme.typography.subtitle1.fontSize,
                        color = VitruviusTheme.colors.primaryText
                    )
                }
                Card(
                    modifier = Modifier
                        .padding(VitruviusTheme.shapes.padding)
                        .wrapContentHeight(),
                    elevation = 5.dp,
                    shape = VitruviusTheme.shapes.cornersStyle,
                    backgroundColor = VitruviusTheme.colors.primaryBackground
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(LARGE_PADDING),
                        horizontalAlignment = Alignment.Start,
                        verticalArrangement = Arrangement.Top
                    ) {
                        Text(
                            text = "Полный остаток",
                            fontSize = MaterialTheme.typography.h5.fontSize,
                            fontWeight = FontWeight.SemiBold,
                            color = VitruviusTheme.colors.primaryText
                        )
                        Box(
                            modifier = Modifier.fillMaxWidth(),
                            contentAlignment = Alignment.Center
                        ) {
                            Image(
                                modifier = Modifier.size(260.dp),
                                painter = painterResource(id = R.drawable.total_residue),
                                contentDescription = ""
                            )
                        }
                        SubScriptText(
                            normalText = "A",
                            subText = "i",
                            description = " - сумма частных остатков на предыдущих ситах (полный остаток)"
                        )
                        SubScriptText(
                            normalText = "α",
                            subText = "i+n, i+1, i",
                            description = " - частные остатки на соответствующих ситах"
                        )
                    }
                }
                Card(
                    modifier = Modifier
                        .padding(VitruviusTheme.shapes.padding)
                        .fillMaxWidth()
                        .wrapContentHeight(),
                    elevation = 5.dp,
                    shape = VitruviusTheme.shapes.cornersStyle,
                    backgroundColor = VitruviusTheme.colors.primaryBackground
                ) {
                    Text(
                        modifier = Modifier.padding(16.dp),
                        text = "Результаты",
                        fontSize = MaterialTheme.typography.subtitle1.fontSize,
                        color = VitruviusTheme.colors.primaryText
                    )
                }
            }
        }
    )
}