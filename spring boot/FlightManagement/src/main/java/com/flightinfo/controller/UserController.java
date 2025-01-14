package com.flightinfo.controller;

import com.flightinfo.entity.User;
import com.flightinfo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/user/")
public class UserController {

    @Autowired
    private UserService  userService;

    @GetMapping("/getAllUser")
    public List<User> getAllUser()
    {

        return userService.getAllUser();

    }
    @GetMapping("/getUserById/{id}")
    public Optional<User> getProductById(@PathVariable Integer id)
    {

        return Optional.ofNullable(userService.getUserById(id).orElseThrow());

    }
    //create new record
    @PostMapping("/adduser")
    public User saveProduct(@RequestBody User user)
    {

        return userService.createUser(user);

    }
    //update record in existing
    //if we use post then new record created by updating the old one
    @PutMapping("/updateUser/{id}")
    public User updateProduct(@PathVariable Integer id,@RequestBody User user)
    {

        User user1 = userService.getUserById(id).orElseThrow();
        user1.setFirstName(user.getFirstName());
        user1.setLastName(user.getLastName());
        user1.setAge(user.getAge());
        user1.setEmail(user.getEmail());
        user1.setMobileNumber(user.getMobileNumber());
        return userService.updateUser(id, user1);

    }

    @DeleteMapping("/deleteById/{id}")
    public void deleteById(@PathVariable Integer id)
    {

        userService.deleteUserById(id);

    }
}
