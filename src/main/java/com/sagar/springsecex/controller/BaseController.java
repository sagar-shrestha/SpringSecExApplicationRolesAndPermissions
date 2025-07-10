package com.sagar.springsecex.controller;

import com.sagar.springsecex.entity.Student;
import com.sagar.springsecex.security.entity.Audit;
import com.sagar.springsecex.service.UsersService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class BaseController {

    private final UsersService usersService;
    private final BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder(12);

    @GetMapping("/hello")
    public String index() {
        return "Hello World";
    }

    @GetMapping("getUser")
    public Object getUser() {
        return Student.builder()
                .id(1)
                .name("Sagar")
                .marks("50")
                .build();
    }

    @PostMapping("/saveUsers")
    public Audit saveUsers(@RequestBody Audit users) {
        users.setPassword(bCryptPasswordEncoder.encode(users.getPassword()));
        return usersService.saveUsers(users);
    }

    @PostMapping("/login")
    public String login(@RequestBody Audit users) {

        System.out.println(users.toString());
//        return "success";
        return usersService.verify(users);

    }

}
