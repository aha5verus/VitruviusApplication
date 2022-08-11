package com.example.vitruviusapplication.ui.screens.settings.views


import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.DropdownMenu
import androidx.compose.material.DropdownMenuItem
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.vitruviusapplication.R
import com.example.vitruviusapplication.ui.theme.VitruviusTheme

data class MenuItemModel(
    val title: String,
    val currentIndex: Int = 0,
    val values: List<String>
)

@Composable
fun MenuItem(
    model: MenuItemModel,
    onItemSelected: ((Int) -> Unit)? = null
) {
    val isDropdownOpen = remember { mutableStateOf(false) }
    val currentPosition = remember { mutableStateOf(model.currentIndex) }

    Column {
        Box(
            modifier = Modifier
                .background(VitruviusTheme.colors.secondaryBackground)
                .fillMaxWidth()
        ) {
            Row(
                Modifier
                    .clickable {
                        isDropdownOpen.value = true
                    }
                    .padding(VitruviusTheme.shapes.padding)
                    .background(VitruviusTheme.colors.secondaryBackground),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    modifier = Modifier
                        .weight(1f)
                        .padding(end = VitruviusTheme.shapes.padding),
                    text = model.title,
                    style = VitruviusTheme.typography.body,
                    color = VitruviusTheme.colors.primaryText
                )

                Text(
                    text = model.values[currentPosition.value],
                    style = VitruviusTheme.typography.body,
                    color = VitruviusTheme.colors.secondaryText
                )

                Icon(
                    modifier = Modifier
                        .padding(start = VitruviusTheme.shapes.padding / 4)
                        .size(18.dp)
                        .align(Alignment.CenterVertically),
                    painter = painterResource(id = R.drawable.ic_baseline_arrow_forward_ios_24),
                    contentDescription = "Arrow",
                    tint = VitruviusTheme.colors.secondaryText
                )
            }
        }

        // Dropdown doesn't work
        // https://issuetracker.google.com/u/1/issues/211474319
        DropdownMenu(
            expanded = isDropdownOpen.value,
            onDismissRequest = {
                isDropdownOpen.value = false
            },
            modifier = Modifier
                .background(VitruviusTheme.colors.secondaryBackground)
                .fillMaxWidth()

        ) {
            model.values.forEachIndexed { index, value ->
                DropdownMenuItem(onClick = {
                    currentPosition.value = index
                    isDropdownOpen.value = false
                    onItemSelected?.invoke(index)
                }) {
                    Text(
                        text = value,
                        style = VitruviusTheme.typography.body,
                        color = VitruviusTheme.colors.primaryText
                    )
                }
            }
        }
    }
}