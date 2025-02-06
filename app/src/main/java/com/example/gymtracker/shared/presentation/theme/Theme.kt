package com.example.compose
import android.app.Activity
import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.Typography
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.platform.LocalContext
import com.example.gymtracker.shared.presentation.theme.Typography
import com.example.gymtracker.shared.presentation.theme.backgroundDark
import com.example.gymtracker.shared.presentation.theme.backgroundDarkHighContrast
import com.example.gymtracker.shared.presentation.theme.backgroundDarkMediumContrast
import com.example.gymtracker.shared.presentation.theme.backgroundLight
import com.example.gymtracker.shared.presentation.theme.backgroundLightHighContrast
import com.example.gymtracker.shared.presentation.theme.backgroundLightMediumContrast
import com.example.gymtracker.shared.presentation.theme.errorContainerDark
import com.example.gymtracker.shared.presentation.theme.errorContainerDarkHighContrast
import com.example.gymtracker.shared.presentation.theme.errorContainerDarkMediumContrast
import com.example.gymtracker.shared.presentation.theme.errorContainerLight
import com.example.gymtracker.shared.presentation.theme.errorContainerLightHighContrast
import com.example.gymtracker.shared.presentation.theme.errorContainerLightMediumContrast
import com.example.gymtracker.shared.presentation.theme.errorDark
import com.example.gymtracker.shared.presentation.theme.errorDarkHighContrast
import com.example.gymtracker.shared.presentation.theme.errorDarkMediumContrast
import com.example.gymtracker.shared.presentation.theme.errorLight
import com.example.gymtracker.shared.presentation.theme.errorLightHighContrast
import com.example.gymtracker.shared.presentation.theme.errorLightMediumContrast
import com.example.gymtracker.shared.presentation.theme.inverseOnSurfaceDark
import com.example.gymtracker.shared.presentation.theme.inverseOnSurfaceDarkHighContrast
import com.example.gymtracker.shared.presentation.theme.inverseOnSurfaceDarkMediumContrast
import com.example.gymtracker.shared.presentation.theme.inverseOnSurfaceLight
import com.example.gymtracker.shared.presentation.theme.inverseOnSurfaceLightHighContrast
import com.example.gymtracker.shared.presentation.theme.inverseOnSurfaceLightMediumContrast
import com.example.gymtracker.shared.presentation.theme.inversePrimaryDark
import com.example.gymtracker.shared.presentation.theme.inversePrimaryDarkHighContrast
import com.example.gymtracker.shared.presentation.theme.inversePrimaryDarkMediumContrast
import com.example.gymtracker.shared.presentation.theme.inversePrimaryLight
import com.example.gymtracker.shared.presentation.theme.inversePrimaryLightHighContrast
import com.example.gymtracker.shared.presentation.theme.inversePrimaryLightMediumContrast
import com.example.gymtracker.shared.presentation.theme.inverseSurfaceDark
import com.example.gymtracker.shared.presentation.theme.inverseSurfaceDarkHighContrast
import com.example.gymtracker.shared.presentation.theme.inverseSurfaceDarkMediumContrast
import com.example.gymtracker.shared.presentation.theme.inverseSurfaceLight
import com.example.gymtracker.shared.presentation.theme.inverseSurfaceLightHighContrast
import com.example.gymtracker.shared.presentation.theme.inverseSurfaceLightMediumContrast
import com.example.gymtracker.shared.presentation.theme.onBackgroundDark
import com.example.gymtracker.shared.presentation.theme.onBackgroundDarkHighContrast
import com.example.gymtracker.shared.presentation.theme.onBackgroundDarkMediumContrast
import com.example.gymtracker.shared.presentation.theme.onBackgroundLight
import com.example.gymtracker.shared.presentation.theme.onBackgroundLightHighContrast
import com.example.gymtracker.shared.presentation.theme.onBackgroundLightMediumContrast
import com.example.gymtracker.shared.presentation.theme.onErrorContainerDark
import com.example.gymtracker.shared.presentation.theme.onErrorContainerDarkHighContrast
import com.example.gymtracker.shared.presentation.theme.onErrorContainerDarkMediumContrast
import com.example.gymtracker.shared.presentation.theme.onErrorContainerLight
import com.example.gymtracker.shared.presentation.theme.onErrorContainerLightHighContrast
import com.example.gymtracker.shared.presentation.theme.onErrorContainerLightMediumContrast
import com.example.gymtracker.shared.presentation.theme.onErrorDark
import com.example.gymtracker.shared.presentation.theme.onErrorDarkHighContrast
import com.example.gymtracker.shared.presentation.theme.onErrorDarkMediumContrast
import com.example.gymtracker.shared.presentation.theme.onErrorLight
import com.example.gymtracker.shared.presentation.theme.onErrorLightHighContrast
import com.example.gymtracker.shared.presentation.theme.onErrorLightMediumContrast
import com.example.gymtracker.shared.presentation.theme.onPrimaryContainerDark
import com.example.gymtracker.shared.presentation.theme.onPrimaryContainerDarkHighContrast
import com.example.gymtracker.shared.presentation.theme.onPrimaryContainerDarkMediumContrast
import com.example.gymtracker.shared.presentation.theme.onPrimaryContainerLight
import com.example.gymtracker.shared.presentation.theme.onPrimaryContainerLightHighContrast
import com.example.gymtracker.shared.presentation.theme.onPrimaryContainerLightMediumContrast
import com.example.gymtracker.shared.presentation.theme.onPrimaryDark
import com.example.gymtracker.shared.presentation.theme.onPrimaryDarkHighContrast
import com.example.gymtracker.shared.presentation.theme.onPrimaryDarkMediumContrast
import com.example.gymtracker.shared.presentation.theme.onPrimaryLight
import com.example.gymtracker.shared.presentation.theme.onPrimaryLightHighContrast
import com.example.gymtracker.shared.presentation.theme.onPrimaryLightMediumContrast
import com.example.gymtracker.shared.presentation.theme.onSecondaryContainerDark
import com.example.gymtracker.shared.presentation.theme.onSecondaryContainerDarkHighContrast
import com.example.gymtracker.shared.presentation.theme.onSecondaryContainerDarkMediumContrast
import com.example.gymtracker.shared.presentation.theme.onSecondaryContainerLight
import com.example.gymtracker.shared.presentation.theme.onSecondaryContainerLightHighContrast
import com.example.gymtracker.shared.presentation.theme.onSecondaryContainerLightMediumContrast
import com.example.gymtracker.shared.presentation.theme.onSecondaryDark
import com.example.gymtracker.shared.presentation.theme.onSecondaryDarkHighContrast
import com.example.gymtracker.shared.presentation.theme.onSecondaryDarkMediumContrast
import com.example.gymtracker.shared.presentation.theme.onSecondaryLight
import com.example.gymtracker.shared.presentation.theme.onSecondaryLightHighContrast
import com.example.gymtracker.shared.presentation.theme.onSecondaryLightMediumContrast
import com.example.gymtracker.shared.presentation.theme.onSurfaceDark
import com.example.gymtracker.shared.presentation.theme.onSurfaceDarkHighContrast
import com.example.gymtracker.shared.presentation.theme.onSurfaceDarkMediumContrast
import com.example.gymtracker.shared.presentation.theme.onSurfaceLight
import com.example.gymtracker.shared.presentation.theme.onSurfaceLightHighContrast
import com.example.gymtracker.shared.presentation.theme.onSurfaceLightMediumContrast
import com.example.gymtracker.shared.presentation.theme.onSurfaceVariantDark
import com.example.gymtracker.shared.presentation.theme.onSurfaceVariantDarkHighContrast
import com.example.gymtracker.shared.presentation.theme.onSurfaceVariantDarkMediumContrast
import com.example.gymtracker.shared.presentation.theme.onSurfaceVariantLight
import com.example.gymtracker.shared.presentation.theme.onSurfaceVariantLightHighContrast
import com.example.gymtracker.shared.presentation.theme.onSurfaceVariantLightMediumContrast
import com.example.gymtracker.shared.presentation.theme.onTertiaryContainerDark
import com.example.gymtracker.shared.presentation.theme.onTertiaryContainerDarkHighContrast
import com.example.gymtracker.shared.presentation.theme.onTertiaryContainerDarkMediumContrast
import com.example.gymtracker.shared.presentation.theme.onTertiaryContainerLight
import com.example.gymtracker.shared.presentation.theme.onTertiaryContainerLightHighContrast
import com.example.gymtracker.shared.presentation.theme.onTertiaryContainerLightMediumContrast
import com.example.gymtracker.shared.presentation.theme.onTertiaryDark
import com.example.gymtracker.shared.presentation.theme.onTertiaryDarkHighContrast
import com.example.gymtracker.shared.presentation.theme.onTertiaryDarkMediumContrast
import com.example.gymtracker.shared.presentation.theme.onTertiaryLight
import com.example.gymtracker.shared.presentation.theme.onTertiaryLightHighContrast
import com.example.gymtracker.shared.presentation.theme.onTertiaryLightMediumContrast
import com.example.gymtracker.shared.presentation.theme.outlineDark
import com.example.gymtracker.shared.presentation.theme.outlineDarkHighContrast
import com.example.gymtracker.shared.presentation.theme.outlineDarkMediumContrast
import com.example.gymtracker.shared.presentation.theme.outlineLight
import com.example.gymtracker.shared.presentation.theme.outlineLightHighContrast
import com.example.gymtracker.shared.presentation.theme.outlineLightMediumContrast
import com.example.gymtracker.shared.presentation.theme.outlineVariantDark
import com.example.gymtracker.shared.presentation.theme.outlineVariantDarkHighContrast
import com.example.gymtracker.shared.presentation.theme.outlineVariantDarkMediumContrast
import com.example.gymtracker.shared.presentation.theme.outlineVariantLight
import com.example.gymtracker.shared.presentation.theme.outlineVariantLightHighContrast
import com.example.gymtracker.shared.presentation.theme.outlineVariantLightMediumContrast
import com.example.gymtracker.shared.presentation.theme.primaryContainerDark
import com.example.gymtracker.shared.presentation.theme.primaryContainerDarkHighContrast
import com.example.gymtracker.shared.presentation.theme.primaryContainerDarkMediumContrast
import com.example.gymtracker.shared.presentation.theme.primaryContainerLight
import com.example.gymtracker.shared.presentation.theme.primaryContainerLightHighContrast
import com.example.gymtracker.shared.presentation.theme.primaryContainerLightMediumContrast
import com.example.gymtracker.shared.presentation.theme.primaryDark
import com.example.gymtracker.shared.presentation.theme.primaryDarkHighContrast
import com.example.gymtracker.shared.presentation.theme.primaryDarkMediumContrast
import com.example.gymtracker.shared.presentation.theme.primaryLight
import com.example.gymtracker.shared.presentation.theme.primaryLightHighContrast
import com.example.gymtracker.shared.presentation.theme.primaryLightMediumContrast
import com.example.gymtracker.shared.presentation.theme.scrimDark
import com.example.gymtracker.shared.presentation.theme.scrimDarkHighContrast
import com.example.gymtracker.shared.presentation.theme.scrimDarkMediumContrast
import com.example.gymtracker.shared.presentation.theme.scrimLight
import com.example.gymtracker.shared.presentation.theme.scrimLightHighContrast
import com.example.gymtracker.shared.presentation.theme.scrimLightMediumContrast
import com.example.gymtracker.shared.presentation.theme.secondaryContainerDark
import com.example.gymtracker.shared.presentation.theme.secondaryContainerDarkHighContrast
import com.example.gymtracker.shared.presentation.theme.secondaryContainerDarkMediumContrast
import com.example.gymtracker.shared.presentation.theme.secondaryContainerLight
import com.example.gymtracker.shared.presentation.theme.secondaryContainerLightHighContrast
import com.example.gymtracker.shared.presentation.theme.secondaryContainerLightMediumContrast
import com.example.gymtracker.shared.presentation.theme.secondaryDark
import com.example.gymtracker.shared.presentation.theme.secondaryDarkHighContrast
import com.example.gymtracker.shared.presentation.theme.secondaryDarkMediumContrast
import com.example.gymtracker.shared.presentation.theme.secondaryLight
import com.example.gymtracker.shared.presentation.theme.secondaryLightHighContrast
import com.example.gymtracker.shared.presentation.theme.secondaryLightMediumContrast
import com.example.gymtracker.shared.presentation.theme.surfaceBrightDark
import com.example.gymtracker.shared.presentation.theme.surfaceBrightDarkHighContrast
import com.example.gymtracker.shared.presentation.theme.surfaceBrightDarkMediumContrast
import com.example.gymtracker.shared.presentation.theme.surfaceBrightLight
import com.example.gymtracker.shared.presentation.theme.surfaceBrightLightHighContrast
import com.example.gymtracker.shared.presentation.theme.surfaceBrightLightMediumContrast
import com.example.gymtracker.shared.presentation.theme.surfaceContainerDark
import com.example.gymtracker.shared.presentation.theme.surfaceContainerDarkHighContrast
import com.example.gymtracker.shared.presentation.theme.surfaceContainerDarkMediumContrast
import com.example.gymtracker.shared.presentation.theme.surfaceContainerHighDark
import com.example.gymtracker.shared.presentation.theme.surfaceContainerHighDarkHighContrast
import com.example.gymtracker.shared.presentation.theme.surfaceContainerHighDarkMediumContrast
import com.example.gymtracker.shared.presentation.theme.surfaceContainerHighLight
import com.example.gymtracker.shared.presentation.theme.surfaceContainerHighLightHighContrast
import com.example.gymtracker.shared.presentation.theme.surfaceContainerHighLightMediumContrast
import com.example.gymtracker.shared.presentation.theme.surfaceContainerHighestDark
import com.example.gymtracker.shared.presentation.theme.surfaceContainerHighestDarkHighContrast
import com.example.gymtracker.shared.presentation.theme.surfaceContainerHighestDarkMediumContrast
import com.example.gymtracker.shared.presentation.theme.surfaceContainerHighestLight
import com.example.gymtracker.shared.presentation.theme.surfaceContainerHighestLightHighContrast
import com.example.gymtracker.shared.presentation.theme.surfaceContainerHighestLightMediumContrast
import com.example.gymtracker.shared.presentation.theme.surfaceContainerLight
import com.example.gymtracker.shared.presentation.theme.surfaceContainerLightHighContrast
import com.example.gymtracker.shared.presentation.theme.surfaceContainerLightMediumContrast
import com.example.gymtracker.shared.presentation.theme.surfaceContainerLowDark
import com.example.gymtracker.shared.presentation.theme.surfaceContainerLowDarkHighContrast
import com.example.gymtracker.shared.presentation.theme.surfaceContainerLowDarkMediumContrast
import com.example.gymtracker.shared.presentation.theme.surfaceContainerLowLight
import com.example.gymtracker.shared.presentation.theme.surfaceContainerLowLightHighContrast
import com.example.gymtracker.shared.presentation.theme.surfaceContainerLowLightMediumContrast
import com.example.gymtracker.shared.presentation.theme.surfaceContainerLowestDark
import com.example.gymtracker.shared.presentation.theme.surfaceContainerLowestDarkHighContrast
import com.example.gymtracker.shared.presentation.theme.surfaceContainerLowestDarkMediumContrast
import com.example.gymtracker.shared.presentation.theme.surfaceContainerLowestLight
import com.example.gymtracker.shared.presentation.theme.surfaceContainerLowestLightHighContrast
import com.example.gymtracker.shared.presentation.theme.surfaceContainerLowestLightMediumContrast
import com.example.gymtracker.shared.presentation.theme.surfaceDark
import com.example.gymtracker.shared.presentation.theme.surfaceDarkHighContrast
import com.example.gymtracker.shared.presentation.theme.surfaceDarkMediumContrast
import com.example.gymtracker.shared.presentation.theme.surfaceDimDark
import com.example.gymtracker.shared.presentation.theme.surfaceDimDarkHighContrast
import com.example.gymtracker.shared.presentation.theme.surfaceDimDarkMediumContrast
import com.example.gymtracker.shared.presentation.theme.surfaceDimLight
import com.example.gymtracker.shared.presentation.theme.surfaceDimLightHighContrast
import com.example.gymtracker.shared.presentation.theme.surfaceDimLightMediumContrast
import com.example.gymtracker.shared.presentation.theme.surfaceLight
import com.example.gymtracker.shared.presentation.theme.surfaceLightHighContrast
import com.example.gymtracker.shared.presentation.theme.surfaceLightMediumContrast
import com.example.gymtracker.shared.presentation.theme.surfaceVariantDark
import com.example.gymtracker.shared.presentation.theme.surfaceVariantDarkHighContrast
import com.example.gymtracker.shared.presentation.theme.surfaceVariantDarkMediumContrast
import com.example.gymtracker.shared.presentation.theme.surfaceVariantLight
import com.example.gymtracker.shared.presentation.theme.surfaceVariantLightHighContrast
import com.example.gymtracker.shared.presentation.theme.surfaceVariantLightMediumContrast
import com.example.gymtracker.shared.presentation.theme.tertiaryContainerDark
import com.example.gymtracker.shared.presentation.theme.tertiaryContainerDarkHighContrast
import com.example.gymtracker.shared.presentation.theme.tertiaryContainerDarkMediumContrast
import com.example.gymtracker.shared.presentation.theme.tertiaryContainerLight
import com.example.gymtracker.shared.presentation.theme.tertiaryContainerLightHighContrast
import com.example.gymtracker.shared.presentation.theme.tertiaryContainerLightMediumContrast
import com.example.gymtracker.shared.presentation.theme.tertiaryDark
import com.example.gymtracker.shared.presentation.theme.tertiaryDarkHighContrast
import com.example.gymtracker.shared.presentation.theme.tertiaryDarkMediumContrast
import com.example.gymtracker.shared.presentation.theme.tertiaryLight
import com.example.gymtracker.shared.presentation.theme.tertiaryLightHighContrast
import com.example.gymtracker.shared.presentation.theme.tertiaryLightMediumContrast

