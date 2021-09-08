package com.taller.servicio.domain.repository;

import com.taller.servicio.domain.model.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeRepository {
    Optional<Employee> getEmployee(int idEmployee);
    Optional<Employee> getEmployeeByDocumentTypeAndDocumentNumber(String documentType, String documentNumber);
    Optional<List<Employee>> getEmployees();
}
