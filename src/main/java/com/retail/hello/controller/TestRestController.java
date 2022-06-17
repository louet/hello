package com.retail.hello.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TestRestController {
    @RequestMapping(value = "testValue", method = RequestMethod.GET)
    public String getTestValue() {
        return "rest controller test";
    }

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public ModelAndView test() throws Exception {
        ModelAndView mav = new ModelAndView("test");
        mav.addObject("name", "권영각");

        List<String> testList = new ArrayList<String>();
        testList.add("A");
        testList.add("B");
        testList.add("C");

        mav.addObject("list", testList);

        return mav;
    }
}