private val lightScheme = lightColorScheme(
    primary = primaryLight,
    onPrimary = onPrimaryLight,
    primaryContainer = primaryContainerLight,
    onPrimaryContainer = onPrimaryContainerLight,
    secondary = secondaryLight,
    onSecondary = onSecondaryLight,
    secondaryContainer = secondaryContainerLight,
    onSecondaryContainer = onSecondaryContainerLight,
    tertiary = tertiaryLight,
    onTertiary = onTertiaryLight,
    tertiaryContainer = tertiaryContainerLight,
    onTertiaryContainer = onTertiaryContainerLight,
    error = errorLight,
    onError = onErrorLight,
    errorContainer = errorContainerLight,
    onErrorContainer = onErrorContainerLight,
    background = backgroundLight,
    onBackground = onBackgroundLight,
    surface = surfaceLight,
    onSurface = onSurfaceLight,
    surfaceVariant = surfaceVariantLight,
    onSurfaceVariant = onSurfaceVariantLight,
    outline = outlineLight,
    outlineVariant = outlineVariantLight,
    scrim = scrimLight,
    inverseSurface = inverseSurfaceLight,
    inverseOnSurface = inverseOnSurfaceLight,
    inversePrimary = inversePrimaryLight,
    surfaceDim = surfaceDimLight,
    surfaceBright = surfaceBrightLight,
    surfaceContainerLowest = surfaceContainerLowestLight,
    surfaceContainerLow = surfaceContainerLowLight,
    surfaceContainer = surfaceContainerLight,
    surfaceContainerHigh = surfaceContainerHighLight,
    surfaceContainerHighest = surfaceContainerHighestLight,
)

