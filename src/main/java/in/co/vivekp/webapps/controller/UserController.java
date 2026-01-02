package in.co.vivekp.webapps.controller;

import in.co.vivekp.webapps.model.UserEntity;
import in.co.vivekp.webapps.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService service;

    @PostMapping("/register")
    public UserEntity register(@RequestBody UserEntity users){
    return service.registerUser(users);
    }

    @PostMapping("/login")
    public String login(@RequestBody UserEntity users){
        return service.verify(users);
    }
}
