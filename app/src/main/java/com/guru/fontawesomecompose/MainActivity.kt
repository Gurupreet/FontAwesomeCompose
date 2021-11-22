package com.guru.fontawesomecompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material.icons.outlined.Email
import androidx.compose.material.icons.outlined.ShoppingCart
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.guru.fontawesomecompose.ui.theme.FontAwesomeComposeTheme
import com.guru.fontawesomecomposelib.FaIcon
import com.guru.fontawesomecomposelib.FaIcons

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
    LazyColumn(modifier = Modifier
        .fillMaxSize()) {
        item {
            Text(
                text = "Font awesome Icon samples",
                style = MaterialTheme.typography.h6,
                modifier = Modifier.padding(16.dp)
            )
        }
        item { SolidIcons() }
        item { RegularIcons() }
        item { BrandIcons() }
        item { MaterialVsFaIcons() }
        item { SizeIcons() }
        item { ColorIcons() }
        item { BackgroundClickable() }
        item { IconsWithAppBar() }
        item { IconsInBottomNavigation() }
        item { IconsInListItem() }
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
        FaIcon(faIcon = FaIcons.FileCode)
        FaIcon(faIcon = FaIcons.ChartBar)
        FaIcon(faIcon = FaIcons.MoneyBillAlt)
        FaIcon(faIcon = FaIcons.DotCircle)
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
        FaIcon(faIcon = FaIcons.FileCodeRegular)
        FaIcon(faIcon = FaIcons.ChartBarRegular)
        FaIcon(faIcon = FaIcons.MoneyBillAltRegular)
        FaIcon(faIcon = FaIcons.DotCircleRegular)
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
        text = "Icons Sizes (FA vs Material)",
        style = MaterialTheme.typography.h6.copy(fontSize = 14.sp),
        modifier = Modifier.padding(start = 16.dp, top = 16.dp)
    )
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        horizontalArrangement = Arrangement.SpaceAround
    ) {
        Text("12.Dp")
        Text("16.Dp")
        Text("24.Dp")
        Text("32.Dp")
        Text("48.Dp")
    }
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        horizontalArrangement = Arrangement.SpaceAround
    ) {
        FaIcon(faIcon = FaIcons.HeartRegular, size = 12.dp)
        FaIcon(faIcon = FaIcons.Star, size = 16.dp)
        FaIcon(faIcon = FaIcons.Trash, size = 24.dp)
        FaIcon(faIcon = FaIcons.HeartRegular, size = 32.dp)
        FaIcon(faIcon = FaIcons.HeartRegular, size = 48.dp)
    }
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        horizontalArrangement = Arrangement.SpaceAround
    ) {
        Icon(
            imageVector = Icons.Default.FavoriteBorder,
            contentDescription = null,
            modifier = Modifier.size(12.dp)
        )
        Icon(
            imageVector = Icons.Default.Star,
            contentDescription = null,
            modifier = Modifier.size(16.dp)
        )
        Icon(
            imageVector = Icons.Default.Delete,
            contentDescription = null,
        )
        Icon(
            imageVector = Icons.Default.FavoriteBorder,
            contentDescription = null,
            modifier = Modifier.size(32.dp)
        )
        Icon(
            imageVector = Icons.Default.FavoriteBorder,
            contentDescription = null,
            modifier = Modifier.size(48.dp)
        )
    }
}


@Composable
fun ColorIcons() {
    Text(
        text = "Color Icons",
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
        FaIcon(faIcon = FaIcons.Airbnb, tint = Color.Red)
        FaIcon(faIcon = FaIcons.Airbnb, tint = Color.DarkGray)
    }
}

@Composable
fun BackgroundClickable() {
    Text(
        text = "Clickable",
        style = MaterialTheme.typography.h6.copy(fontSize = 14.sp),
        modifier = Modifier.padding(start = 16.dp, top = 16.dp)
    )

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        horizontalArrangement = Arrangement.SpaceAround
    ) {
        IconButton(onClick = { }, modifier = Modifier.background(MaterialTheme.colors.primary,
            shape = CircleShape)) {
            FaIcon(faIcon = FaIcons.Airbnb, tint = MaterialTheme.colors.onPrimary)
        }
        IconButton(onClick = { }, modifier = Modifier.background(MaterialTheme.colors.primary,
            shape = CircleShape)) {
            FaIcon(faIcon = FaIcons.Linkedin, tint = MaterialTheme.colors.onPrimary)
        }
        IconButton(onClick = { }, modifier = Modifier.background(MaterialTheme.colors.primary,
            shape = CircleShape)) {
            FaIcon(faIcon = FaIcons.YoutubeSquare, tint = MaterialTheme.colors.onPrimary)
        }
        IconButton(onClick = { }, modifier = Modifier.background(MaterialTheme.colors.primary,
            shape = CircleShape)) {
            FaIcon(faIcon = FaIcons.AppStore, tint = MaterialTheme.colors.onPrimary)
        }
        IconButton(onClick = { }, modifier = Modifier.background(MaterialTheme.colors.primary,
            shape = CircleShape)) {
            FaIcon(faIcon = FaIcons.Playstation, tint = MaterialTheme.colors.onPrimary)
        }
    }
}

