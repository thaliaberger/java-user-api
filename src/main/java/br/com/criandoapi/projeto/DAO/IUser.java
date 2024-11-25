package br.com.criandoapi.projeto.DAO;

import org.springframework.data.repository.CrudRepository;

import br.com.criandoapi.projeto.model.User;

public interface IUser extends CrudRepository<User, Integer>{

}
