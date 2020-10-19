package com.mateusz.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

@Controller
public class KoronaController {

    @GetMapping(value = "/status")
    public ResponseEntity<String> checkStatus() {

        final String uri = "http://korona:8080/korona-1.0-SNAPSHOT/korona/v1/infection";
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForEntity(uri, String.class);
    }
}
