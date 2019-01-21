package com.demo.jwt.SpringSecurity;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.demo.jwt.SpringSecurity.model.User;

@Repository
public interface UserRepository extends CrudRepository<User,Long> {

	User findByEmailIgnoreCase(String username);

}
