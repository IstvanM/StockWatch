package com.imeszaros.stockwatch.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by istvan-home on 7/9/16.
 */
@RestController
public class HelloController {

    public HelloController() {
    }

    @RequestMapping("/")
    public String getHelloText(String userName) {
        return "Hello " + userName;
    }
}
