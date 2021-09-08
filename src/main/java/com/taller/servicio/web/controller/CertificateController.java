package com.taller.servicio.web.controller;

import com.taller.servicio.domain.model.Certificate;
import com.taller.servicio.domain.service.CertificateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/certificates")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET})
public class CertificateController {

    @Autowired
    private CertificateService certificateService;

    @GetMapping
    public ResponseEntity<Certificate> getCertificate(@RequestParam(name = "documentType") String documentType, @RequestParam(name = "documentNumber") String documentNumber) {
        return certificateService.getCertificate(documentType, documentNumber)
                .map(certificate -> new ResponseEntity<>(certificate, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

}
