package com.example.episodicshows.user;

import org.springframework.web.bind.annotation.*;

/**
 * Created by thomas.fowler on 5/17/17.
 */
@RestController
@RequestMapping("/users")
public class UserController {

    private final UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @PostMapping({"", "/"})
    public User createUser(@RequestBody User user) {
        return this.userRepository.save(user);
    }

    @GetMapping
    public Iterable<User> getUsers() {
        return this.userRepository.findAll();
    }
}
