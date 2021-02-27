package com.guru.fontawesomecompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.guru.fontawesomecompose.ui.theme.FontAwesomeComposeTheme
import com.guru.fontawesomecomposelib.FaIcon

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
        SizeIcons()
        ColorIcons()
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
        FaIcon(faIcon = FaIcons.AddressBookRegular)
        FaIcon(faIcon = FaIcons.ChartBar)
        FaIcon(faIcon = FaIcons.ChartBarRegular)
        FaIcon(faIcon = FaIcons.Airbnb)
        FaIcon(faIcon = FaIcons.Amazon)
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
        FaIcon(faIcon = FaIcons.AddressBookRegular)
        FaIcon(faIcon = FaIcons.AngryRegular)
        FaIcon(faIcon = FaIcons.ArrowAltCircleDownRegular)
        FaIcon(faIcon = FaIcons.ChartBarRegular)
        FaIcon(faIcon = FaIcons.MoneyBillAltRegular)
        FaIcon(faIcon = FaIcons.Airbnb)
        FaIcon(faIcon = FaIcons.Amazon)
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
        FaIcon(faIcon = FaIcons.Airbnb)
        FaIcon(faIcon = FaIcons.Amazon)
        FaIcon(faIcon = FaIcons.AppStore)
        FaIcon(faIcon = FaIcons.Playstation)
        FaIcon(faIcon = FaIcons.Snapchat)
    }
}

@Composable
fun SizeIcons() {
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
        Text("24.sp")
        Text("28.sp")
        Text("32.sp")
        Text("36.sp")
        Text("48.sp")
    }
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        horizontalArrangement = Arrangement.SpaceAround
    ) {
        FaIcon(faIcon = FaIcons.Airbnb, size = 24.dp)
        FaIcon(faIcon = FaIcons.Airbnb, size = 28.dp)
        FaIcon(faIcon = FaIcons.Airbnb, size = 32.dp)
        FaIcon(faIcon = FaIcons.Airbnb, size = 36.dp)
        FaIcon(faIcon = FaIcons.Airbnb, size = 48.dp)
    }
}


@Composable
fun ColorIcons() {
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
        FaIcon(faIcon = FaIcons.Airbnb, tint = MaterialTheme.colors.primary)
        FaIcon(faIcon = FaIcons.Airbnb, tint = MaterialTheme.colors.secondary)
        FaIcon(faIcon = FaIcons.Airbnb, tint = Color.Magenta)
        FaIcon(faIcon = FaIcons.Airbnb, tint = Color.Yellow)
        FaIcon(faIcon = FaIcons.Airbnb, tint = Color.DarkGray)
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    FontAwesomeComposeTheme {
        Demo()
    }
}