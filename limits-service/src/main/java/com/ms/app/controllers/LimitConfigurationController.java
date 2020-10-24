package com.ms.app.controllers;

import com.ms.app.configs.Configuration;
import com.ms.app.entities.LimitConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Elimane on Oct, 2020, at 14:05
 */

@RestController
public class LimitConfigurationController {

    @Autowired
    private Configuration config;

    @GetMapping("/limits")
    public LimitConfiguration retrieveLimitFromConfiguration(){
        return new LimitConfiguration(config.getMinimum(), config.getMaximum());
    }


}
