package br.com.criandoapi.projeto.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

    @DeleteMapping("/{id}")
    public Optional<User> deleteUser(@PathVariable Integer id) {
        Optional<User> user = dao.findById(id);
        dao.deleteById(id);
        return user;
    }
}