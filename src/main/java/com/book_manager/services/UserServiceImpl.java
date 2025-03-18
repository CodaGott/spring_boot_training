package com.book_manager.services;

import com.book_manager.dto.request.UserDto;
import com.book_manager.model.User;
import com.book_manager.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;


    @Override
    public User createUser(UserDto userDto) {
        User user = new User();
//        Optional<User> emailExists = userRepository.findByEmail(userDto.getEmail());
//
//        if (emailExists.isPresent()) {
//            log.error("Email already exists");
//        }
        user.setName(userDto.getName());
        user.setEmail(userDto.getEmail());
        user.setPhoneNumber(userDto.getPhoneNumber());
        return userRepository.save(user);
    }

    @Override
    public User updateUser(UserDto userDto) {
        return null;
    }

    @Override
    public User getUserById(Long id) {
        return null;
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User getUserByEmail(String email) {
        return null;
    }

    @Override
    public void deleteUserById(Long id) {

    }
}
