package com.taller.servicio.persistence.mapper;

import com.taller.servicio.domain.Employee;
import com.taller.servicio.domain.HumanTalentManager;
import com.taller.servicio.persistence.entity.Empleado;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;
import java.util.Optional;

@Mapper(componentModel = "spring", uses = {CompanyMapper.class})
public interface EmployeeMapper {

    @Mappings({
            @Mapping(source = "tipoDocumento", target = "documentType"),
            @Mapping(source = "numeroDocumento", target = "documentNumber"),
            @Mapping(source = "primerApellido", target = "firstSurname"),
            @Mapping(source = "segundoApellido", target = "secondSurname"),
            @Mapping(source = "primerNombre", target = "firstName"),
            @Mapping(source = "segundoNombre", target = "secondName"),
            @Mapping(source = "salario", target = "salary"),
            @Mapping(source = "estado", target = "active"),
            @Mapping(source = "fechaIngreso", target = "admissionDate"),
            @Mapping(source = "cargo.nombreCargo", target = "position"),
            @Mapping(source = "empresa", target = "company"),
    })
    Employee toEmployee(Empleado empleado);
    List<Employee> toEmployees(List<Empleado> empleados);

    @Mappings({
            @Mapping(source = "tipoDocumento", target = "documentType"),
            @Mapping(source = "numeroDocumento", target = "documentNumber"),
            @Mapping(source = "primerApellido", target = "firstSurname"),
            @Mapping(source = "segundoApellido", target = "secondSurname"),
            @Mapping(source = "primerNombre", target = "firstName"),
            @Mapping(source = "segundoNombre", target = "secondName"),
            @Mapping(source = "cargo.nombreCargo", target = "position"),
    })
    HumanTalentManager toHumanTalentManager(Empleado empleado);
}
