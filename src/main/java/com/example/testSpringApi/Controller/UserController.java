package com.example.testSpringApi.Controller;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.mapping.Array;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.testSpringApi.Repository.UserRepository;
import com.example.testSpringApi.Table.User;

@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/save")
    public Object save(User user) {
        Object data = userRepository.save(user);
        return data;
    }

    @GetMapping("/listId")
    public Object listId(int id){
        var listId = userRepository.findById(id);
        return listId;
    }

    @GetMapping("/")
    public Object list() {
        var data = userRepository.findAll();
        return data;
    }

}
