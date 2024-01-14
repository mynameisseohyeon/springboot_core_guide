package com.example.springbootcoreguide.Controller;

import com.example.springbootcoreguide.DTO.MemberDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api/v1/get-api")
public class GetController {

    @RequestMapping("hello")
    public String hello() {
        return "Hello World";
    }



    //http://localhost:8081/api/v1/get-api/request2?key1=value1&key2=value2
    @GetMapping(value = "/request2")
    public String getRequestParam2(@RequestParam Map<String, String> param) {
        //매개변수 항복이 일정하지 않은 경우 Map 객체로 받는 것이 효율적
        StringBuilder sb = new StringBuilder();
        param.entrySet().forEach(map-> {
            sb.append(map.getKey() + " : " +map.getValue() + "\n");
        });

        return sb.toString();
    }



    //http://localhost:8081/api/v1/get-api/request3?name=value1&email=value2&organization=value3
    @GetMapping(value = "/request3")
    public String getRequestParam3(MemberDTO memberDTO) {
        return memberDTO.toString();
    }

}
