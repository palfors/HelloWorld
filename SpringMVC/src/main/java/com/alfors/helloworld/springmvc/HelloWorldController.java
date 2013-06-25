package com.alfors.helloworld.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.ModelAndView;

import java.lang.System;

/**
 * Created with IntelliJ IDEA.
 * User: tkmal32
 * Date: 3/7/13
 * Time: 10:42 PM
 * To change this template use File | Settings | File Templates.
 */
@Controller
public class HelloWorldController {

//    @RequestMapping(value = "/helloWorld")
//    public String printHelloWorld(Model model) {
//        System.out.println("HelloWorldController: printHelloWorld() entry");
//
//        model.addAttribute("message", "Hello World!");
//
//        return "helloWorld";
//    }

    @RequestMapping(value = "/hello2")
    public String printHelloWorld(Exception e) {
        System.out.println("HelloWorldController: printHelloWorld() entry");

        return "helloWorld";
    }

}
