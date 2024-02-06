package com.example.visacarduicompose

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.visacarduicompose.component.ColumnItem
import com.example.visacarduicompose.component.RowItem

@Composable
fun LazyColumnRowScreen() {

    val language = listOf(
        "java",
        "kotlin",
        "c plus plus",
        "python",
        "c sharp",
        "java script",
        "php"
    )

    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        LazyRow{
            items(language){item ->
                RowItem(item)
            }
        }

        LazyColumn{
            items(language){item ->
                ColumnItem(item)
            }
        }
    }
}

@Preview
@Composable
fun LazyColumnRowScreenPreview() {
    LazyColumnRowScreen()
}