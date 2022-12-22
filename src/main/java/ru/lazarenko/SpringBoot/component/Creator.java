package ru.lazarenko.SpringBoot.component;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import ru.lazarenko.SpringBoot.model.Message;
import ru.lazarenko.SpringBoot.model.User;

@Component
public class Creator {
    @Value("${user.Name}")
    private String name;
    @Value("${user.age}")
    private Integer age;
    @Value("${user.profession}")
    private String profession;

    @Value("${message.content}")
    private String content;

    @Value("${message.dateTime}")
    private String dateTime;

    public User createUser(){
        User user = new User();
        user.setName(name);
        user.setAge(age);
        user.setProfession(profession);
        return user;
    }

    public Message createMessage(){
        Message message = new Message();
        message.setContent(content);
        message.setDateTime(dateTime);
        return message;
    }
}
