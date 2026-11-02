# Tamarack
an android ide idk yada yada theres a text here just for the purpose of having the text here and stuff idk.

will change this later:D

## commit messages
u dont necessarily need to follow this but its good to try:D
- `feat` - add, remove, modify a feature
- `fix` - bugs. be descriptive pls
- `chore` - code refactor, comments, things users wont see
- `repo` - git related, anything viewable only on github
- `readme` - edit the main README.md

sample:
```
feat: add ketchup on my hotdog sandwhich
fix: ketchup bottle has never been refilled yet
chore: rename variable 'ketchup' to 'ketchupBottle'
repo: add github actions for refilling ketchup
readme: add reason why i use ketchup on this sample
```

## building the app
this is only for building all in the terminal. tho it'll take 600mb of ur space. but at least u dont need to install android studio:D


<details>
<summary>windows</summary>

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
<summary>Linux</summary>

### For Linux, use distribution specific package managers (e.g. pacman, apt).
**NOTE: This guide expects bash.**  
**NOTE: Some distributions provide the android sdk via package managers (e.g. Ubuntu).  
If you already have the android sdk [check here](#building).**

1. Install required packages (**Ubuntu or Debian based example**).
```bash
sudo apt update 
sudo apt install curl unzip openjdk-21-jdk
```

2. Download the commandline tools (**NOTE: [Check](https://developer.android.com/studio) for the latest version**).
```bash
curl -L -o /tmp/cmdline-tools.zip https://dl.google.com/android/repository/commandlinetools-linux-15859902_latest.zip
```

3. Create directories and extract the tools.
```bash
mkdir -p ~/Android/Sdk/cmdline-tools/latest
unzip -o /tmp/cmdline-tools.zip -d /tmp

mv /tmp/cmdline-tools/* ~/Android/Sdk/cmdline-tools/latest

rm -rf /tmp/cmdline-tools.zip /tmp/cmdline-tools
```

4. Setup environment (**NOTE: You'll have to run these every time you (re)run a shell or reboot**).
```bash
export ANDROID_HOME="$HOME/Android/Sdk"
export PATH="$PATH:$ANDROID_HOME/cmdline-tools/latest/bin"
```

* Setup environment (**Permanent**).

1. Open `.bashrc` (You may use any text editor you like).
```bash
vi ~/.bashrc
```

2. Enter these lines at the bottom of the file.
```bash
export ANDROID_HOME="$HOME/Android/Sdk"
export PATH="$PATH:$ANDROID_HOME/cmdline-tools/latest/bin"
```

* **Before building accept licenses.**
```bash
yes | sdkmanager --licenses
```

### Building

1. Clone the repository and move into it (You may use shallow clones).
```bash
git clone https://github.com/IMOitself/tamarack.git Tamarack
cd Tamarack
```

2. Make gradlew executable.
```bash
chmod +x ./gradlew
```

3. Build the app (**NOTE: If the build fails with missing sdk components use `sdkmanager` to install them**)
```bash
./gradlew assembleDebug
```

</details>
