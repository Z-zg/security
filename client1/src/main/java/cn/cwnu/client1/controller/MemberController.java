package cn.cwnu.client1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class MemberController {
    @GetMapping("/member")
    public String getMember(){
        return "this is member";
    }
    @GetMapping("/map")
    public Map<Object,Object> getMap(){
        Map<Object,Object> map=new HashMap<>();
        map.put("age",23);
        map.put("birth","1992-07-28");
        return map;
    }
}
