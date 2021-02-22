package com.guru.fontawesomecomposelib

import androidx.compose.foundation.text.BasicText
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.sp

/**
 * FaIcon composable to draw Font awesome icons
 * @param faIconType use the code point from FaIcons object which is unique for
 * each icon to draw for the corresponding font.
 * @param faIconType supports solid, regular and brand icons.
 * @param iconType for checking which font to load for the given iconType
 * @param modifier to apply layout changes.
 * @param size Since these icons use fonts to render the Glyph we expect size to be in
 * TextUnit which is in sp. Default size is 24.sp
 * @param tint By default it uses the onSurface color of the theme if not provided
 * You can provide any color you want to set tint for
 */

@Composable
fun FaIcon(
    faIcon: FaIconType,
    modifier: Modifier = Modifier,
    size: TextUnit = 24.sp,
    tint: Color = MaterialTheme.colors.onSurface
) {
    val faFont = remember(faIcon) { getFontFamily(faIcon) }

    val faTextStyle =
        remember(faIcon) {
            TextStyle(
                color = tint,
                fontFamily = faFont,
                fontSize = size
            )
        }

    val codePoint = remember(faIcon) { faIcon.src.codePointToString() }

    BasicText(
        text = codePoint,
        modifier = modifier,
        style = faTextStyle,
    )
}

private fun getFontFamily(faIconType: FaIconType): FontFamily {
    return when (faIconType) {
        is FaIconType.BrandIcon -> FontFamily(
            Font(R.font.fa_brands_400)
        )
        is FaIconType.SolidIcon -> FontFamily(
            Font(R.font.fa_solid_900)
        )
        is FaIconType.RegularIcon -> FontFamily(
            Font(R.font.fa_regular_400)
        )
    }
}


private fun Int.codePointToString() = this.toChar().toString()





