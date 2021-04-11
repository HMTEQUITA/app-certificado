package com.taller.servicio.domain.service;

import com.taller.servicio.domain.Employee;
import com.taller.servicio.domain.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public Optional<Employee> getEmployee(int idEmployee){
        return employeeRepository.getEmployee(idEmployee);
    }
}
