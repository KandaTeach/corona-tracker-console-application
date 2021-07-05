package com.corona.app.dao;

import static com.corona.app.endpoint.DataSourceApiEndpoint.*;
import static com.corona.app.endpoint.WorldometersEndpoints.*;

import com.corona.app.model.worldometers.*;

import org.springframework.stereotype.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.reactive.function.client.WebClient;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Repository
public class WorldometersDataAccess {

    @Autowired
    private WebClient.Builder webClientBuilder;

    private Logger logger = LoggerFactory.getLogger(WorldometersDataAccess.class);

    public CovidAll covidAllResponse() {
        logger.info(">> WorldometersDataAccess : world data responce");
        return webClientBuilder.build()
        .get()
        .uri(API_SOURCE_V3 + GET_COVID_ALL_V3)
        .retrieve()
        .bodyToMono(CovidAll.class)
        .block();
    }

    public CovidState covidStateResponse(String state) {
        logger.info(">> WorldometersDataAccess : state " + state + " data responce");
        return webClientBuilder.build()
        .get()
        .uri(API_SOURCE_V3 + GET_COVID_STATE_V3 + "/" + state)
        .retrieve()
        .bodyToMono(CovidState.class)
        .block();
    }

    public CovidCountry covidCountryResponse(String country) {
        logger.info(">> WorldometersDataAccess : country " + country + " data responce");
        return webClientBuilder.build()
        .get()
        .uri(API_SOURCE_V3 + GET_COVID_COUNTRY_V3 + "/" + country)
        .retrieve()
        .bodyToMono(CovidCountry.class)
        .block();
    }

    public CovidContinent covidContinentResponse(String continent) {
        logger.info(">> WorldometersDataAccess : continent " + continent + " data responce");
        return webClientBuilder.build()
        .get()
        .uri(API_SOURCE_V3 + GET_COVID_CONTINENT_V3 + "/" + continent)
        .retrieve()
        .bodyToMono(CovidContinent.class)
        .block();
    }
}