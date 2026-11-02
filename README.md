# Tamarack
an android ide idk yada yada theres a text here just for the purpose of having the text here and stuff idk.

will change this later:D

## building the app
this is only for building all in the terminal. tho it'll take 600mb of ur space. but at least u dont need to install android studio:D


<details>
<summary><h2>windows</h2></summary>

**(do this once)**
```
curl.exe -L -o jdk-21.0.12+8.zip https://github.com/adoptium/temurin21-binaries/releases/download/jdk-21.0.12%2B8/OpenJDK21U-jdk_x64_windows_hotspot_21.0.12_8.zip
curl.exe -L -o commandlinetools-win.zip https://dl.google.com/android/repository/commandlinetools-win-15859902_latest.zip

mkdir temp_build\jdk, temp_build\android-sdk
tar -xf jdk-21.0.12+8.zip -C temp_build\jdk
tar -xf commandlinetools-win.zip -C temp_build\android-sdk
del jdk-21.0.12+8.zip, commandlinetools-win.zip

mkdir temp_build\android-sdk\cmdline-tools\latest
move temp_build\android-sdk\cmdline-tools\bin temp_build\android-sdk\cmdline-tools\latest\bin
move temp_build\android-sdk\cmdline-tools\lib temp_build\android-sdk\cmdline-tools\latest\lib
move temp_build\android-sdk\cmdline-tools\NOTICE.txt temp_build\android-sdk\cmdline-tools\latest\
move temp_build\android-sdk\cmdline-tools\source.properties temp_build\android-sdk\cmdline-tools\latest\
```

**(do this every new terminal session)**
```
$env:JAVA_HOME="$PWD\temp_build\jdk\jdk-21.0.12+8"
$env:ANDROID_HOME="$PWD\temp_build\android-sdk"
1..20 | % { "y" } | & "$env:ANDROID_HOME\cmdline-tools\latest\bin\sdkmanager.bat" --licenses
& "$env:ANDROID_HOME\cmdline-tools\latest\bin\sdkmanager.bat" "platform-tools" "platforms;android-37.0"
```

**build**
```
.\gradlew.bat assembleDebug
```

</details>

<details>
<summary><h2>linux</h2></summary>

**(do this once)**
```
curl -L -o jdk-21.0.12+8.tar.gz https://github.com/adoptium/temurin21-binaries/releases/download/jdk-21.0.12%2B8/OpenJDK21U-jdk_x64_linux_hotspot_21.0.12_8.tar.gz
curl -L -o commandlinetools-linux.zip https://dl.google.com/android/repository/commandlinetools-linux-15859902_latest.zip

mkdir -p temp_build/jdk temp_build/android-sdk
tar -xzf jdk-21.0.12+8.tar.gz -C temp_build/jdk
unzip -q commandlinetools-linux.zip -d temp_build/android-sdk
rm jdk-21.0.12+8.tar.gz commandlinetools-linux.zip

mkdir -p temp_build/android-sdk/cmdline-tools/latest
mv temp_build/android-sdk/cmdline-tools/bin temp_build/android-sdk/cmdline-tools/latest/bin
mv temp_build/android-sdk/cmdline-tools/lib temp_build/android-sdk/cmdline-tools/latest/lib
mv temp_build/android-sdk/cmdline-tools/NOTICE.txt temp_build/android-sdk/cmdline-tools/latest/
mv temp_build/android-sdk/cmdline-tools/source.properties temp_build/android-sdk/cmdline-tools/latest/
```

**(do this every new terminal session)**
```
export JAVA_HOME="$PWD/temp_build/jdk/jdk-21.0.12+8"
export ANDROID_HOME="$PWD/temp_build/android-sdk"
yes | "$ANDROID_HOME/cmdline-tools/latest/bin/sdkmanager" --licenses
"$ANDROID_HOME/cmdline-tools/latest/bin/sdkmanager" "platform-tools" "platforms;android-37.0"
```

**build**
```
chmod +x gradlew
./gradlew assembleDebug
```

</details>