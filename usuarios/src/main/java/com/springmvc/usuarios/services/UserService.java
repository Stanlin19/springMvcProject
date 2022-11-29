package com.springmvc.usuarios.services;

import com.springmvc.usuarios.models.Users;
import com.springmvc.usuarios.repositories.IUsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserService implements IUsersService {

    @Autowired
    private IUsersRepository repository;

    /*@Autowired
    private BCryptPasswordEncoder encoder;*/

    @Override
    public Optional<Users> fingByID(Long id) {
        return repository.findById(id);
    }

    @Override
    public List<Users> getUsers() {
        return repository.findAll();
    }

    @Override
    public String saveUser(Users user) {
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        repository.save(user);
        return "Usuario " + user.getUserName() + " Se ha guardado exitosamente.";
    }

    @Override
    public Users getUserByUserName(String userName) {
        return repository.findOneByUserName(userName);
    }

    /*@Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Users us = repository.findOneByUserName(username);
        List<GrantedAuthority> roles = new ArrayList<>();
        roles.add(new SimpleGrantedAuthority(us.getRole().getName()));
        UserDetails user = new User(us.getUserName(), us.getPassword(), roles);
        return user;
    }*/
}
