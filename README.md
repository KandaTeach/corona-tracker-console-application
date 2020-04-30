# CoronaTracker

A console application used to track 

## API Used

https://disease.sh/

## Documentation

CoronaTracker Documentation can be found at `build\docs\javadoc`

## Arguments and Syntax

#### Syntax

`[--option] [query-name-name]`

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
 * Facebook [here](www.facebook.com.ph\www.keneth.com.ph)
 * Github [here](www.github.com\kandateach)