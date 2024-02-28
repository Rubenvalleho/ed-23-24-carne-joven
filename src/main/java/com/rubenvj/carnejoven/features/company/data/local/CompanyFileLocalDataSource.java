package com.rubenvj.carnejoven.features.company.data.local;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.rubenvj.carnejoven.features.buy.domain.Buy;
import com.rubenvj.carnejoven.features.company.domain.Company;

import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.concurrent.ConcurrentMap;

/**
 * Esta clase la proporciona el profesor
 */
public class CompanyFileLocalDataSource {

    private String nameFile = "company.txt";

    private Gson gson = new Gson();

    private final Type type = new TypeToken<Company>(){}.getType();

    public void saveCompany(Company company) {
        try {
            if (!Files.exists(Paths.get(nameFile))) {
                Files.createFile(Paths.get(nameFile));
            }
            FileWriter myWriter = new FileWriter(nameFile, true);
            myWriter.write(gson.toJson(company) + System.lineSeparator());
            myWriter.close();
            System.out.println("Compañia guardada correctamente");
        } catch (IOException e) {
            System.out.println("Ha ocurrido un error al guardar la compañia.");
        }
    }

    public Company obtainCompany(String companyId) {
        try {
            List<String> lines = Files.readAllLines(Paths.get(nameFile));
            for (String line: lines) {
                 Company company = gson.fromJson(line, Company.class);
                if (company.getCompanyId().equals(companyId)) {
                    return company;
                }
            }
        } catch (IOException e) {
            System.out.println("Ha ocurrido un error al obtener la compañía");
        }
        return null;
    }

    public void clear() {
        try {
            FileWriter myWriter = new FileWriter(nameFile);
            myWriter.write("");
            myWriter.close();
            System.out.println("Datos guardados correctamente");
        } catch (IOException e) {
            System.out.println("Ha ocurrido un error al guardar la información.");
        }
    }
}
