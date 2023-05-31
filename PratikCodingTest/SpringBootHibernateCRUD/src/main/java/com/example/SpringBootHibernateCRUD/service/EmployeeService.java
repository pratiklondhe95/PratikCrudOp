package com.example.SpringBootHibernateCRUD.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.SpringBootHibernateCRUD.entity.Employee;
import com.example.SpringBootHibernateCRUD.repos.EmployeeCrudRepo;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeCrudRepo repo;

	public Employee saveEmployee(Employee employee) {
		return repo.save(employee);
	}

	public List<Employee> getEmployees() {
		return repo.findAll();
	}

	public Employee getEmployeeById(int id) {
		return repo.findById(id).orElse(null);
	}

	public String deleteEmployee(int id) {
		repo.deleteById(id);
		return "employee removed!!";

	}

	public Employee updateEmployee(Employee employee) {
		Employee existingEmployee = repo.findById(employee.getId()).orElse(null);
		existingEmployee.setFirstName(employee.getFirstName());
		existingEmployee.setLastName(employee.getLastName());
		existingEmployee.setEmail(employee.getEmail());
		existingEmployee.setAge(employee.getAge());
		return repo.save(existingEmployee);

	}
}