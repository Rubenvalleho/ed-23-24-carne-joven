package com.rubenvj.carnejoven.features.company.domain;

import com.rubenvj.carnejoven.features.company.data.CompanyDataRepository;

public class CreateCompanyUseCase {
    private CompanyRepository companyRepository;
    public CreateCompanyUseCase(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }

    public void execute(Company company) {
        companyRepository.createCompany(company);
    }
}
