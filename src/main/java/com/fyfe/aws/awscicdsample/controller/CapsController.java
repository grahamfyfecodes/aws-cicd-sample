package com.fyfe.aws.awscicdsample.controller;

import com.fyfe.aws.awscicdsample.service.CapsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/caps")
public class CapsController {

    private static final Logger LOGGER = LoggerFactory.getLogger(CapsController.class);

    private final CapsService capsService;

    public CapsController(CapsService capsService) {
        this.capsService = capsService;
    }

    @GetMapping(value = "/{word}")
    public String capitalise(@PathVariable("word") String word) {
        LOGGER.info("Received request to capitalise: " + word);
        return capsService.capitalise(word);
    }
}
