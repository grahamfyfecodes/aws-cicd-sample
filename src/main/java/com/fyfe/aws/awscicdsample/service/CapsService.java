package com.fyfe.aws.awscicdsample.service;

import org.springframework.stereotype.Service;

@Service
public class CapsService {

    public String capitalise(String input) {
        return input.toUpperCase();
    }
}
