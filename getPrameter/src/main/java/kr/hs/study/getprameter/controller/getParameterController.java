package kr.hs.study.getprameter.controller;

import jakarta.servlet.http.HttpServletRequest;
import kr.hs.study.getprameter.dto.getParameterDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.WebRequest;

@Controller
public @ResponseBody class getParameterController {     //ResponseBody : return 뒤에 있는 애를 그냥 문자열로 출력
    @GetMapping("/test1")
    public String test1(HttpServletRequest req){
        String data1=req.getParameter("data1");
        String data2=req.getParameter("data2");
        String [] data3=req.getParameterValues("data3");

        for(String value:data3){    //배열인 data3에 있는 원소 한 개씩을 가져와서 value에 자동으로 대입한다
            System.out.println("data3 : " + value);
        }

        System.out.println("data1" + req.getParameter("data1"));
        System.out.println("data2" + req.getParameter("data2"));
        System.out.println("data3" + req.getParameter("data3"));
        return "result";
    }

    @GetMapping("/test2")
    public String test2(WebRequest req){

        String data1 = req.getParameter("data1");
        String data2 = req.getParameter("data2");
        String[] data3 = req.getParameterValues("data3");
        String data4 = req.getParameter("data4");

        for(String value : data3){
            System.out.println("data3 : " + value);
        }

        System.out.println("data1 : " + data1);
        System.out.println("data2 : " + data2);
        System.out.println("data4 : " + data4);

        return "result";
    }

    @PostMapping("re_test3")
    public String re_test3(@RequestParam("val1") int val1,
                           @RequestParam("val2") int val2){
        System.out.println("val1" + val1);
        System.out.println("val2" + val2);
        return "@requestParam";
    }

    @GetMapping("/test5/{data1}/{data2}/{data3}")
    public String test5(@PathVariable("data1") int data1,
                        @PathVariable("data1") int data2,
                        @PathVariable("data1") int data3){
        System.out.println(data1 + data2 + data3);
        return "PathVariable";
    }

    @PostMapping("/test6")
    public String test6(@ModelAttribute getParameterDTO dto){
        System.out.println("id : " +dto.getUid());
        System.out.println("pass : " +dto.getUpass());

        return "@ModelAttribute";
    }

}
