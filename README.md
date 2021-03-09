# Font Awesome Compose 


FontAwesoneConmpose is collection of ready to use [Font Awesome](https://fontawesome.com/icons) free icons for Jetpack Compose.

Download
--------
Add in project build.gradle:

```gradle
repositories {
  maven { url 'https://jitpack.io' }
}

// App build.gradle
dependencies {
  implementation 'com.github.Gurupreet.FontAwesomeCompose:final:0.0.2-alpha01'
}
```

### Icon Types

There are mainly 3 types of icons availble as below. 
By default all icons are solid (1000+ Icons) or Brands(450+ Icons). Those which also support Regular(150+ Icons) will end with ###Regular as suffix.
  * Solid: 
    FaIcons.ChartBar, FaIcons.AddressBook etc.
  * Regular: 
    FaIcons.ChartBarRegular, FaIcons.AddressBookRegular etc.
  * Brands: 
    FaIcons.Amazon, FaIcons.Airbnb
 
## Usage 
FaIcon composable is responsible for rendering icons. It requires icon passed to it from FaIcons collection.
```
 FaIcon(faIcon = FaIcons.ChartBarRegular)
 FaIcon(faIcon = FaIcons.ChartBar)
 FaIcon(faIcon = FaIcons.Amazon)
```

It has 3 params with default value as shown below 
```
fun FaIcon(
    faIcon: FaIconType,
    modifier: Modifier = Modifier,
    size: Dp = 24.dp,
    tint: Color = Color.Unspecified
) 
```

To use different sizes
```
FaIcon(faIcon = FaIcons.Airbnb, size = 24.dp)
FaIcon(faIcon = FaIcons.Airbnb, size = 32.dp)
FaIcon(faIcon = FaIcons.Airbnb, size = 48.dp)
```

To provide different colors
```
FaIcon(faIcon = FaIcons.Airbnb, tint = MaterialTheme.colors.primary)
FaIcon(faIcon = FaIcons.Airbnb, tint = MaterialTheme.colors.secondary)
FaIcon(faIcon = FaIcons.Airbnb, tint = Color.Blue)
```

To provide layout positioning, padding, gestures etc pass Modifier
```
FaIcon(
    faIcon = FaIcons.Amazon,
    modifier = Modifier.semantics { testTag = "Amazon Icon" }
)
FaIcon(
    faIcon = FaIcons.Amazon,
    modifier = Modifier
        .background(Color.Green, shape = CircleShape)
        .padding(8.dp)
)
```
## Info
This icons are based on font awesome free icons version 5.15.0

Library is in early stage and may have breaking changes in coming release.
