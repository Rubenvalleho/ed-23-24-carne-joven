package com.rubenvj.carnejoven.features.company.data;

import com.rubenvj.carnejoven.features.company.data.local.CompanyFileLocalDataSource;
import com.rubenvj.carnejoven.features.company.domain.Company;
import com.rubenvj.carnejoven.features.company.domain.CompanyRepository;

public class CompanyDataRepository implements CompanyRepository {
    private CompanyFileLocalDataSource companyFileLocalDataSource;
    private static CompanyDataRepository instance = null;

    public static CompanyDataRepository newInstance() {
        if (instance == null) {
            instance = new CompanyDataRepository();
        }
        return instance;
    }

    @Override
    public void createCompany(Company company) {
        companyFileLocalDataSource.saveCompany(company);
    }

    @Override
    public Company getCompany(String companyId) {
        return companyFileLocalDataSource.obtainCompany(companyId);
    }
}
