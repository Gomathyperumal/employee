package com.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.entity.Employeeentity;

public interface Employeerepository extends JpaRepository
<Employeeentity,Integer>{
}