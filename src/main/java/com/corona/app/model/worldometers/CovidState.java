package com.corona.app.model.worldometers;

import java.text.NumberFormat;

public class CovidState {

    private String state;
    private Long updated;
    private Long cases;
    private Long todayCases;
    private Long deaths;
    private Long todayDeaths;
    private Long recovered;
    private Long active;
    private Long casesPerOneMillion;
    private Double deathsPerOneMillion;
    private Long tests;
    private Double testsPerOneMillion;
    private Long population;

    public CovidState() {
        super();
    }

    public CovidState(String state,
                    Long updated,
                    Long cases,
                    Long todayCases,
                    Long deaths,
                    Long todayDeaths,
                    Long recovered,
                    Long active,
                    Long casesPerOneMillion,
                    Double deathsPerOneMillion,
                    Long tests,
                    Double testsPerOneMillion,
                    Long population) {
        this.state = state;
        this.updated = updated;
        this.cases = cases;
        this.todayCases = todayCases;
        this.deaths = deaths;
        this.todayDeaths = todayDeaths;
        this.recovered = recovered;
        this.active = active;
        this.casesPerOneMillion = casesPerOneMillion;
        this.deathsPerOneMillion = deathsPerOneMillion;
        this.tests = tests;
        this.testsPerOneMillion = testsPerOneMillion;
        this.population = population;
    }

    public String getState() {
        return state;
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

    public Long getActive() {
        return active;
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

    @Override
    public String toString() {

        NumberFormat myFormat = NumberFormat.getInstance();

        return "========================================================\n"
        + "\t\t " + state.toUpperCase() + " COUNT " +"\n" 
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
        + "========================================================\n\n"
        + "Active\t: " + myFormat.format(active) + "\n"
        + "========================================================\n\n"
        + "========================================================\n\n"
        + "Tests\t: " + myFormat.format(tests) + "\n"
        + "Tests Per One Million\t: " + myFormat.format(testsPerOneMillion) + "\n"
        + "========================================================\n\n"
        + "Population\t: " + myFormat.format(population) + "\n"
        + "========================================================\n"
        + "DATA SOURCE : Worldometers (https://www.worldometers.info/coronavirus)";
    }
    
}
