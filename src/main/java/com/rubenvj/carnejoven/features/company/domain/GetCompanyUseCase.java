package com.rubenvj.carnejoven.features.company.domain;

import com.rubenvj.carnejoven.features.company.data.CompanyDataRepository;

public class GetCompanyUseCase {
    private CompanyDataRepository companyDataRepository;
    public GetCompanyUseCase(CompanyDataRepository companyDataRepository) {
        this.companyDataRepository = companyDataRepository;
    }

    public Company execute (String companyId) {
        return companyDataRepository.getCompany(companyId);
    }
}
