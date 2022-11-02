package com.vladislavskiy.TaskProject.service.impl;

import com.vladislavskiy.TaskProject.dto.UserDTO;
import com.vladislavskiy.TaskProject.model.User;
import com.vladislavskiy.TaskProject.repository.UserRepository;
import com.vladislavskiy.TaskProject.service.UserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.Calendar;

@Service
@Transactional
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepository;

    @Override
    public void createUser(User user) {
        System.out.println(user.getId());
        userRepository.save(user);
    }
    @Override
    public int getUserAge(User user) {
        LocalDate localDate = LocalDate.now();

        UserDTO userDTO = new UserDTO();
        BeanUtils.copyProperties(user, userDTO);
        if(user.getDate().get(Calendar.MONTH) > localDate.getMonthValue() ||
                (user.getDate().get(Calendar.MONTH) + 1) == localDate.getMonthValue() &&
                        user.getDate().get(Calendar.DAY_OF_MONTH) > localDate.getDayOfMonth()) {
            return localDate.getYear() - user.getDate().get((Calendar.YEAR)) - 1;
        }
        else
            return localDate.getYear() - user.getDate().get((Calendar.YEAR));
    }

    @Override
    public UserDTO getUserDTO(int id) {
        LocalDate localDate = LocalDate.now();
        User user = userRepository.findById(id).get();
        UserDTO userDTO = new UserDTO();
        BeanUtils.copyProperties(user, userDTO);
        userDTO.setAge(getUserAge(user));
        return userDTO;
    }
}
