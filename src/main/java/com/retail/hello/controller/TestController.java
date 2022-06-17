package com.retail.hello.controller;

import com.retail.hello.vo.TestVo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class TestController {
//    @GetMapping(value = "/home")
//    public String home() {
//        return "index.html";
//    }
//
//    @ResponseBody
//    @GetMapping(value = "/valueTest")
//    public String valueTest() {
//        return "test string";
//    }

    @RequestMapping("/test")
    public ModelAndView test() throws Exception {
        System.out.println("아아");
        ModelAndView mav = new ModelAndView("test");
        mav.addObject("name", "권영각");

        List<String> testList = new ArrayList<String>();
        testList.add("A");
        testList.add("B");
        testList.add("C");

        mav.addObject("list", testList);

        return mav;
    }

    @RequestMapping("/thymeleafTest")
    public String thymeleafTest(Model model) {
        TestVo testModel = new TestVo("gak", "영각");
        model.addAttribute("testModel", testModel);
        return "thymeleaf/thymeleafTest";
    }
}
