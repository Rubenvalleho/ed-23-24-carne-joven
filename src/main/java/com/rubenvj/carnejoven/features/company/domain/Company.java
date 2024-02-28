package com.rubenvj.carnejoven.features.company.domain;

public class Company {
    private final String companyId;
    private String name;
    private String cif;

    public Company(String companyId, String name, String cif) {
        this.companyId = companyId;
        this.name = name;
        this.cif = cif;
    }

    public String getCompanyId() {
        return companyId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCif() {
        return cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }
}
