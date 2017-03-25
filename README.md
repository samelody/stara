# Stara

[![JitPack](https://jitpack.io/v/samelody/stara.svg)](https://jitpack.io/#samelody/stara)
![Android](https://img.shields.io/badge/platform-Android-brightgreen.svg)
[![Apache](https://img.shields.io/hexpm/l/plug.svg)](LICENSE)
![API](https://img.shields.io/badge/API-14%2B-brightgreen.svg)

Unified APIs for starting activities. We don't care about the real Activity/Fragment/Context
starts the activities.

**DO NOT USE THIS LIBRARY IN PRODUCTION** until `1.0.0` is released.

# Download

This project is available on `JitPack` repository.

In your root `build.gradle`:

```gradle
allprojects {
    repositories {
        // ...
        maven { url "https://jitpack.io" }
    }
}
```

In your app `build.gradle`:

```gradle
dependencies {
    compile 'com.github.samelody:stara:0.1.0'
}
```

# Getting started

```java
Intent intent = null; // Creates the intent.
Stara.newStarter(Activity/Fragment/Context).startActivity(intent);
```

The APIs to start activities:

```java
void startActivity(Intent intent);
void startActivity(Intent intent, Bundle options);
void startActivityForResult(Intent intent, int requestCode);
void startActivityForResult(Intent intent, int requestCode, Bundle options);
void startActivities(Intent... intents);
void startActivities(Intent[] intents, Bundle options);
```

# Dependencies

```java
compile 'com.android.support:support-v4:25.3.0'
```

# Compatibility

- **Android SDK**: Requires a minimum API level of 14.

# License

    Copyright (c) 2017-present Samelody.com

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

      http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.