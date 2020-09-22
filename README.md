# CoronaTracker

A command line interface used to track covid-19 cases.

## Parameters and Syntax

#### Syntax

##### Java
`[--parameters [path-query]]`

##### Gradle
`"['--parameters', 'path-query']"`

*NOTE* : Avoid space. Replace space with `-`.

#### Parameters
1. `--request [path-query]` What data do you want to request for.

2. `--help` view all parameters in console.

*NOTE* : There are 4 paths to make request those are `all`, `continents-query`, `countries-query` and `states-query`.

## How to Run

#### Run with Java
1. Fork and clone git repository.

2. Call directory file.

3. In root project folder, find `build\libs\coronaTracker-1.0.0.jar`.

4. Run using `java -jar .` command and add parameters to it `java -jar .\build\libs\coronaTracker-1.0.0.jar --request countries-ph`.

#### Run with Gradle
1. Fork and clone git repository.

2. Call directory file.

3. In root project folder, find `gradlew` and `gradlew.bat`.

4. Run it using `gradlew run -PcoronaTracker` command and add arguments to it `gradlew run -PcoronaTracker="['--request','continents-asia']"`.

# Sources:
> https://disease.sh/

> https://github.com/cbeust/jcommander/

> http://commons.apache.org/proper/commons-lang/
