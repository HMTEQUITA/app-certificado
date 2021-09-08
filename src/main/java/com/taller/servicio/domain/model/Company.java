package com.taller.servicio.domain.model;

public class Company {
    private String nameCompany;
    private String documentType;
    private String documentNumber;
    private String address;
    private String phoneNumber;
    private HumanTalentManager humanTalentManager;

    public String getNameCompany() {
        return nameCompany;
    }

    public void setNameCompany(String nameCompany) {
        this.nameCompany = nameCompany;
    }

    public String getDocumentType() {
        return documentType;
    }

    public void setDocumentType(String documentType) {
        this.documentType = documentType;
    }

    public String getDocumentNumber() {
        return documentNumber;
    }

    public void setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public HumanTalentManager getHumanTalentManager() {
        return humanTalentManager;
    }

    public void setHumanTalentManager(HumanTalentManager humanTalentManager) {
        this.humanTalentManager = humanTalentManager;
    }
}
