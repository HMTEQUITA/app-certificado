package com.taller.servicio.persistence.mapper;

import com.taller.servicio.domain.Company;
import com.taller.servicio.persistence.entity.Empresa;
import javax.annotation.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-04-10T20:34:30-0500",
    comments = "version: 1.4.1.Final, compiler: javac, environment: Java 1.8.0_281 (Oracle Corporation)"
)
@Component
public class CompanyMapperImpl implements CompanyMapper {

    @Autowired
    private EmployeeMapper employeeMapper;

    @Override
    public Company toCompany(Empresa empresa) {
        if ( empresa == null ) {
            return null;
        }

        Company company = new Company();

        company.setNameCompany( empresa.getRazonSocial() );
        company.setDocumentType( empresa.getTipoDocumento() );
        company.setDocumentNumber( empresa.getNumeroDocumento() );
        company.setAddress( empresa.getDireccion() );
        company.setPhoneNumber( empresa.getTelefono() );
        company.setHumanTalentManager( employeeMapper.toHumanTalentManager( empresa.getEmpleado() ) );

        return company;
    }
}
