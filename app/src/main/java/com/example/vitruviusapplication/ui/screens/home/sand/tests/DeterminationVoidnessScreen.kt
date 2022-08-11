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
import com.example.vitruviusapplication.components.SuperScriptText
import com.example.vitruviusapplication.components.TestAppBar
import com.example.vitruviusapplication.ui.theme.LARGE_PADDING
import com.example.vitruviusapplication.ui.theme.VitruviusTheme


@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@ExperimentalMaterialApi
@Composable
fun DeterminationVoidnessScreen(
    navController: NavController
) {
    var analyticalSampleMass by remember { mutableStateOf("") }
    var residueSampleMass by remember { mutableStateOf("") }
    var waterVolume by remember { mutableStateOf("")}
    val maxChar = 15
    val focusManager = LocalFocusManager.current

    Scaffold(
        backgroundColor = VitruviusTheme.colors.secondaryBackground,
        topBar = {
            TestAppBar(
                title = "Пустотность материала",
                navController = navController
            )
        },
        content = {
            Column(
                modifier = Modifier
                    .verticalScroll(rememberScrollState())
            ) {
                ExpandableCard(
                    title = "Проведение испытания",
                    description = "1. Лаборант готовит аналитическую пробу массой, регламентирующийся в нормативной документации на методы испытания материала.\n" +
                            "2. Лаборант заполняет колбу Ле-Шателье водой до отметки «0».\n" +
                            "3. Лаборант засыпает некоторую часть от подготовленной аналитической пробы в колбу Ле-Шателье до (не менее) отметки «20».\n" +
                            "4. Лаборант производит взвешивание остатка аналитической пробы и производит расчет по формуле.\n" +
                            "5. Испытание проводится повторно.\n" +
                            "6. Результатом испытания считается среднее арифметическое проведенных испытаний."
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
                            text = "Истинная плотность",
                            fontSize = VitruviusTheme.typography.heading.fontSize,
                            fontWeight = FontWeight.SemiBold,
                            color = VitruviusTheme.colors.primaryText
                        )
                        Box(
                            modifier = Modifier.fillMaxWidth(),
                            contentAlignment = Alignment.Center
                        ) {
                            Image(
                                modifier = Modifier.size(160.dp),
                                painter = painterResource(id = R.drawable.true_density),
                                contentDescription = ""
                            )
                        }
                        SubScriptText(
                            normalText = "m",
                            subText = "",
                            description = " – масса аналитической пробы материала"
                        )
                        SubScriptText(
                            normalText = "m",
                            subText = "1",
                            description = " – масса остатка материала от пробы после испытания"
                        )
                        SubScriptText(
                            normalText = "V",
                            subText = "",
                            description = " – объем воды, вытесненной материалом"
                        )
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
                                value = analyticalSampleMass,
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
                                        analyticalSampleMass = it
                                    }
                                },
                                keyboardOptions = KeyboardOptions(
                                    keyboardType = KeyboardType.Number,
                                    imeAction = ImeAction.Next,
                                ),
                                singleLine = true,
                                leadingIcon = {},
                                trailingIcon = {
                                    if (analyticalSampleMass.isNotEmpty()) {
                                        IconButton(onClick = { analyticalSampleMass = "" }) {
                                            Icon(
                                                imageVector = Icons.Outlined.Close,
                                                contentDescription = ""
                                            )
                                        }
                                    }
                                }
                            )
                            SubScriptText(
                                normalText = "г",
                                subText = "",
                                description = ""
                            )
                        }
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.Center,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            SubScriptText(
                                normalText = "m",
                                subText = "1",
                                description = ""
                            )
                            TextField(
                                modifier = Modifier
                                    .padding(LARGE_PADDING)
                                    .width(180.dp),
                                value = residueSampleMass,
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
                                        residueSampleMass = it
                                    }
                                },
                                keyboardOptions = KeyboardOptions(
                                    keyboardType = KeyboardType.Number,
                                    imeAction = ImeAction.Next,
                                ),
                                singleLine = true,
                                leadingIcon = {},
                                trailingIcon = {
                                    if (residueSampleMass.isNotEmpty()) {
                                        IconButton(onClick = { residueSampleMass = "" }) {
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
                                fontSize = VitruviusTheme.typography.body.fontSize,
                                color = VitruviusTheme.colors.primaryText
                            )
                        }
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.Center,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Spacer(modifier = Modifier.width(18.dp))
                            SubScriptText(
                                normalText = "V",
                                subText = "",
                                description = ""
                            )
                            TextField(
                                modifier = Modifier
                                    .padding(LARGE_PADDING)
                                    .width(180.dp),
                                value = waterVolume,
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
                                        waterVolume = it
                                    }
                                },
                                keyboardOptions = KeyboardOptions(
                                    keyboardType = KeyboardType.Number,
                                    imeAction = ImeAction.Done,
                                ),
                                keyboardActions = KeyboardActions(
                                    onDone = {
                                        focusManager.clearFocus()
                                    }
                                ),
                                singleLine = true,
                                leadingIcon = {},
                                trailingIcon = {
                                    if (waterVolume.isNotEmpty()) {
                                        IconButton(onClick = { waterVolume = "" }) {
                                            Icon(
                                                imageVector = Icons.Outlined.Close,
                                                contentDescription = ""
                                            )
                                        }
                                    }
                                }
                            )
                            SuperScriptText(
                                normalText = "см",
                                superText = "3"
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
                        fontSize = VitruviusTheme.typography.caption.fontSize,
                        color = VitruviusTheme.colors.primaryText
                    )
                }
            }
        }
    )
}

//@Composable
//fun BottomTestBar() {
//    BottomAppBar {
//        Spacer(Modifier.weight(1f, true))
//        IconButton(onClick = { /* doSomething() */ }) {
//            Icon(
//                painterResource(id = R.drawable.ic_copy),
//                contentDescription = "Copy Icon"
//            )
//        }
//        IconButton(onClick = { /* doSomething() */ }) {
//            Icon(
//                painterResource(id = R.drawable.ic_send),
//                contentDescription = "Send Icon"
//            )
//        }
//        IconButton(onClick = { /* doSomething() */ }) {
//            Icon(
//                painterResource(id = R.drawable.ic_save),
//                contentDescription = "Save Icon"
//            )
//        }
//        IconButton(onClick = { /* doSomething() */ }) {
//            Icon(
//                painterResource(id = R.drawable.ic_delete),
//                contentDescription = "Delete Icon"
//            )
//        }
//    }
//}

