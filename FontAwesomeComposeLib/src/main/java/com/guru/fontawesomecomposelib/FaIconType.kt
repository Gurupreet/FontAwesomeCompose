package com.guru.fontawesomecomposelib


sealed class FaIconType(val src: Int) {
    class SolidIcon(private val icon: Int, ) : FaIconType(icon)

    class RegularIcon(private val icon: Int, ) : FaIconType(icon)

    class BrandIcon(private val icon: Int) : FaIconType(icon)
}


