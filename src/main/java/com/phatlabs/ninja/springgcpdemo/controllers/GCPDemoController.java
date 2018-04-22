package com.phatlabs.ninja.springgcpdemo.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GCPDemoController {

    @RequestMapping
    public String index() {
        return "Running on GCP!";
    }
}
