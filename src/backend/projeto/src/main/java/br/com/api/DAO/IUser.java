package br.com.api.DAO;

import org.springframework.data.repository.CrudRepository;

import br.com.api.model.User;

public interface IUser extends CrudRepository<User, Integer> {
  
}
