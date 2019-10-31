package com.springrest.restsample.springrest;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/str-test")
public class SpringRestSample {

    @PostMapping("/save")
    public String getStr(String str){
        return "spring success";
    }
}
