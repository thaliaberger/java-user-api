package br.com.criandoapi.projeto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.criandoapi.projeto.DAO.IUser;
import br.com.criandoapi.projeto.model.User;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private IUser dao;
    
    @GetMapping
    public List<User> userList() {
        return (List<User>) dao.findAll();
    }

    @PostMapping
    public User createUser(@RequestBody User user) {
        User newUser = dao.save(user);
        return newUser;
    }

    @PutMapping
    public User updateUser(@RequestBody User user) {
        User updatedUser = dao.save(user);
        return updatedUser;
    }

}