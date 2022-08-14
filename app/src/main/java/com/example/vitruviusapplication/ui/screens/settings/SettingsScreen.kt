package com.example.vitruviusapplication.ui.screens.settings

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Checkbox
import androidx.compose.material.CheckboxDefaults
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.vitruviusapplication.R
import com.example.vitruviusapplication.components.TestAppBar
import com.example.vitruviusapplication.domain.SettingsBundle
import com.example.vitruviusapplication.ui.screens.settings.views.MenuItem
import com.example.vitruviusapplication.ui.screens.settings.views.MenuItemModel
import com.example.vitruviusapplication.ui.theme.VitruviusCorners
import com.example.vitruviusapplication.ui.theme.VitruviusSize
import com.example.vitruviusapplication.ui.theme.VitruviusTheme

@Composable
fun SettingsScreen(
    navController: NavController,
    modifier: Modifier = Modifier,
    settings: SettingsBundle,
    onSettingsChanged: (SettingsBundle) -> Unit
) {
    Surface(
        modifier = modifier,
        color = VitruviusTheme.colors.secondaryBackground,
    ) {
        Column(
            modifier = Modifier.fillMaxSize()
        ) {
            TestAppBar(
                title = "Настройки",
                navController = navController
            )

            Row(
                modifier = Modifier.padding(VitruviusTheme.shapes.padding)
            ) {
                Text(
                    modifier = Modifier
                        .weight(1f)
                        .padding(top = 10.dp),
                    text = stringResource(id = R.string.action_dark_theme_enable),
                    color = VitruviusTheme.colors.primaryText,
                    style = VitruviusTheme.typography.body
                )
                Checkbox(
                    checked = settings.isDarkMode, onCheckedChange = {
                        onSettingsChanged.invoke(settings.copy(isDarkMode = !settings.isDarkMode))
                    },
                    colors = CheckboxDefaults.colors(
                        checkedColor = VitruviusTheme.colors.checkedColor,
                        uncheckedColor = VitruviusTheme.colors.secondaryText
                    )
                )
            }

            MenuItem(
                model = MenuItemModel(
                    title = stringResource(id = R.string.title_font_size),
                    currentIndex = when (settings.textSize) {
                        VitruviusSize.Small -> 0
                        VitruviusSize.Medium -> 1
                        VitruviusSize.Big -> 2
                    },
                    values = listOf(
                        stringResource(id = R.string.title_font_size_small),
                        stringResource(id = R.string.title_font_size_medium),
                        stringResource(id = R.string.title_font_size_big)
                    )
                ),
                onItemSelected = {
                    val settingsApp = settings.copy(
                        textSize = when (it) {
                            0 -> VitruviusSize.Small
                            1 -> VitruviusSize.Medium
                            2 -> VitruviusSize.Big
                            else -> throw NotImplementedError("No valid value for this $it")
                        }
                    )

                    onSettingsChanged.invoke(settingsApp)
                }
            )

            MenuItem(
                model = MenuItemModel(
                    title = stringResource(id = R.string.title_padding_size),
                    currentIndex = when (settings.paddingSize) {
                        VitruviusSize.Small -> 0
                        VitruviusSize.Medium -> 1
                        VitruviusSize.Big -> 2
                    },
                    values = listOf(
                        stringResource(id = R.string.title_padding_small),
                        stringResource(id = R.string.title_padding_medium),
                        stringResource(id = R.string.title_padding_big)
                    ),
                ),
                onItemSelected = {
                    val settingsApp = settings.copy(
                        paddingSize = when (it) {
                            0 -> VitruviusSize.Small
                            1 -> VitruviusSize.Medium
                            2 -> VitruviusSize.Big
                            else -> throw NotImplementedError("No valid value for this $it")
                        }
                    )

                    onSettingsChanged.invoke(settingsApp)
                }
            )

            MenuItem(
                model = MenuItemModel(
                    title = stringResource(id = R.string.title_corners_style),
                    currentIndex = when (settings.cornerStyle) {
                        VitruviusCorners.Rounded -> 0
                        VitruviusCorners.Flat -> 1
                    },
                    values = listOf(
                        stringResource(id = R.string.title_corners_style_rounded),
                        stringResource(id = R.string.title_corners_style_flat)
                    ),
                ),
                onItemSelected = {
                    val settingsApp = settings.copy(
                        cornerStyle = when (it) {
                            0 -> VitruviusCorners.Rounded
                            1 -> VitruviusCorners.Flat
                            else -> throw NotImplementedError("No valid value for this $it")
                        }
                    )

                    onSettingsChanged.invoke(settingsApp)
                }
            )
        }
    }
}