private val darkScheme = darkColorScheme(
    primary = primaryDark,
    onPrimary = onPrimaryDark,
    primaryContainer = primaryContainerDark,
    onPrimaryContainer = onPrimaryContainerDark,
    secondary = secondaryDark,
    onSecondary = onSecondaryDark,
    secondaryContainer = secondaryContainerDark,
    onSecondaryContainer = onSecondaryContainerDark,
    tertiary = tertiaryDark,
    onTertiary = onTertiaryDark,
    tertiaryContainer = tertiaryContainerDark,
    onTertiaryContainer = onTertiaryContainerDark,
    error = errorDark,
    onError = onErrorDark,
    errorContainer = errorContainerDark,
    onErrorContainer = onErrorContainerDark,
    background = backgroundDark,
    onBackground = onBackgroundDark,
    surface = surfaceDark,
    onSurface = onSurfaceDark,
    surfaceVariant = surfaceVariantDark,
    onSurfaceVariant = onSurfaceVariantDark,
    outline = outlineDark,
    outlineVariant = outlineVariantDark,
    scrim = scrimDark,
    inverseSurface = inverseSurfaceDark,
    inverseOnSurface = inverseOnSurfaceDark,
    inversePrimary = inversePrimaryDark,
    surfaceDim = surfaceDimDark,
    surfaceBright = surfaceBrightDark,
    surfaceContainerLowest = surfaceContainerLowestDark,
    surfaceContainerLow = surfaceContainerLowDark,
    surfaceContainer = surfaceContainerDark,
    surfaceContainerHigh = surfaceContainerHighDark,
    surfaceContainerHighest = surfaceContainerHighestDark,
)

