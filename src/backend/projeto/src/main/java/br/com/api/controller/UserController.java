package br.com.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.api.DAO.IUser;
import br.com.api.model.User;

@RestController
@RequestMapping("/usuarios")
public class UserController {

  @Autowired
  private IUser dao;

  @GetMapping
  public List<User> getAllUsers() {
    return (List<User>) dao.findAll();
  }

  @PostMapping
  public User newUser(@RequestBody User usuario){
    User newUser = dao.save(usuario);
    return newUser;
  }
}
