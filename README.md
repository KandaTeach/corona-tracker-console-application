# CoronaTracker

A command line interface used to track covid-19 cases whole over the world.

## Source API

https://disease.sh/

## Parameters and Syntax

#### Syntax

##### Java

`[--parameters]`

##### Gradle

`"['--parameters']"`

*NOTE* : avoid spaces. Replace spaces with `-`

#### Parameters

1. `--all` total world result.

2. `--continent [continent-name]` total continent result.

3. `--country [country-name]` total country result.

4. `--help` view all parameters in console.

## How to Run

#### Run with Java

1. Fork and clone git repository.

2. Call directory file.

3. In root project folder, find `build\libs\coronaTracker-1.0.0.jar`.

4. Run using `java -jar .` command and add parameters to it `java -jar .\build\libs\coronaTracker-1.0.0.jar --country Philippines`.

5. If the command is not working download Java JDK.

#### Run with Gradle

1. Fork and clone git repository.

2. Call directory file.

3. In root project folder, find `gradlew` and `gradlew.bat`.

4. Run it using `gradlew run -PcoronaTracker` command and add arguments to it `gradlew run -PcoronaTracker="['--continent','asia']"`.

5. If the command is not working download Gradle.