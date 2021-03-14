# Font Awesome Compose 


FontAwesoneConmpose is collection of ready to use [Font Awesome](https://fontawesome.com/icons) free icons for Jetpack Compose.

[![](https://jitpack.io/v/Gurupreet/FontAwesomeCompose.svg)](https://jitpack.io/#Gurupreet/FontAwesomeCompose)

### Demo Icon usage
  FontAwesomeExample            | ComposeCookBook Bottombar           | ComposeCookbook Login Demo
:-------------------------:|:-------------------------: | :-------------------------:
![](https://user-images.githubusercontent.com/4903762/111063475-a119c880-84e9-11eb-887d-8984e454f401.jpg)  |  ![](https://user-images.githubusercontent.com/4903762/111063452-7af42880-84e9-11eb-8f9d-26bcd29cbd9d.jpg) | ![](https://user-images.githubusercontent.com/4903762/111063454-7d568280-84e9-11eb-896e-820717902aa0.jpg)


Download
--------
Add in project build.gradle:

```gradle
repositories {
  maven { url 'https://jitpack.io' }
}

// App build.gradle
dependencies {
  implementation 'com.github.Gurupreet:FontAwesomeCompose:1.0.1-alpha01'
}
```

### Icon Types

There are mainly 3 types of icons available as below. 
By default all icons are solid (1000+ Icons) or Brands(450+ Icons). Those which also support Regular(150+ Icons) will end with "Regular" as suffix.
  * [Solid](https://fontawesome.com/icons?d=gallery&p=2&s=solid&m=free): 
    FaIcons.ChartBar, FaIcons.AddressBook etc.
  * [Regular](https://fontawesome.com/icons?d=gallery&p=2&s=regular&m=free): 
    FaIcons.ChartBarRegular, FaIcons.AddressBookRegular etc.
  * [Brands](https://fontawesome.com/icons?d=gallery&p=2&s=brands&m=free): 
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
