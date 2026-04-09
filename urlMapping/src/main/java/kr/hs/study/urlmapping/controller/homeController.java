package kr.hs.study.urlmapping.controller;

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

    // test1 페이지
    @GetMapping("/test1")
    public String test1() {
        return "test1";
    }

    // 로그인 페이지 (GET)
    @GetMapping("/login")
    public String login() {
        return "login";
    }

    // 로그인 처리 (POST)
    @PostMapping("/login")
    public String login_result() {
        return "login_result";
    }
}