package com.ProjtCong.GestionConge.repository;

import com.ProjtCong.GestionConge.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
}
