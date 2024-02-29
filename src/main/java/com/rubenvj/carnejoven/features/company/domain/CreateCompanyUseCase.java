package com.rubenvj.carnejoven.features.company.domain;

import com.rubenvj.carnejoven.features.company.data.CompanyDataRepository;

public class CreateCompanyUseCase {
    private CompanyDataRepository companyDataRepository;
    public CreateCompanyUseCase(CompanyDataRepository companyDataRepository) {
        this.companyDataRepository = companyDataRepository;
    }

    public void execute(Company company) {
        companyDataRepository.createCompany(company);
    }
}
