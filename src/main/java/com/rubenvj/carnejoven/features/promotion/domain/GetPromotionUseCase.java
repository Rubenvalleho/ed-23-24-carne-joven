package com.rubenvj.carnejoven.features.promotion.domain;

import com.rubenvj.carnejoven.features.promotion.data.PromotionDataRepository;

public class GetPromotionUseCase {
    private PromotionRepository promotionRepository;
    public GetPromotionUseCase (PromotionRepository promotionRepository) {
        this.promotionRepository = promotionRepository;
    }

    public Promotion execute (String promotionId) {
        return promotionRepository.getPromotion(promotionId);
    }
}
