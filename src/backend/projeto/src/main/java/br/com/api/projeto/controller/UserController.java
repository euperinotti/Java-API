package br.com.api.projeto.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
  @GetMapping("/usuarios")

  public String text () {
    return "Endpoint usuarios";
  }
}