private val mediumContrastLightColorScheme = lightColorScheme(
    primary = primaryLightMediumContrast,
    onPrimary = onPrimaryLightMediumContrast,
    primaryContainer = primaryContainerLightMediumContrast,
    onPrimaryContainer = onPrimaryContainerLightMediumContrast,
    secondary = secondaryLightMediumContrast,
    onSecondary = onSecondaryLightMediumContrast,
    secondaryContainer = secondaryContainerLightMediumContrast,
    onSecondaryContainer = onSecondaryContainerLightMediumContrast,
    tertiary = tertiaryLightMediumContrast,
    onTertiary = onTertiaryLightMediumContrast,
    tertiaryContainer = tertiaryContainerLightMediumContrast,
    onTertiaryContainer = onTertiaryContainerLightMediumContrast,
    error = errorLightMediumContrast,
    onError = onErrorLightMediumContrast,
    errorContainer = errorContainerLightMediumContrast,
    onErrorContainer = onErrorContainerLightMediumContrast,
    background = backgroundLightMediumContrast,
    onBackground = onBackgroundLightMediumContrast,
    surface = surfaceLightMediumContrast,
    onSurface = onSurfaceLightMediumContrast,
    surfaceVariant = surfaceVariantLightMediumContrast,
    onSurfaceVariant = onSurfaceVariantLightMediumContrast,
    outline = outlineLightMediumContrast,
    outlineVariant = outlineVariantLightMediumContrast,
    scrim = scrimLightMediumContrast,
    inverseSurface = inverseSurfaceLightMediumContrast,
    inverseOnSurface = inverseOnSurfaceLightMediumContrast,
    inversePrimary = inversePrimaryLightMediumContrast,
    surfaceDim = surfaceDimLightMediumContrast,
    surfaceBright = surfaceBrightLightMediumContrast,
    surfaceContainerLowest = surfaceContainerLowestLightMediumContrast,
    surfaceContainerLow = surfaceContainerLowLightMediumContrast,
    surfaceContainer = surfaceContainerLightMediumContrast,
    surfaceContainerHigh = surfaceContainerHighLightMediumContrast,
    surfaceContainerHighest = surfaceContainerHighestLightMediumContrast,
)

