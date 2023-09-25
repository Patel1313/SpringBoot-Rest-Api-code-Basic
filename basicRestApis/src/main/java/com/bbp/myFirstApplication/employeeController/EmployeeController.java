package com.bbp.myFirstApplication.employeeController;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bbp.myFirstApplication.employeeEntity.Employee;
import com.bbp.myFirstApplication.employeeServices.EmployeeServices;

@CrossOrigin("*")
@RestController
@RequestMapping("/bbp")
public class EmployeeController {
	
	@Autowired
	private EmployeeServices employeeServices;
	
	@GetMapping("/welcome")
	public String welcome() {
		return "Welcome to Bollam Bharath Patel";
	}
	
	@GetMapping("/findAll")
	public List<Employee> findAll() {
		return employeeServices.findAllEmployess();
	}
	
	@GetMapping("/findById/{id}")
	public Optional<Employee> findById(@PathVariable("id") Integer id) {
		return employeeServices.employeeFindById(id);
	}
	
	@PostMapping("/save")
	public Employee saveEmployee(@RequestBody Employee employee) {
		return employeeServices.save(employee);
	}
	
	@PutMapping("/update/{id}")
	public Employee updateEmployeeById(@RequestBody Employee employee, @PathVariable("id") Integer id) {
		return employeeServices.employeeUpdateById(id, employee);
	}
	
	@DeleteMapping("/delete/{id}")
	public boolean deleteEmployee(@PathVariable("id") Integer id) {
		return employeeServices.employeeDeleteById(id);
	}
}
