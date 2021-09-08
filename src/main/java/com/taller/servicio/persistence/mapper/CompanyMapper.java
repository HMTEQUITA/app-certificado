package com.taller.servicio.persistence.mapper;

import com.taller.servicio.domain.model.Company;
import com.taller.servicio.persistence.entity.Empresa;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.Named;

@Mapper(componentModel = "spring", uses = {EmployeeMapper.class})
public interface CompanyMapper {

    @Mappings({
            @Mapping(source = "razonSocial", target = "nameCompany"),
            @Mapping(source = "tipoDocumento", target = "documentType"),
            @Mapping(source = "numeroDocumento", target = "documentNumber"),
            @Mapping(source = "direccion", target = "address"),
            @Mapping(source = "telefono", target = "phoneNumber"),
            @Mapping(source = "empleado", target = "humanTalentManager")
    })
    Company toCompany(Empresa empresa);

}