private val highContrastLightColorScheme = lightColorScheme(
    primary = primaryLightHighContrast,
    onPrimary = onPrimaryLightHighContrast,
    primaryContainer = primaryContainerLightHighContrast,
    onPrimaryContainer = onPrimaryContainerLightHighContrast,
    secondary = secondaryLightHighContrast,
    onSecondary = onSecondaryLightHighContrast,
    secondaryContainer = secondaryContainerLightHighContrast,
    onSecondaryContainer = onSecondaryContainerLightHighContrast,
    tertiary = tertiaryLightHighContrast,
    onTertiary = onTertiaryLightHighContrast,
    tertiaryContainer = tertiaryContainerLightHighContrast,
    onTertiaryContainer = onTertiaryContainerLightHighContrast,
    error = errorLightHighContrast,
    onError = onErrorLightHighContrast,
    errorContainer = errorContainerLightHighContrast,
    onErrorContainer = onErrorContainerLightHighContrast,
    background = backgroundLightHighContrast,
    onBackground = onBackgroundLightHighContrast,
    surface = surfaceLightHighContrast,
    onSurface = onSurfaceLightHighContrast,
    surfaceVariant = surfaceVariantLightHighContrast,
    onSurfaceVariant = onSurfaceVariantLightHighContrast,
    outline = outlineLightHighContrast,
    outlineVariant = outlineVariantLightHighContrast,
    scrim = scrimLightHighContrast,
    inverseSurface = inverseSurfaceLightHighContrast,
    inverseOnSurface = inverseOnSurfaceLightHighContrast,
    inversePrimary = inversePrimaryLightHighContrast,
    surfaceDim = surfaceDimLightHighContrast,
    surfaceBright = surfaceBrightLightHighContrast,
    surfaceContainerLowest = surfaceContainerLowestLightHighContrast,
    surfaceContainerLow = surfaceContainerLowLightHighContrast,
    surfaceContainer = surfaceContainerLightHighContrast,
    surfaceContainerHigh = surfaceContainerHighLightHighContrast,
    surfaceContainerHighest = surfaceContainerHighestLightHighContrast,
)

