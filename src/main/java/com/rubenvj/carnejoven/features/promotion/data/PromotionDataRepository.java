package com.rubenvj.carnejoven.features.promotion.data;

import com.rubenvj.carnejoven.features.promotion.data.local.PromotionFileLocalDataSource;
import com.rubenvj.carnejoven.features.promotion.domain.Promotion;
import com.rubenvj.carnejoven.features.promotion.domain.PromotionRepository;

import java.util.ArrayList;

public class PromotionDataRepository implements PromotionRepository {
    private PromotionFileLocalDataSource promotionFileLocalDataSource;
    private PromotionDataRepository instance = null;

    public PromotionDataRepository newInstance() {
        if (instance == null) {
            instance = new PromotionDataRepository();
        }
        return instance;
    }

    @Override
    public void createPromotion(Promotion promotion) {
        promotionFileLocalDataSource.savePromotion(promotion);
    }

    @Override
    public void deletePromotion() {

    }

    @Override
    public Promotion getPromotion(String promotionId) {
        return promotionFileLocalDataSource.obtainPromotion(promotionId);
    }

    @Override
    public ArrayList<Promotion> getPromotions() {
        return promotionFileLocalDataSource.obtainPromotions();
    }
}
