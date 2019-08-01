package cn.cwnu.client2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@RestController
public class OrderController {
    @Autowired
    private RestTemplate restTemplate;
    @GetMapping("/order")
    public String getOrder(){
        String memberUrl="http://client1/member";
        String result=restTemplate.getForObject(memberUrl,String.class);
        System.out.println("调用订单服务,result"+result);
        return result;
    }
    @GetMapping("/ordermap")
    public Map<String,Object> getOrderMap(){
        String memberUrl="http://client1/map";
        ResponseEntity<Map> responseEntity=restTemplate.getForEntity(memberUrl,Map.class);
        Map<String,Object>map=new HashMap<>();
        map=responseEntity.getBody();
        System.out.println("niubi:"+map.get("age"));
        map.put("aa","dsadsa");
        System.out.println(".........."+map);
        return map;
    }
}
