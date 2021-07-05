package com.corona.app.controller;

import com.corona.app.service.WorldometersService;

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

    private Logger logger = LoggerFactory.getLogger(WorldometersController.class);

    @GetMapping("/all")
    public String getCovidAll() {
        logger.info(">> Controller : /all");
        return worldometersService.getCovidAll().toString();
    }

    @GetMapping("/state/{state}")
    public String getCovidState(@PathVariable("state") String state) {
        logger.info(">> Controller : /state " + "/" + state);
        return worldometersService.getCovidState(state).toString();
    }

    @GetMapping("/country/{country}")
    public String getCovidCountry(@PathVariable("country") String country) {
        logger.info(">> Controller : /country " + "/" + country);
        return worldometersService.getCovidCountry(country).toString();
    }

    @GetMapping("/continent/{continent}")
    public String getCovidContinent(@PathVariable("continent") String continent) {
        logger.info(">> Controller : /continent " + "/" + continent);
        return worldometersService.getCovidContinent(continent).toString();
    }

}