package com.protonmailis16.asgharscanner.theme

import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext

private val DarkColorScheme = darkColorScheme(
    primary = asgharOrange,
    secondary = asgharOrange,
    tertiary = asgharOrange,
    background = asgharDarkBackground,
    surface = asgharDarkSurface,
    onPrimary = asgharDarkBackground,
    onSecondary = asgharDarkBackground,
    onTertiary = asgharDarkBackground,
    onBackground = asgharTextPrimary,
    onSurface = asgharTextPrimary,
    error = asgharError,
    onError = asgharDarkBackground
)

@Composable
fun asgharscannerTheme(
  // We force dark theme for asgharscanner aesthetic
  darkTheme: Boolean = true,
  dynamicColor: Boolean = false,
  content: @Composable () -> Unit,
) {
  MaterialTheme(colorScheme = DarkColorScheme, typography = Typography, content = content)
}
