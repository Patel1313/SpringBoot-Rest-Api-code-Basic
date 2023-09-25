package com.bbp.myFirstApplication.employeeRepositry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bbp.myFirstApplication.employeeEntity.Employee;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

}
