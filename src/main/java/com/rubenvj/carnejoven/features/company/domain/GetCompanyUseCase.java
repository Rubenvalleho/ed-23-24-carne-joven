package com.rubenvj.carnejoven.features.company.domain;

import com.rubenvj.carnejoven.features.company.data.CompanyDataRepository;

public class GetCompanyUseCase {
    private CompanyRepository companyRepository;
    public GetCompanyUseCase(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }

    public Company execute (String companyId) {
        return companyRepository.getCompany(companyId);
    }
}
