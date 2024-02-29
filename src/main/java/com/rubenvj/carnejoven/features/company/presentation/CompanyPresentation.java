package com.rubenvj.carnejoven.features.company.presentation;

import com.rubenvj.carnejoven.features.company.data.CompanyDataRepository;
import com.rubenvj.carnejoven.features.company.domain.Company;
import com.rubenvj.carnejoven.features.company.domain.CreateCompanyUseCase;
import com.rubenvj.carnejoven.features.company.domain.GetCompanyUseCase;

public class CompanyPresentation {
    public static void getCompany(String companyId) {
        GetCompanyUseCase getCompanyUseCase = new GetCompanyUseCase(CompanyDataRepository.newInstance());
        getCompanyUseCase.execute(companyId);
    }

    public static void createCompany(Company company) {
        CreateCompanyUseCase createCompanyUseCase = new CreateCompanyUseCase(CompanyDataRepository.newInstance());
        createCompanyUseCase.execute(company);
    }
}
