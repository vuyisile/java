package com.app;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@RestController
public class UserLogInsController {

    private ArrayList<UserLogIn> users = new ArrayList<>();

    @RequestMapping(value = "/users/online", method = RequestMethod.GET)
    public List<UserLogIn> users() {
        return users;
    }

    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public UserLogIn user(@RequestParam(value = "email") String email) {
        Optional<UserLogIn> userFound = users
                .stream()
                .filter(user -> user.getEmail().toLowerCase().equals(email.toLowerCase())).findFirst();

        return userFound.orElse(null);
    }

    @PostMapping("/user")
    public void user(@RequestBody UserLogIn user) {
        System.out.println(user.getPassword());
        users.add(user);
    }
}