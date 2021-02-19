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


sealed class NewFaIcon(val src: Int) {
    class GeneralPurposeIcon(
        val icon: GeneralPurposeIcons,
        val styles: FaIconStyles = FaIconStyles.SOLID
    ) : NewFaIcon(icon.intSrc)

    class BrandIcon(
        val icon: OussBrandIcons
    ) : NewFaIcon(icon.intSrc)
}

enum class GeneralPurposeIcons(val intSrc: Int) {
    ADDRESS_BOOK(0xf2b9),
    ADDRESS_CARD(0xf2bb)
    // Add others
}

enum class OussBrandIcons(val intSrc: Int) {
    AIR_BNB(0xf834),
    AMAZON(0xf270)
    // Add others
}

enum class FaIconStyles {
    REGULAR, SOLID
}


@Composable
fun OussFaIcon(
    faIcon: NewFaIcon,
    modifier: Modifier = Modifier,
    size: TextUnit = 24.sp,
    color: Color = MaterialTheme.colors.onSurface
) {
    val faFont = remember(faIcon) { getFontFamily(faIcon) }

    val faTextStyle =
        remember(faIcon) {
            TextStyle(
                color = color,
                fontFamily = faFont,
                fontSize = size
            )
        }

    BasicText(
        text = faIcon.src.codePointToString(),
        modifier = modifier,
        style = faTextStyle,
    )
}

private fun Int.codePointToString() = this.toChar().toString()


private fun getFontFamily(faIcon: NewFaIcon): FontFamily {
    return when (faIcon) {
        is NewFaIcon.BrandIcon -> FontFamily(
            Font(R.font.fa_brands_400)
        )
        is NewFaIcon.GeneralPurposeIcon -> return when (faIcon.styles) {
            FaIconStyles.REGULAR -> FontFamily(
                Font(R.font.fa_regular_400)
            )
            FaIconStyles.SOLID -> FontFamily(
                Font(R.font.fa_solid_900)
            )
        }
    }
}
