package cn.cwnu.webchat.controller;


import cn.cwnu.webchat.pojo.Message;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class GreetingController {
    @MessageMapping("/hello")
    @SendTo("/topic/greetings")
    public Message greeting(Message message) throws  Exception{
        System.out.println(message);
        return message;
    }
}
