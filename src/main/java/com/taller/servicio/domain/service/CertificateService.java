package com.taller.servicio.domain.service;

import com.taller.servicio.domain.Certificate;
import com.taller.servicio.domain.Employee;
import com.taller.servicio.domain.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CertificateService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public Optional<Certificate> getCertificate(int idEmployee) {

        Optional<Certificate> certificate = Optional.empty();

        Optional<Employee> employee = employeeRepository.getEmployee(idEmployee);

        if (employee.isPresent()){
            Certificate cert = new Certificate();
            cert.setEmployee(employee.get());

            certificate = Optional.of(cert);
        }

        return certificate;
    }
}
