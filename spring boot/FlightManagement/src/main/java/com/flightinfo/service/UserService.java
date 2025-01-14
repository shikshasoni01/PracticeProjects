package com.flightinfo.service;

import com.flightinfo.entity.User;
import com.flightinfo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUser()
    {
        return userRepository.findAll();
    }
    public Optional<User> getUserById(int id)
    {
        return userRepository.findById(id);
    }

    public User createUser(User user)
    {
        return userRepository.save(user);
    }

    public User updateUser(int id ,User user)
    {
        return userRepository.save(user);
    }


    public void deleteUserById( int id)
    {
        userRepository.deleteById(id);
    }

}
