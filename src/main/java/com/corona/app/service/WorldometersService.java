package com.corona.app.service;

import com.corona.app.model.worldometers.*;
import com.corona.app.dao.WorldometersDataAccess;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Service
public class WorldometersService {

    @Autowired
    private WorldometersDataAccess worldometersDataAccess;

    private Logger logger = LoggerFactory.getLogger(WorldometersService.class);

    public CovidAll getCovidAll() {
        logger.info(">> WorldometersService : get world data from repository");
        return worldometersDataAccess.covidAllResponse();
    }

    public CovidState getCovidState(String state) {
        logger.info(">> WorldometersService : get state " + state + " data from repository");
        return worldometersDataAccess.covidStateResponse(state);   
    }

    public CovidCountry getCovidCountry(String country) {
        logger.info(">> WorldometersService : get country " + country + " data from repository");
        return worldometersDataAccess.covidCountryResponse(country);
    }

    public CovidContinent getCovidContinent(String continent) {
        logger.info(">> WorldometersService : get continent " + continent + " data from repository");
        return worldometersDataAccess.covidContinentResponse(continent);
    }

}
