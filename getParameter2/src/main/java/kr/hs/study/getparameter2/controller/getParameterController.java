package kr.hs.study.getparameter2.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.WebRequest;

@Controller
public @ResponseBody class getParameterController {
    @PostMapping("/test1")
    @ResponseBody
    public String login(
            @RequestParam String uid,
            @RequestParam String upass) {

        return "아이디: " + uid + "<br>비밀번호: " + upass;
    }
}
