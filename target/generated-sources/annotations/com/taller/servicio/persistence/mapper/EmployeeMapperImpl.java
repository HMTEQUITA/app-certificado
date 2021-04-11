package com.taller.servicio.persistence.mapper;

import com.taller.servicio.domain.Employee;
import com.taller.servicio.domain.HumanTalentManager;
import com.taller.servicio.persistence.entity.Cargo;
import com.taller.servicio.persistence.entity.Empleado;
import javax.annotation.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-04-10T20:34:30-0500",
    comments = "version: 1.4.1.Final, compiler: javac, environment: Java 1.8.0_281 (Oracle Corporation)"
)
@Component
public class EmployeeMapperImpl implements EmployeeMapper {

    @Autowired
    private CompanyMapper companyMapper;

    @Override
    public Employee toEmployee(Empleado empleado) {
        if ( empleado == null ) {
            return null;
        }

        Employee employee = new Employee();

        employee.setDocumentType( empleado.getTipoDocumento() );
        employee.setDocumentNumber( empleado.getNumeroDocumento() );
        employee.setFirstSurname( empleado.getPrimerApellido() );
        employee.setSecondSurname( empleado.getSegundoApellido() );
        employee.setFirstName( empleado.getPrimerNombre() );
        employee.setSecondName( empleado.getSegundoNombre() );
        if ( empleado.getSalario() != null ) {
            employee.setSalary( empleado.getSalario() );
        }
        employee.setActive( empleado.isEstado() );
        employee.setAdmissionDate( empleado.getFechaIngreso() );
        employee.setPosition( empleadoCargoNombreCargo( empleado ) );
        employee.setCompany( companyMapper.toCompany( empleado.getEmpresa() ) );

        return employee;
    }

    @Override
    public HumanTalentManager toHumanTalentManager(Empleado empleado) {
        if ( empleado == null ) {
            return null;
        }

        HumanTalentManager humanTalentManager = new HumanTalentManager();

        humanTalentManager.setDocumentType( empleado.getTipoDocumento() );
        humanTalentManager.setDocumentNumber( empleado.getNumeroDocumento() );
        humanTalentManager.setFirstSurname( empleado.getPrimerApellido() );
        humanTalentManager.setSecondSurname( empleado.getSegundoApellido() );
        humanTalentManager.setFirstName( empleado.getPrimerNombre() );
        humanTalentManager.setSecondName( empleado.getSegundoNombre() );
        humanTalentManager.setPosition( empleadoCargoNombreCargo( empleado ) );

        return humanTalentManager;
    }

    private String empleadoCargoNombreCargo(Empleado empleado) {
        if ( empleado == null ) {
            return null;
        }
        Cargo cargo = empleado.getCargo();
        if ( cargo == null ) {
            return null;
        }
        String nombreCargo = cargo.getNombreCargo();
        if ( nombreCargo == null ) {
            return null;
        }
        return nombreCargo;
    }
}
