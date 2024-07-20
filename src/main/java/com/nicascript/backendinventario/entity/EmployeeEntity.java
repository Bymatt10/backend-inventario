package com.nicascript.backendinventario.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
import java.util.UUID;

@Data
@Entity
@Table(name = "employee")
public class EmployeeEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.UUID)
  @Column(name = "Uuid")
  private UUID uuid;

  @Column(name = "name")
  private String name;

  @Column(name = "lastname")
  private String lastname;

  @Column(name = "phone")
  private String phone;

  @Column(name = "status")
  private Boolean status = Boolean.TRUE;

  @Column(name = "created_At")
  private Date createdAt;

  @Column(name = "updated_At")
  private Date updatedAt;
}
