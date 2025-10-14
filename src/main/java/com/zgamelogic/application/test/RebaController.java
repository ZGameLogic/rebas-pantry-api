package com.zgamelogic.application.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("reba")
public class RebaController {
    @GetMapping
    public String reba(){
        return "Dear lord I love her butt";
    }
}
