package com.ProjtCong.GestionConge.service;

import com.ProjtCong.GestionConge.model.Employee;

import java.util.List;

public interface EmployeeService {
    Employee creer(Employee employee);
    List<Employee> lire();
    Employee modifier(int id,Employee employee);
    String supprimer(int id);

}
