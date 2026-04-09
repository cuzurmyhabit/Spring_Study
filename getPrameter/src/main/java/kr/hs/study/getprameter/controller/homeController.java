package kr.hs.study.getprameter.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class homeController {

    // 메인 페이지
    @GetMapping("/")
    public String home() {
        return "index";
    }
}