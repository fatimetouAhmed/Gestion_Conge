package com.ProjtCong.GestionConge.controller;

import com.ProjtCong.GestionConge.model.Employee;
import com.ProjtCong.GestionConge.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
@AllArgsConstructor
public class EmployeeController {
    private final EmployeeService employeeService;
    @PostMapping("/create")
    public Employee create (Employee employee){
        return employeeService.creer(employee);
    }
    @GetMapping("/read")
    public List<Employee> read(){
        return  employeeService.lire();
    }
    @PutMapping("/update/{id}")
    public Employee update(@PathVariable int id,@RequestBody Employee employee){
        return  employeeService.modifier(id,employee);

    }
    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable int id){
        return employeeService.supprimer(id);
    }
}
