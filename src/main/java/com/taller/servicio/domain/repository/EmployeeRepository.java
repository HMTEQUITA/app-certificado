package com.taller.servicio.domain.repository;

import com.taller.servicio.domain.Employee;
import com.taller.servicio.domain.HumanTalentManager;

import java.util.List;
import java.util.Optional;

public interface EmployeeRepository {
    Optional<Employee> getEmployee(int idEmployee);
}
