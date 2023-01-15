package com.floraappui.presentation.home

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController

@Composable
fun HomeScreen(navController: NavController) {
    Text(text = "HomeScreen")
}

@Preview(showBackground = true)
@Composable
fun HomeScreenPreview() {
    Text(text = "HomeScreen")
}