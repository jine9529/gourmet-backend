package com.kodachaya.gourmet.api.dao.user;


import com.kodachaya.gourmet.api.entity.user.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserDao extends JpaRepository<UserEntity, Integer> {

    Optional<UserEntity> findByUsername(String username);

}