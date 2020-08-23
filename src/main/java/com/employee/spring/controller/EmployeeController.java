package com.employee.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.employee.spring.model.EmployeeEntity;
import com.employee.spring.service.EmployeeManager;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
public class EmployeeController {

	@Autowired
	private EmployeeManager employeeService;

	/*---Get All Existing Employees---*/
	@GetMapping("/listallemployees")
	public ResponseEntity<List<EmployeeEntity>> list() {
		List<EmployeeEntity> employeeList = employeeService.getAllEmployees();
		return ResponseEntity.ok().body(employeeList);
	}

	/*-- Add a New Employee---*/
	@PostMapping("/addemployee")
	public ResponseEntity<?> addEmployee(@RequestBody EmployeeEntity employee) {
		employeeService.addEmployee(employee);
		return ResponseEntity.ok().body("Employee has been created sucessfully:");
	}

	/*---Get list of Employees by search criteria---*/
	@PostMapping("/listemployees")
	public ResponseEntity<List<EmployeeEntity>> get(@RequestBody EmployeeEntity employee) {
		List<EmployeeEntity> employeeList = employeeService.searchEmployee(employee);
		return ResponseEntity.ok().body(employeeList);
	}

}
