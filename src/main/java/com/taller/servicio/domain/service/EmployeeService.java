package com.taller.servicio.domain.service;

import com.taller.servicio.domain.model.Employee;
import com.taller.servicio.domain.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public Optional<Employee> getEmployee(int idEmployee){
        return employeeRepository.getEmployee(idEmployee);
    }

    public Optional<Employee> getEmployeeByDocumentTypeAndDocumentNumber(String documentType, String documentNumber){
        return employeeRepository.getEmployeeByDocumentTypeAndDocumentNumber(documentType, documentNumber);
    }

    public Optional<List<Employee>> getEmployees(){
        return employeeRepository.getEmployees();
    }
}
