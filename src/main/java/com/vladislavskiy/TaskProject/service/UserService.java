package com.vladislavskiy.TaskProject.service;

import com.vladislavskiy.TaskProject.dto.UserDTO;
import com.vladislavskiy.TaskProject.model.User;
import org.springframework.stereotype.Service;

public interface UserService {
    void createUser(User user);
    UserDTO getUserDTO(int id);
    int getUserAge(User user);
}
