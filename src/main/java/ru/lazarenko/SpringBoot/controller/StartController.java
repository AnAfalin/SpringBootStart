package ru.lazarenko.SpringBoot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import ru.lazarenko.SpringBoot.component.Creator;

@Controller
public class StartController {
    private Creator creator;

    @Value("${welcome.message}")
    private String startMessage;

    @Autowired
    public StartController(Creator creator) {
        this.creator = creator;
    }

    @ResponseBody
    @GetMapping("/hello")
    public String getStartMessage(){
        return startMessage;
    }

    @ResponseBody
    @GetMapping("/user")
    public String getPageWithUser(){
        return creator.createUser().toString();
    }

    @ResponseBody
    @GetMapping("/message")
    public String getPageWithMessage(){
        return creator.createMessage().toString();
    }
}
