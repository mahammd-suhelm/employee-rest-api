package com.restapi.partone.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.restapi.partone.Entiry.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
