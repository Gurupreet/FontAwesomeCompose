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
 * @param faIcon use the code point from FaIcons object which is unique for
 * each icon to draw for the corresponding font.
 * @param modifier to apply layout changes.
 * @param iconType for checking which font to load for the given iconType
 * from the values SOLID, REGULAR, BRAND. By DEFAULT it is selected to SOLID
 * as it is the most number of icons if want to use REGULAR/BRAND you have to pass
 * type explicitly.
 * fonts:
 * SOLID: fa_brands_400
 * REGULAR: fa_regular_400
 * BRAND: fa_brands_900
 *
 * ISSUE: If you use brand icon and don't pass iconType Brand icon will be empty space.
 *
 * @param size Since these icons use fonts to render the Glyph we expect size to be in
 * TextUnit which is in sp. Default size is 24.sp
 * @param tint By default it uses the onSurface color of the theme if not provided
 * You can provide any color you want to set tint for
 */

@Composable
fun FaIcon(
    faIcon: Int,
    modifier: Modifier = Modifier,
    iconType: FaIconType = FaIconType.SOLID,
    size: TextUnit = 24.sp,
    tint: Color = MaterialTheme.colors.onSurface
) {
    val faFont = remember(faIcon, iconType) { getFontFamily(iconType) }

    val faTextStyle =
        remember(faIcon) {
            TextStyle(
                color = tint,
                fontFamily = faFont,
                fontSize = size
            )
        }

    BasicText(
        text = faIcon.codePointToString(),
        modifier = modifier,
        style = faTextStyle,
    )
}

private fun Int.codePointToString() = this.toChar().toString()


private fun getFontFamily(type: FaIconType): FontFamily {
    return when (type) {
        FaIconType.BRAND -> FontFamily(
            Font(R.font.fa_brands_400)
        )
        FaIconType.REGULAR -> FontFamily(
            Font(R.font.fa_regular_400)
        )
        FaIconType.SOLID -> FontFamily(
            Font(R.font.fa_solid_900)
        )
    }
}


