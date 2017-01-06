package com.example;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRest
{
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String sampleOuput()
    {
        return "Hello World!!! hi!!! theere!!!! 0909 20170105-2";
    }
}