private val mediumContrastDarkColorScheme = darkColorScheme(
    primary = primaryDarkMediumContrast,
    onPrimary = onPrimaryDarkMediumContrast,
    primaryContainer = primaryContainerDarkMediumContrast,
    onPrimaryContainer = onPrimaryContainerDarkMediumContrast,
    secondary = secondaryDarkMediumContrast,
    onSecondary = onSecondaryDarkMediumContrast,
    secondaryContainer = secondaryContainerDarkMediumContrast,
    onSecondaryContainer = onSecondaryContainerDarkMediumContrast,
    tertiary = tertiaryDarkMediumContrast,
    onTertiary = onTertiaryDarkMediumContrast,
    tertiaryContainer = tertiaryContainerDarkMediumContrast,
    onTertiaryContainer = onTertiaryContainerDarkMediumContrast,
    error = errorDarkMediumContrast,
    onError = onErrorDarkMediumContrast,
    errorContainer = errorContainerDarkMediumContrast,
    onErrorContainer = onErrorContainerDarkMediumContrast,
    background = backgroundDarkMediumContrast,
    onBackground = onBackgroundDarkMediumContrast,
    surface = surfaceDarkMediumContrast,
    onSurface = onSurfaceDarkMediumContrast,
    surfaceVariant = surfaceVariantDarkMediumContrast,
    onSurfaceVariant = onSurfaceVariantDarkMediumContrast,
    outline = outlineDarkMediumContrast,
    outlineVariant = outlineVariantDarkMediumContrast,
    scrim = scrimDarkMediumContrast,
    inverseSurface = inverseSurfaceDarkMediumContrast,
    inverseOnSurface = inverseOnSurfaceDarkMediumContrast,
    inversePrimary = inversePrimaryDarkMediumContrast,
    surfaceDim = surfaceDimDarkMediumContrast,
    surfaceBright = surfaceBrightDarkMediumContrast,
    surfaceContainerLowest = surfaceContainerLowestDarkMediumContrast,
    surfaceContainerLow = surfaceContainerLowDarkMediumContrast,
    surfaceContainer = surfaceContainerDarkMediumContrast,
    surfaceContainerHigh = surfaceContainerHighDarkMediumContrast,
    surfaceContainerHighest = surfaceContainerHighestDarkMediumContrast,
)

