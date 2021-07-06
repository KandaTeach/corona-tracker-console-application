package com.corona.app.controller;

import com.corona.app.service.WorldometersService;
import com.corona.app.service.ApplicationService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
@RequestMapping("/worldometers")
public class WorldometersController {

    @Autowired
    private WorldometersService worldometersService;

    @Autowired
    private ApplicationService applicationService;

    private Logger logger = LoggerFactory.getLogger(WorldometersController.class);

    @GetMapping()
    public String welcomeMessage() {
        logger.info(">> Controller : /worldometers");
        return applicationService.seeDocs();
    }

    @GetMapping("/all")
    public String getCovidAll() {
        logger.info(">> Controller : /worldometers/all");
        return worldometersService.getCovidAll().toString();
    }

    @GetMapping("/state/{state}")
    public String getCovidState(@PathVariable("state") String state) {
        logger.info(">> Controller : /worldometers/state " + "/" + state);
        return worldometersService.getCovidState(state).toString();
    }

    @GetMapping("/country/{country}")
    public String getCovidCountry(@PathVariable("country") String country) {
        logger.info(">> Controller : /worldometers/country " + "/" + country);
        return worldometersService.getCovidCountry(country).toString();
    }

    @GetMapping("/continent/{continent}")
    public String getCovidContinent(@PathVariable("continent") String continent) {
        logger.info(">> Controller : /worldometers/continent " + "/" + continent);
        return worldometersService.getCovidContinent(continent).toString();
    }

}