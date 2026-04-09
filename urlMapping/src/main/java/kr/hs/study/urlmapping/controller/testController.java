package kr.hs.study.urlmapping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class testController {

    @GetMapping("/table")
    public String table() {
        return "table";
    }

    @PostMapping("/table_result")
    public String table_result() {
        return "table_result";
    }
}