package com.example.spring_boot_project.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Log4j2
public class SampleJSONControlloer {
    @GetMapping("/helloArr")
    public String[] helloArr() {
        log.info("HelloArr...");

        return new String[] {"AAA", "BBB", "CCC"};
    }
}
