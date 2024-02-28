package com.rubenvj.carnejoven.features.user.data.local;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.rubenvj.carnejoven.features.promotion.domain.Promotion;
import com.rubenvj.carnejoven.features.user.domain.User;

import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 * Esta clase la proporciona el profesor
 */
public class UserFileLocalDataSource {

    private String nameFile = "user.txt";

    private Gson gson = new Gson();

    private final Type type = new TypeToken<User>(){}.getType();

    public void saveUser(User user) {
        try {
            if (!Files.exists(Paths.get(nameFile))) {
                Files.createFile(Paths.get(nameFile));
            }
            FileWriter myWriter = new FileWriter(nameFile, true);
            myWriter.write(gson.toJson(user) + System.lineSeparator());
            myWriter.close();
            System.out.println("Usuario guardado correctamente");
        } catch (IOException e) {
            System.out.println("Ha ocurrido un error al guardar el usuario.");
        }
    }

    public User obtainUser (String dni) {
        try {
            List<String> lines = Files.readAllLines(Paths.get(nameFile));
            for (String line: lines) {
                User user = gson.fromJson(line, User.class);
                if (user.getDni().equals(dni)) {
                    return user;
                }
            }
        } catch (IOException e) {
            System.out.println("Ha ocurrido un error al obtener el usuario");
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
