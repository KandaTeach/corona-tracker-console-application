# CoronaTracker

A command line interface used to track covid-19 cases whole over the world.

## Used API

https://disease.sh/

## Documentation

CoronaTracker Documentation can be found [here](https://github.com/KandaTeach/corona-tracker-console-application/tree/master/build/docs/javadoc)

## Arguments and Syntax

#### Syntax

##### Java JVM

`[--option] [query-name-name]`

##### Gradle

`"['--option','query-name-name']"`

*NOTE* : avoid spaces. Replace spaces with `-`

#### Arguments

1. `--all` total world result.

2. `--today` todays total world result.

3. `--continent [continent-name]` total continent result.

4. `--country [country-name]` total country result.

## How to Run

#### Run with Java JVM.

1. Fork and clone git repository.

2. In root project folder, find `build\libs\coronaTracker-1.0.0.jar`.

3. Run using `java -jar .` command and add arguments to it `java - jar .\build\libs\coronaTracker-1.0.0.jar --country Philippines`.

4. If the command is not working download Java JDK.

#### Run with Gradle

1. Fork and clone git repository.

2. In root project folder, find `gradlew` and `gradlew.bat`.

3. Run it using `gradlew run -PcoronaTracker` command and add arguments to it `gradlew run -PcoronaTracker="['--continent','asia']"`.

4. If the command is not working download Gradle.

## Contact me

 * Facebook [here](https://www.facebook.com/www.keneth.com.ph)
 
 * Github [here](https://github.com/KandaTeach)