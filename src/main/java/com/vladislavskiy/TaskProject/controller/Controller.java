package com.vladislavskiy.TaskProject.controller;

import com.vladislavskiy.TaskProject.dto.UserDTO;
import com.vladislavskiy.TaskProject.model.User;
import com.vladislavskiy.TaskProject.repository.UserRepository;
import com.vladislavskiy.TaskProject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController()
@RequestMapping("/api")
public class Controller {
    @Autowired
    private UserService userService;
    @GetMapping("/user/{id}")
    public UserDTO getUserById(@PathVariable int id)
    {
        System.out.println("hello");
        System.out.println(userService.getUserDTO(id));
        return userService.getUserDTO(id);
    }
    @PostMapping("/user")
    public void createUser(@RequestBody User user)
    {
        userService.createUser(user);
    }
}
