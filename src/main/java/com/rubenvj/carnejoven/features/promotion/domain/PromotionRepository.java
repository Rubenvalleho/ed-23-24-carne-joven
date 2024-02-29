package com.rubenvj.carnejoven.features.promotion.domain;

import java.util.ArrayList;

public interface PromotionRepository {
    public void createPromotion(Promotion promotion);
    public void deletePromotion();
    public Promotion getPromotion(String promotionId);
    public ArrayList<Promotion> getPromotions();
}
