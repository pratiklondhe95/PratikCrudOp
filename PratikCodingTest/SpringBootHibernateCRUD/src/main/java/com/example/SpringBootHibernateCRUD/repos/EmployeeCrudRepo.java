package com.example.SpringBootHibernateCRUD.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.SpringBootHibernateCRUD.entity.Employee;

@Repository
public interface EmployeeCrudRepo extends JpaRepository<Employee, Integer> {
	

}
