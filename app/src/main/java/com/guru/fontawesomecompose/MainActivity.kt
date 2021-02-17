package com.guru.fontawesomecompose

import FaIcons
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.AccountBox
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.guru.fontawesomecompose.ui.theme.FontAwesomeComposeTheme
import com.guru.fontawesomecomposelib.FaIcon
import com.guru.fontawesomecomposelib.FaIconType

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FontAwesomeComposeTheme(darkTheme = false) {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    Demo()
                }
            }
        }
    }
}

@Composable
fun Demo() {
    Column(modifier = Modifier.fillMaxSize().verticalScroll(rememberScrollState())) {
        Text(
            text = "Font awesome Icon samples",
            style = MaterialTheme.typography.h6,
            modifier = Modifier.padding(16.dp)
        )
        SolidIcons()
        RegularIcons()
        BrandIcons()
    }
}

@Composable
fun SolidIcons() {
    Text(
        text = "Solid Icons (1000+)",
        style = MaterialTheme.typography.h6.copy(fontSize = 14.sp),
        modifier = Modifier.padding(start = 16.dp, top = 16.dp)
    )

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        horizontalArrangement = Arrangement.SpaceAround
    ) {
        FaIcon(faIcon = FaIcons.AddressBook)
        FaIcon(faIcon = FaIcons.Bell)
        FaIcon(faIcon = FaIcons.CalendarCheck)
        FaIcon(faIcon = FaIcons.Flag)
        FaIcon(faIcon = FaIcons.Folder)
        FaIcon(faIcon = FaIcons.Gem)
    }
}

@Composable
fun RegularIcons() {
    Text(
        text = "Regular Icons (150+)",
        style = MaterialTheme.typography.h6.copy(fontSize = 14.sp),
        modifier = Modifier.padding(start = 16.dp, top = 16.dp)
    )
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        horizontalArrangement = Arrangement.SpaceAround
    ) {
        FaIcon(faIcon = FaIcons.AddressBook, iconType = FaIconType.REGULAR)
        FaIcon(faIcon = FaIcons.Bell, iconType = FaIconType.REGULAR)
        FaIcon(faIcon = FaIcons.CalendarCheck, iconType = FaIconType.REGULAR)
        FaIcon(faIcon = FaIcons.Flag, iconType = FaIconType.REGULAR)
        FaIcon(faIcon = FaIcons.Folder, iconType = FaIconType.REGULAR)
        FaIcon(faIcon = FaIcons.Gem, iconType = FaIconType.REGULAR)
    }
}

@Composable
fun BrandIcons() {
    Text(
        text = "Brand Icons (450+)",
        style = MaterialTheme.typography.h6.copy(fontSize = 14.sp),
        modifier = Modifier.padding(start = 16.dp, top = 16.dp)
    )
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        horizontalArrangement = Arrangement.SpaceAround
    ) {
        FaIcon(faIcon = FaIcons.Brands.Airbnb, iconType = FaIconType.BRAND)
        FaIcon(faIcon = FaIcons.Brands.Amazon, iconType = FaIconType.BRAND)
        FaIcon(faIcon = FaIcons.Brands.Alipay, iconType = FaIconType.BRAND)
        FaIcon(faIcon = FaIcons.Brands.Android, iconType = FaIconType.BRAND)
        FaIcon(faIcon = FaIcons.Brands.Bitcoin, iconType = FaIconType.BRAND)
        FaIcon(faIcon = FaIcons.Brands.Chromecast, iconType = FaIconType.BRAND)
    }
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    FontAwesomeComposeTheme {
        Demo()
    }
}