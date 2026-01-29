package com.example.consola.ui.theme

import android.app.Activity
import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext

private val DarkColorScheme = darkColorScheme(
    primary = Color(0xFF7E57C2),
    secondary = PurpleGrey80,
    tertiary = Pink80,
    onBackground = Color(0xFF2D2E35),
    background = Color(0xFF222329),
    surface = Color(0xFF222329),
    onSurface = Color(0xFF1C1B1F),
    inverseSurface = Color.White,
    onPrimary = Color.White

)

private val LightColorScheme = lightColorScheme(
    primary= Color(0xFF26A69A),
    secondary = PurpleGrey40,
    tertiary = Pink40,
    background = Color(0xFFeeedf6),
    surface = Color(0xFFeeedf6),
    onBackground = Color(0xFFfaf8fe),
    onSurface = Color(0xFFfaf8fe),
    inverseSurface = Color.Black,
    onPrimary = Color.White,


)

@Composable
fun ConsolaTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    // Dynamic color is available on Android 12+
    dynamicColor: Boolean = false, colorDeAcento : Color,
    content: @Composable () -> Unit
) {
    val baseScheme = if (darkTheme) DarkColorScheme else LightColorScheme
    val colorScheme = baseScheme.copy(
        primary = colorDeAcento,
    )

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}