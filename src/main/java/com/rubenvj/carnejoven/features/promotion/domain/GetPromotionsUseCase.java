package com.rubenvj.carnejoven.features.promotion.domain;

import com.rubenvj.carnejoven.features.promotion.data.PromotionDataRepository;

import java.util.ArrayList;

public class GetPromotionsUseCase {
    private PromotionRepository promotionRepository;
    public GetPromotionsUseCase (PromotionRepository promotionRepository) {
        this.promotionRepository = promotionRepository;
    }

    public ArrayList<Promotion> execute () {
        return promotionRepository.getPromotions();
    }
}
