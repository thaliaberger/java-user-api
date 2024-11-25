package br.com.criandoapi.projeto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.criandoapi.projeto.DAO.IUser;
import br.com.criandoapi.projeto.model.User;

@RestController
public class UserController {

    @Autowired
    private IUser dao;
    
    @GetMapping("/users")
    public List<User> userList() {
        return (List<User>) dao.findAll();
    }
}