package com.nicascript.backendinventario.services;

import com.nicascript.backendinventario.entity.EmployeeEntity;
import com.nicascript.backendinventario.repository.EmployeeRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class EmployeeServices {
  @Autowired private EmployeeRepository employeeRepository;

  public List<EmployeeEntity> gettAllEmployee() {
    return employeeRepository.findAll();
  }

  public EmployeeEntity createEmployee(EmployeeEntity employee) {
    return employeeRepository.save(employee);
  }

  public EmployeeEntity updateEmployee(UUID uuid, EmployeeEntity employee) {
    var id = employee.getUuid();
    if (employeeRepository.existsById(id)) {
      return employeeRepository.save(employee);
    }
    throw new EntityNotFoundException("Employee not found");
  }
}
