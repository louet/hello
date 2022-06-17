package com.retail.hello.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {
    @GetMapping(value = "/home")
    public String home() {
        return "index.html";
    }

    @ResponseBody
    @GetMapping(value = "/valueTest")
    public String valueTest() {
        return "test string";
    }
}
