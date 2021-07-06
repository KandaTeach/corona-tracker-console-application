package com.corona.app.controller;

import com.corona.app.service.ApplicationService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
@RequestMapping()
public class ApplicationController {

    @Autowired
    private ApplicationService applicationService;

    private Logger logger = LoggerFactory.getLogger(ApplicationController.class);

    @GetMapping()
    public String homeWelcomeMessage() {
        logger.info(">> Controller : /worldometers");
        return applicationService.seeDocs();
    }

}