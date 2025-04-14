package com.jayant.store.contoller;

import com.jayant.store.model.User;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/users")
public class UserController {

    private final Map<Long, User> userRepo = new HashMap<>();

    public UserController(){
        User user1 = new User();
        user1.setId(1L);
        user1.setName("Alice");
        user1.setEmail("alice@example.com");
        userRepo.put(user1.getId(), user1);
    }

    @GetMapping("/{id}")
    public User getUserById(@PathVariable Long id) {
        return userRepo.get(id);
    }

    @GetMapping
    public Collection<User> getAllUsers() {
        return userRepo.values();
    }

    @PostMapping
    public User createUser(@RequestBody User user) {
        userRepo.put(user.getId(), user);
        return user;
    }
}
