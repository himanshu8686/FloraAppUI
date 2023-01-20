package com.floraappui.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.*
import androidx.compose.runtime.Composable

private val DarkColorPalette = darkColors(
    primary = ColorPrimary, // App Bar background color
    primaryVariant = ColorPrimaryWhite, // Status Bar background color
    secondary = ColorPrimaryWhite, //
    error = Red, // error background
    surface = Ghost_White,
    onPrimary = White,
    onSecondary = White,
    onBackground = Dark_Grey,
    onSurface = Dark_Grey,
    onError = White,
)

private val LightColorPalette = lightColors(
    primary = ColorPrimary, // App Bar background color
    primaryVariant = ColorPrimaryWhite, // Status Bar background color
    secondary = ColorPrimaryWhite, // floating button , check, radio buttons
    error = Red, // error background
    surface = Ghost_White,
    onPrimary = White, // "on" means color on the colored area
    onSecondary = White,
    onBackground = Dark_Grey,
    onSurface = Dark_Grey,
    onError = White,
)

@Composable
fun FloraAppUITheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colors = if (darkTheme) {
        DarkColorPalette
    } else {
        LightColorPalette
    }

    MaterialTheme(
        colors = colors,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}

object AppTheme {
    val colors: Colors
        @Composable
        get() = MaterialTheme.colors

    val typography: Typography
        @Composable
        get() = MaterialTheme.typography

    val shapes: Shapes
        @Composable
        get() = MaterialTheme.shapes
}