@Composable
fun IconsWithAppBar() {
    TopAppBar(
        title = { Text(text = "Instagram") },
        navigationIcon = { FaIcon(faIcon = FaIcons.Instagram, tint = LocalContentColor.current) },
        actions = {
            IconButton(onClick = { /*TODO*/ }) {
                FaIcon(faIcon = FaIcons.HeartRegular, tint = LocalContentColor.current)
            }
            IconButton(onClick = { /*TODO*/ }) {
                FaIcon(faIcon = FaIcons.FacebookMessenger, tint = LocalContentColor.current)
            }
        }
    )
    Spacer(modifier = Modifier.height(50.dp))
}

@Composable
fun IconsInBottomNavigation() {
    BottomNavigation {
        BottomNavigationItem(
            icon = { FaIcon(faIcon = FaIcons.Home, tint = LocalContentColor.current.copy(alpha = LocalContentAlpha.current))},
            selected = true,
            onClick = {},
            label = { Text(text = "Home") },
        )
        BottomNavigationItem(
            icon = { FaIcon(faIcon = FaIcons.SearchLocation, tint = LocalContentColor
                .current.copy(alpha = LocalContentAlpha.current)) },
            selected = false,
            onClick = {},
            label = { Text(text = "Discover") },
        )
        BottomNavigationItem(
            icon = { FaIcon(faIcon = FaIcons.PersonBooth, tint = LocalContentColor
                .current.copy(alpha = LocalContentAlpha.current)) },
            selected = false,
            onClick = {},
            label = { Text(text = "Profile") },
        )
    }
    Spacer(modifier = Modifier.height(50.dp))
}

@Composable
fun IconsInListItem() {
        Row(modifier = Modifier.fillMaxWidth()) {
            Column(modifier = Modifier
                .weight(1f)
                .padding(8.dp)) {
                Text(
                    text = "Title content",
                    style = MaterialTheme.typography.h6,
                    modifier = Modifier.padding(horizontal = 4.dp)
                )
                Text(
                    text = "This is subtitle content this can be long or short depending upon the" +
                        " content.",
                    style = MaterialTheme.typography.body2,
                    modifier = Modifier.padding(horizontal = 4.dp)
                )
                Row {
                    IconButton(onClick = { /*TODO*/ }) {
                        FaIcon(faIcon = FaIcons.CommentAltRegular)
                    }
                    IconButton(onClick = { /*TODO*/ }) {
                        FaIcon(faIcon = FaIcons.SaveRegular)
                    }
                    IconButton(onClick = { /*TODO*/ }) {
                        FaIcon(faIcon = FaIcons.FolderOpenRegular)
                    }
                }
            }
            IconButton(onClick = {}) {
                FaIcon(faIcon = FaIcons.HeartRegular, tint = MaterialTheme.colors.onSurface)
            }
        }
}

@Composable
fun MaterialVsFaIcons() {
    Text(
        text = "FaIcon vs Material Icons",
        style = MaterialTheme.typography.h6.copy(fontSize = 14.sp),
        modifier = Modifier.padding(start = 16.dp, top = 16.dp)
    )
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        horizontalArrangement = Arrangement.SpaceAround
    ) {
        Column {
            FaIcon(faIcon = FaIcons.HeartRegular)
            Spacer(modifier = Modifier.height(8.dp))
            Icon(imageVector = Icons.Default.FavoriteBorder, contentDescription = null)
        }
        Column {
            FaIcon(faIcon = FaIcons.Envelope)
            Spacer(modifier = Modifier.height(8.dp))
            Icon(imageVector = Icons.Default.Email, contentDescription = null)
        }
        Column {
            FaIcon(faIcon = FaIcons.CheckCircle)
            Spacer(modifier = Modifier.height(8.dp))
            Icon(imageVector = Icons.Filled.CheckCircle, contentDescription = null)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    FontAwesomeComposeTheme {
        Demo()
    }
}