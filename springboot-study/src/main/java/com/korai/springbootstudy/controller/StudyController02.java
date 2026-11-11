package com.korai.springbootstudy.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //RestController를 사용하면 @ResponseBody를 안 붙여도 된다.
public class StudyController02 {

    @GetMapping("/api/study02/get01")
    public String get01(){
        return "응답!!!";
    }

    @GetMapping("/api/study02/post01")
    public String post01(){
        return "post응답!!!";
    }
}
