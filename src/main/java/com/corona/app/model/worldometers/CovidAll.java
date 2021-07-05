package com.corona.app.model.worldometers;

import java.text.NumberFormat;

public class CovidAll {

    private Long updated;
    private Long cases;
    private Long todayCases;
    private Long deaths;
    private Long todayDeaths;
    private Long recovered;
    private Long todayRecovered;
    private Long active;
    private Long critical;
    private Long casesPerOneMillion;
    private Double deathsPerOneMillion;
    private Long tests;
    private Double testsPerOneMillion;
    private Long population;
    private Long oneCasePerPeople;
    private Long oneDeathPerPeople;
    private Long oneTestPerPeople;
    private Long undefined;
    private Double activePerOneMillion;
    private Double recoveredPerOneMillion;
    private Double criticalPerOneMillion;
    private Long affectedCountries;

    public CovidAll() {
        super();
    }

    public CovidAll (Long updated,
                    Long cases,
                    Long todayCases,
                    Long deaths,
                    Long todayDeaths,
                    Long recovered,
                    Long todayRecovered,
                    Long active,
                    Long critical,
                    Long casesPerOneMillion,
                    Double deathsPerOneMillion,
                    Long tests,
                    Double testsPerOneMillion,
                    Long population,
                    Long oneCasePerPeople,
                    Long oneDeathPerPeople,
                    Long oneTestPerPeople,
                    Long undefined,
                    Double activePerOneMillion,
                    Double recoveredPerOneMillion,
                    Double criticalPerOneMillion,
                    Long affectedCountries) {
        this.updated = updated;
        this.cases = cases;
        this.todayCases = todayCases;
        this.deaths = deaths;
        this.todayDeaths = todayDeaths;
        this.recovered = recovered;
        this.todayRecovered = todayRecovered;
        this.active = active;
        this.critical = critical;
        this.casesPerOneMillion = casesPerOneMillion;
        this.deathsPerOneMillion = deathsPerOneMillion;
        this.tests = tests;
        this.testsPerOneMillion = testsPerOneMillion;
        this.population = population;
        this.oneCasePerPeople = oneCasePerPeople;
        this.oneDeathPerPeople = oneDeathPerPeople;
        this.oneTestPerPeople = oneTestPerPeople;
        this.undefined = undefined;
        this.activePerOneMillion = activePerOneMillion;
        this.recoveredPerOneMillion = recoveredPerOneMillion;
        this.criticalPerOneMillion = criticalPerOneMillion;
        this.affectedCountries = affectedCountries;
    }

    public Long getUpdated() {
        return updated;
    }

    public Long getCases() {
        return cases;
    }

    public Long getTodayCases() {
        return todayCases;
    }

    public Long getDeaths() {
        return deaths;
    }

    public Long getTodayDeaths() {
        return todayDeaths;
    }

    public Long getRecovered() {
        return recovered;
    }

    public Long getTodayRecovered() {
        return todayRecovered;
    }

    public Long getActive() {
        return active;
    }

    public Long getCritical() {
        return critical;
    }

    public Long getCasesPerOneMillion() {
        return casesPerOneMillion;
    }

    public Double getDeathsPerOneMillion() {
        return deathsPerOneMillion;
    }

    public Long getTests() {
        return tests;
    }

    public Double getTestsPerOneMillion() {
        return testsPerOneMillion;
    }

    public Long getPopulation() {
        return population;
    }

    public Long getOneCasePerPeople() {
        return oneCasePerPeople;
    }

    public Long getOneDeathPerPeople() {
        return oneDeathPerPeople;
    }

    public Long getOneTestPerPeople() {
        return oneTestPerPeople;
    }

    public Long getUndefined() {
        return undefined;
    }

    public Double getActivePerOneMillion() {
        return activePerOneMillion;
    }

    public Double getRecoveredPerOneMillion() {
        return recoveredPerOneMillion;
    }

    public Double getCriticalPerOneMillion() {
        return criticalPerOneMillion;
    }

    public Long getAffectedCountries() {
        return affectedCountries;
    }

    @Override
    public String toString() {

        NumberFormat myFormat = NumberFormat.getInstance();

        return "========================================================\n"
        + "\t\tWORLD COUNT \n"
        + "========================================================\n\n"
        + "Cases\t: " + myFormat.format(cases) + "\n"
        + "Today Cases\t: " + myFormat.format(todayCases) + "\n"
        + "Cases Per One Million\t: " + myFormat.format(casesPerOneMillion) + "\n"
        + "One Case Per People\t: " + myFormat.format(oneCasePerPeople) + "\n"
        + "========================================================\n\n"
        + "Deaths\t: " + myFormat.format(deaths) + "\n"
        + "Today Deaths\t: " + myFormat.format(todayDeaths) + "\n"
        + "Deaths Per One Million\t: " + myFormat.format(deathsPerOneMillion) + "\n"
        + "One Death Per People\t: " + myFormat.format(oneDeathPerPeople) + "\n"
        + "========================================================\n\n"
        + "Recovered\t: " + myFormat.format(recovered) + "\n"
        + "Today Recovered\t: " + myFormat.format(todayRecovered) + "\n"
        + "Recovered Per One Million\t: " + myFormat.format(recoveredPerOneMillion) + "\n"
        + "========================================================\n\n"
        + "Active\t: " + myFormat.format(active) + "\n"
        + "Active Per One Million\t: " + myFormat.format(activePerOneMillion) + "\n"
        + "========================================================\n\n"
        + "Critical\t: " + myFormat.format(critical) + "\n"
        + "Critical Per One Million\t: " + myFormat.format(criticalPerOneMillion) + "\n"
        + "========================================================\n\n"
        + "Tests\t: " + myFormat.format(tests) + "\n"
        + "Tests Per One Million\t: " + myFormat.format(testsPerOneMillion) + "\n"
        + "One Test Per People\t: " + myFormat.format(oneTestPerPeople) + "\n"
        + "========================================================\n\n"
        + "Population\t: " + myFormat.format(population) + "\n"
        + "========================================================\n\n"
        + "Affected Countries\t: " + myFormat.format(affectedCountries) + "\n"
        + "========================================================\n"
        + "DATA SOURCE : Worldometers (https://www.worldometers.info/coronavirus)";
    }
}
