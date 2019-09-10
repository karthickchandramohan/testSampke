package com.example.karthick.sampleRest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/rest/hello")
public class Hello {

    @GetMapping
    public String getHello() {
        String st = "emp";

        int i;
        i = 2;
              return "Hello World";
    }
}