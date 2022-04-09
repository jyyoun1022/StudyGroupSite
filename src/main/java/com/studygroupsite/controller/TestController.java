package com.studygroupsite.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Log4j2
@RestController
@RequestMapping("/test")
public class TestController {
    @GetMapping(value="")
    public String test() {
        log.info("test");
        return "TEST COMPLETE";
    }
}
