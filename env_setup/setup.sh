# checking whether the 
sdkmanager --list
java -version
gradle -v
# create project structure
#!/bin/bash

# Set your base project directory here
PACKAGE_PATH="com/alishakiba/compass"

# Create the folder structure
mkdir -p app/src/main/java/$PACKAGE_PATH/compass
mkdir -p app/src/main/java/$PACKAGE_PATH/map
mkdir -p app/src/main/java/$PACKAGE_PATH/sensor
mkdir -p app/src/main/java/$PACKAGE_PATH/qibla
mkdir -p app/src/main/java/$PACKAGE_PATH/util
mkdir -p app/src/main/res/layout
mkdir -p app/src/main/res/drawable
mkdir -p app/src/main/res/mipmap
mkdir -p app/src/main/res/values
mkdir -p gradle/wrapper

# Create empty files
touch app/src/main/java/$PACKAGE_PATH/MainActivity.java
touch app/src/main/AndroidManifest.xml
touch app/build.gradle
touch build.gradle
touch gradle.properties
touch gradlew
touch gradlew.bat
touch settings.gradle
touch gradle/wrapper/gradle-wrapper.jar
touch gradle/wrapper/gradle-wrapper.properties

echo "Project scaffolding complete in /"
