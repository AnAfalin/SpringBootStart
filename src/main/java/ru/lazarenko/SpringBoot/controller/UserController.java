package ru.lazarenko.SpringBoot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ru.lazarenko.SpringBoot.model.User;

import java.util.List;

@Controller
public class UserController {
    private List<User> users = List.of(
            new User("Anastasia", 28, "programmer"),
            new User("Irina", 42, "accountant"),
            new User("Nikolai", 32, "frontend developer"),
            new User("Slava", 40, "director"),
            new User("Dmitriy", 40, "english tutor"),
            new User("Irina", 49, "mathematician"),
            new User("Matvey", 25, "programmer"),
            new User("Igor", 42, "frontend developer")
    );

    @GetMapping("/users")
    private String getPageAllUsers(Model model){
        model.addAttribute("users", users);
        return "page-users";

    }


}
