package com.corona.app.model.worldometers;

import java.text.NumberFormat;

public class CovidContinent {

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
    private String continent;
    private Double activePerOneMillion;
    private Double recoveredPerOneMillion;
    private Double criticalPerOneMillion;

    public CovidContinent() {
        super();
    }

    public CovidContinent(Long updated,
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
                    String continent,
                    Double activePerOneMillion,
                    Double recoveredPerOneMillion,
                    Double criticalPerOneMillion) {
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
        this.continent = continent;
        this.activePerOneMillion = activePerOneMillion;
        this.recoveredPerOneMillion = recoveredPerOneMillion;
        this.criticalPerOneMillion = criticalPerOneMillion;
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

    public String getContinent() {
        return continent;
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
    
    @Override
    public String toString() {

        NumberFormat myFormat = NumberFormat.getInstance();

        return "========================================================\n"
        + "\t\t " + continent.toUpperCase() + " COUNT " +"\n" 
        + "========================================================\n\n"
        + "Cases\t: " + myFormat.format(cases) + "\n"
        + "Today Cases\t: " + myFormat.format(todayCases) + "\n"
        + "Cases Per One Million\t: " + myFormat.format(casesPerOneMillion) + "\n"
        + "========================================================\n\n"
        + "Deaths\t: " + myFormat.format(deaths) + "\n"
        + "Today Deaths\t: " + myFormat.format(todayDeaths) + "\n"
        + "Deaths Per One Million\t: " + myFormat.format(deathsPerOneMillion) + "\n"
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
        + "========================================================\n\n"
        + "Population\t: " + myFormat.format(population) + "\n"
        + "========================================================\n"
        + "DATA SOURCE : Worldometers (https://www.worldometers.info/coronavirus)";
    }
    
}
