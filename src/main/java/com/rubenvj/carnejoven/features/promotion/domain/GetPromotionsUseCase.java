package com.rubenvj.carnejoven.features.promotion.domain;

import com.rubenvj.carnejoven.features.promotion.data.PromotionDataRepository;

import java.util.ArrayList;

public class GetPromotionsUseCase {
    private PromotionDataRepository promotionDataRepository;
    public GetPromotionsUseCase (PromotionDataRepository promotionDataRepository) {
        this.promotionDataRepository = promotionDataRepository;
    }

    public ArrayList<Promotion> execute () {
        return promotionDataRepository.getPromotions();
    }
}
