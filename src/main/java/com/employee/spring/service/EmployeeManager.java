package com.employee.spring.service;

import java.util.List;

import com.employee.spring.model.EmployeeEntity;

public interface EmployeeManager {
	public void addEmployee(EmployeeEntity employee);

	public List<EmployeeEntity> getAllEmployees();

	public void deleteEmployee(Integer employeeId);

	public List<EmployeeEntity> searchEmployee(EmployeeEntity employee);
}
