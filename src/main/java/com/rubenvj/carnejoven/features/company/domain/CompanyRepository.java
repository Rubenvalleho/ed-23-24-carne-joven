package com.rubenvj.carnejoven.features.company.domain;

public interface CompanyRepository {
    public void createCompany(Company company);
    public Company getCompany(String companyId);
}
