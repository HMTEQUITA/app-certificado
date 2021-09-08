package com.taller.servicio.persistence.repositoryImpl;

import com.taller.servicio.domain.model.Employee;
import com.taller.servicio.domain.repository.EmployeeRepository;
import com.taller.servicio.persistence.crud.EmpleadoCrudRepository;
import com.taller.servicio.persistence.entity.Empleado;
import com.taller.servicio.persistence.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class EmpleadoRepositoryImpl implements EmployeeRepository {

    @Autowired
    private EmpleadoCrudRepository empleadoCrudRepository;

    @Autowired
    private EmployeeMapper employeeMapper;

    @Override
    public Optional<Employee> getEmployee(int idEmployee) {
        return empleadoCrudRepository.findById(idEmployee).map(empleado -> employeeMapper.toEmployee(empleado));
    }

    @Override
    public Optional<Employee> getEmployeeByDocumentTypeAndDocumentNumber(String documentType, String documentNumber) {
        return empleadoCrudRepository.findByTipoDocumentoAndNumeroDocumento(documentType, documentNumber).map(empleado -> employeeMapper.toEmployee(empleado));
    }

    @Override
    public Optional<List<Employee>> getEmployees() {
        List<Empleado> empleados = (List<Empleado>) empleadoCrudRepository.findAll();
        return Optional.of(employeeMapper.toEmployees(empleados));
    }

}
