package com.corona.app.service;

import org.springframework.stereotype.Service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Service
public class ApplicationService {

    private Logger logger = LoggerFactory.getLogger(ApplicationService.class);

    public String seeDocs() {
        logger.info(">> ApplicationService : welcome message");
        return "Welcome to CoronaTracker Please visit: https://github.com/KandaTeach/corona-tracker-console-application";
    }

}