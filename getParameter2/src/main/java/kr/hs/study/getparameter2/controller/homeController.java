package kr.hs.study.getparameter2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class homeController {

    // 메인 페이지
    @GetMapping("/")
    public String home() {
        return "index";
    }
}