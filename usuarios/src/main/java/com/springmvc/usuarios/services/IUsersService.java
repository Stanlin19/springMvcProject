package com.springmvc.usuarios.services;

import com.springmvc.usuarios.models.Users;
import com.springmvc.usuarios.repositories.IUsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface IUsersService {

    Optional<Users> fingByID(Long id);
    List<Users> getUsers();
    String saveUser(Users user);
    Users getUserByUserName(String userName);
}
