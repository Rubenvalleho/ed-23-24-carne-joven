package com.rubenvj.carnejoven.features.promotion.data.local;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.rubenvj.carnejoven.features.buy.domain.Buy;
import com.rubenvj.carnejoven.features.promotion.domain.Promotion;

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
public class PromotionFileLocalDataSource {

    private String nameFile = "promotion.txt";

    private Gson gson = new Gson();

    private final Type type = new TypeToken<Promotion>(){}.getType();

    public void savePromotion(Promotion promotion) {
        try {
            if (!Files.exists(Paths.get(nameFile))) {
                Files.createFile(Paths.get(nameFile));
            }
            FileWriter myWriter = new FileWriter(nameFile, true);
            myWriter.write(gson.toJson(promotion) + System.lineSeparator());
            myWriter.close();
            System.out.println("Promoción guardada correctamente");
        } catch (IOException e) {
            System.out.println("Ha ocurrido un error al guardar la promoción.");
        }
    }

    public Promotion obtainPromotion(String promotionId) {
        try {
            List<String> lines = Files.readAllLines(Paths.get(nameFile));
            for (String line: lines) {
                Promotion promotion = gson.fromJson(line, Promotion.class);
                if (promotion.getPromotionId().equals(promotionId)) {
                    return promotion;
                }
            }
        } catch (IOException e) {
            System.out.println("Ha ocurrido un error al obtener la promocion");
        }
        return null;
    }

    public ArrayList<Promotion> obtainPromotions() {
        ArrayList<Promotion> promotions = new ArrayList<>();
        try {
            List<String> lines = Files.readAllLines(Paths.get(nameFile));
            for(String line : lines) {
                Promotion promotion = gson.fromJson(line, Promotion.class);
                promotions.add(promotion);
            }
        } catch (IOException e) {
            System.out.println("Error al obtener promociones");
        }

        return promotions;
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
