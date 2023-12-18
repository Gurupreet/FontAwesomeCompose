package com.guru.fontawesomecomposelib

import androidx.compose.foundation.text.BasicText
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

/**
 * FaIcon composable to draw Font awesome icons
 * @param faIconType use the code point from FaIcons object which is unique for
 * each icon to draw for the corresponding font.
 * @param faIconType supports solid, regular and brand icons.
 * @param iconType for checking which font to load for the given iconType
 * @param modifier to apply layout changes.
 * @param size Provide the Icon size in DP. Since it's a font to not change Icon size with
 * font scaling of device it ignores device font scaling.
 * @param tint By default it uses the onSurface color of the theme if not provided
 * You can provide any color you want to set tint for
 */
@Composable
fun FaIcon(
    faIcon: FaIconType,
    modifier: Modifier = Modifier,
    size: Dp = 24.dp,
    tint: Color = Color.Unspecified
) {
    val scaleFactor = LocalConfiguration.current.fontScale

    val scaleIndependentFontSize =
        scaleIndependentFontSize(sizeInDp = size, scaleFactor = scaleFactor)

    val faTextStyle =
        TextStyle(
            color = tint,
            fontFamily = getFontFamily(faIcon),
            fontSize = scaleIndependentFontSize
        )

    BasicText(
        text = faIcon.src.codePointToString(),
        modifier = modifier,
        style = faTextStyle,
    )
}

private fun getFontFamily(faIconType: FaIconType): FontFamily {
    return when (faIconType) {
        is FaIconType.BrandIcon -> FontFamily(
            Font(resId = R.font.fa_brands_400)
        )
        is FaIconType.SolidIcon -> FontFamily(
            Font(resId = R.font.fa_solid_900)
        )
        is FaIconType.RegularIcon -> FontFamily(
            Font(resId = R.font.fa_regular_400)
        )
    }
}

/** @fun scaleIndependentFontSize: Since FA icons are font that requires Scale pixel
 * to render and will resize on device font settings. We want to keep icon size
 * constant to provided DP value so we calculate scale factor and cancel it if Any
 *
 * @materialIconOffset: FA icons at same dp taking more space then the Material Icon
 * Since we will be using both icons side by side this value offset Fa Icons to stay in line
 * with Material icons sizes.
 */
private fun scaleIndependentFontSize(sizeInDp: Dp, scaleFactor: Float): TextUnit {
    val materialIconOffset = 3.dp
    return ((sizeInDp - materialIconOffset).value  / scaleFactor).sp
}

private fun Int.codePointToString() = this.toChar().toString()