private val highContrastDarkColorScheme = darkColorScheme(
    primary = primaryDarkHighContrast,
    onPrimary = onPrimaryDarkHighContrast,
    primaryContainer = primaryContainerDarkHighContrast,
    onPrimaryContainer = onPrimaryContainerDarkHighContrast,
    secondary = secondaryDarkHighContrast,
    onSecondary = onSecondaryDarkHighContrast,
    secondaryContainer = secondaryContainerDarkHighContrast,
    onSecondaryContainer = onSecondaryContainerDarkHighContrast,
    tertiary = tertiaryDarkHighContrast,
    onTertiary = onTertiaryDarkHighContrast,
    tertiaryContainer = tertiaryContainerDarkHighContrast,
    onTertiaryContainer = onTertiaryContainerDarkHighContrast,
    error = errorDarkHighContrast,
    onError = onErrorDarkHighContrast,
    errorContainer = errorContainerDarkHighContrast,
    onErrorContainer = onErrorContainerDarkHighContrast,
    background = backgroundDarkHighContrast,
    onBackground = onBackgroundDarkHighContrast,
    surface = surfaceDarkHighContrast,
    onSurface = onSurfaceDarkHighContrast,
    surfaceVariant = surfaceVariantDarkHighContrast,
    onSurfaceVariant = onSurfaceVariantDarkHighContrast,
    outline = outlineDarkHighContrast,
    outlineVariant = outlineVariantDarkHighContrast,
    scrim = scrimDarkHighContrast,
    inverseSurface = inverseSurfaceDarkHighContrast,
    inverseOnSurface = inverseOnSurfaceDarkHighContrast,
    inversePrimary = inversePrimaryDarkHighContrast,
    surfaceDim = surfaceDimDarkHighContrast,
    surfaceBright = surfaceBrightDarkHighContrast,
    surfaceContainerLowest = surfaceContainerLowestDarkHighContrast,
    surfaceContainerLow = surfaceContainerLowDarkHighContrast,
    surfaceContainer = surfaceContainerDarkHighContrast,
    surfaceContainerHigh = surfaceContainerHighDarkHighContrast,
    surfaceContainerHighest = surfaceContainerHighestDarkHighContrast,
)

@Immutable
data class ColorFamily(
    val color: Color,
    val onColor: Color,
    val colorContainer: Color,
    val onColorContainer: Color
)

val unspecified_scheme = ColorFamily(
    Color.Unspecified, Color.Unspecified, Color.Unspecified, Color.Unspecified
)

@Composable
fun AppTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    // Dynamic color is available on Android 12+
    dynamicColor: Boolean = true,
    content: @Composable() () -> Unit
) {
    val colorScheme = when {
        dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
            val context = LocalContext.current
            if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
        }

        darkTheme -> darkScheme
        else -> lightScheme
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}

