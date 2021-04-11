package com.taller.servicio.web.controller;

import com.taller.servicio.domain.Certificate;
import com.taller.servicio.domain.Employee;
import com.taller.servicio.domain.service.CertificateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/certificates")
public class CertificateController {

    @Autowired
    private CertificateService certificateService;

    @GetMapping("/{employeeId}")
    public ResponseEntity<Certificate> getCertificate(@PathVariable("employeeId") int employeeId) {
        return certificateService.getCertificate(employeeId)
                .map(certificate -> new ResponseEntity<>(certificate, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

}
