package br.com.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.api.DAO.IUser;
import br.com.api.model.User;

@RestController
public class UserController {

  @Autowired
  private IUser dao;

  @GetMapping("/usuarios")
  public List<User> getAllUsers() {
    return (List<User>) dao.findAll();
  }
}
