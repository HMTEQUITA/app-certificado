package com.taller.servicio.domain.model;

import java.time.LocalDate;

public class Certificate {

    private LocalDate generationDate;
    private Employee employee;

    public Certificate() {
        this.generationDate = LocalDate.now();
    }

    public LocalDate getGenerationDate() {
        return generationDate;
    }

    public void setGenerationDate(LocalDate generationDate) {
        this.generationDate = generationDate;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}
