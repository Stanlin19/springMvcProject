package com.springmvc.usuarios.repositories;

import com.springmvc.usuarios.models.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IUsersRepository extends JpaRepository<Users, Long> {

    Optional<Users> findById(Long id);
    Users findOneByUserName(String userName);
}
