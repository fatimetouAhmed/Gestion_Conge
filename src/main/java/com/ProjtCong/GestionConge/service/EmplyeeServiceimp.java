package com.ProjtCong.GestionConge.service;

import com.ProjtCong.GestionConge.model.Employee;
import com.ProjtCong.GestionConge.repository.EmployeeRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
@Service
@AllArgsConstructor
public class EmplyeeServiceimp implements EmployeeService{
    private final EmployeeRepository employeeRepository;
    @Override
    public Employee creer(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public List<Employee> lire() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee modifier(int id, Employee employee) {
        return employeeRepository.findById(id)
                .map(
                e->{
                    e.setNom(employee.getNom());
                    e.setPrenom(employee.getPrenom());
                    e.setEmail(employee.getEmail());
                    e.setTel(employee.getTel());
                    return employeeRepository.save(e);
                }
        ).orElseThrow(()-> new RuntimeException("employee non trouve"));
    }

    @Override
    public String supprimer(int id) {
        employeeRepository.deleteById(id);
        return "produit supprimer";
    }
}
