# CoronaTracker 
[![created by](https://img.shields.io/badge/created%20by-KandaTeach-blue.svg?longCache=true&style=flat-square)](https://github.com/KandaTeach) [![Release](https://img.shields.io/github/release/kandateach/corona-tracker-console-application.svg?style=flat-square)](https://github.com/kandateach/corona-tracker-console-application/releases) [![License](https://img.shields.io/github/license/KandaTeach/corona-tracker-console-application.svg?style=flat-square)](https://github.com/KandaTeach/corona-tracker-console-application/blob/master/LICENSE)

# Welcome to CoronaTracker
**CoronaTracker** CoronaTracker is an open-source Spring boot application for command-line interface use to track COVID-19 cases given by many license data sources in the whole world. It supports terminals for Linux, macOS, and cmd for windows.

# Usage
Install [curl](https://curl.se/) to run all these endpoints (*if your existing terminal does not recognize curl*)

## [Worldometers](https://www.worldometers.info/coronavirus/)
### World Data
```
curl -X GET https://coronatrackerconsole.herokuapp.com/worldometers/all
```

### Continent Data
```
curl -X GET https://coronatrackerconsole.herokuapp.com/worldometers/continent/asia
```

### Country Data
```
curl -X GET https://coronatrackerconsole.herokuapp.com/worldometers/country/philippines
```

### US State Data
```
curl -X GET https://coronatrackerconsole.herokuapp.com/worldometers/state/texas
```

# Installation
## With Apache Maven 
Install [Apache Maven](https://maven.apache.org/) CLI and [Java version 11](https://www.oracle.com/ph/java/technologies/javase-jdk11-downloads.html) before doing the local installation.

1. Fork and clone git repository.

2. Call directory file.

3. Install dependency to your classpath run this command `mvn clean install`.

4. Create jar file to run program in java 11 run this command `mvn clean package` this will create target folder.

5. In root project folder, find `/target/corona-tracker-console-application-0.0.1-SNAPSHOT.jar`.

6. Run using `java -jar .` command `java -jar ./target/corona-tracker-console-application-0.0.1-SNAPSHOT.jar`.

# Awesome-NovelCOVID [![Mentioned in Awesome-NovelCOVID](https://awesome.re/mentioned-badge-flat.svg)](https://github.com/disease-sh/awesome-novelcovid)
CoronaTracker was mentioned in Awesome-NovelCOVID check it [here](https://github.com/disease-sh/awesome-novelcovid).
# Issues
If you're facing problems, please let me know by [creating an issue](https://github.com/kandateach/corona-tracker-console-application/issues/new). Attach some screenshots or errors to make it easy to track bugs. Thank you, and wear a face mask!

# License
CoronaTracker is licensed under [GNU General Public License v3](https://opensource.org/licenses/GPL-3.0).

# Sources
> https://disease.sh

> https://github.com/disease-sh/awesome-novelcovid

> https://www.worldometers.info/coronavirus/
