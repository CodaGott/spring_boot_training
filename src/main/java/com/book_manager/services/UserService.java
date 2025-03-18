package com.book_manager.services;

import com.book_manager.dto.request.UserDto;
import com.book_manager.model.User;

import java.util.List;

public interface UserService {
    User createUser(UserDto userDto);
    User updateUser(UserDto userDto);
    User getUserById(Long id);
    List<User> getAllUsers();
    User getUserByEmail(String email);
    void deleteUserById(Long id);
}
