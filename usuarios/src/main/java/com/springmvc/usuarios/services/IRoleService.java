package com.springmvc.usuarios.services;

import com.springmvc.usuarios.models.Role;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IRoleService {

    List<Role> getRoles();
    String saveRole(Role role);

}
