package com.nicascript.backendinventario.repository;

import com.nicascript.backendinventario.entity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface EmployeeRepository extends JpaRepository<EmployeeEntity, UUID> {}
