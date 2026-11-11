package com.korai.springbootstudy.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class StudyController01 {

    @Value("${user.dir}")
    private String projectDir;

    //ResponseBody Body는 데이더를 의미한다.
    @GetMapping("/api/get01")
    public String get01() {
        return "/index.html"; //ResponseBody가 붙으면 리턴의 값은 실제 데이터 값이 된다.
    }

    @GetMapping("/api/get02")
    public String get02() {
        System.out.println(projectDir + "/src/main/resources/upload");
        String uploadPath = projectDir + "/src/main/resources/upload";
        return "/file:///" + uploadPath + "/94dc5a2f83cd5.jpg";
    }

    @ResponseBody
    @GetMapping
    public String get03(){
        return "데이터 응답!!";
    }
}
