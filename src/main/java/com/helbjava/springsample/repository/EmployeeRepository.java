package com.helbjava.springsample.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.helbjava.springsample.entity.EmployeeEntity;

// JpaRepository<Entity, typeof(Entity.id)>

public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Long> {

}