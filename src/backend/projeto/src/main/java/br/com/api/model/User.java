package br.com.api.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "usuario")
public class User {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "idusuario")
  private Integer idusuario;

  @Column(name = "nome", length = 200, nullable = true)
  private String nome;

  @Column(name = "sobrenome", length = 200, nullable = true)
  private String sobrenome;

  @Column(name = "email", length = 200, nullable = true)
  private String email;

  @Column(name = "senha", length = 200, nullable = true)
  private String senha;

  @Column(name = "telefone", length = 200, nullable = true)
  private String telefone;


  public Integer getIdusuario() {
    return this.idusuario;
  }

  public void setIdusuario(Integer idusuario) {
    this.idusuario = idusuario;
  }

  public String getNome() {
    return this.nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getSobrenome() {
    return this.sobrenome;
  }

  public void setSobrenome(String sobrenome) {
    this.sobrenome = sobrenome;
  }

  public String getEmail() {
    return this.email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getSenha() {
    return this.senha;
  }

  public void setSenha(String senha) {
    this.senha = senha;
  }

  public String getTelefone() {
    return this.telefone;
  }

  public void setTelefone(String telefone) {
    this.telefone = telefone;
  }
}
