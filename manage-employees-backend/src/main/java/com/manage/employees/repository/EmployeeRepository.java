package com.manage.employees.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.manage.employees.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long> {

}
