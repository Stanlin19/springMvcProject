package com.springmvc.usuarios.services;

import com.springmvc.usuarios.models.Role;
import com.springmvc.usuarios.repositories.IRoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleService implements IRoleService{

    @Autowired
    private IRoleRepository repository;

    @Override
    public List<Role> getRoles() {
        return repository.findAll();
    }

    @Override
    public String saveRole(Role role) {
        repository.save(role);
        return "Rol " + role.getName() + " Se ha guardado exitosamente";
    }
}
