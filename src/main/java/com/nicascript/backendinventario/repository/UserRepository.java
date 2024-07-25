package com.nicascript.backendinventario.repository;

import com.nicascript.backendinventario.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
}
