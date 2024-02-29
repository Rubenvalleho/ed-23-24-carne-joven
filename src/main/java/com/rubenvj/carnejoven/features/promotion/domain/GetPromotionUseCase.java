package com.rubenvj.carnejoven.features.promotion.domain;

import com.rubenvj.carnejoven.features.promotion.data.PromotionDataRepository;

public class GetPromotionUseCase {
    private PromotionDataRepository promotionDataRepository;
    public GetPromotionUseCase (PromotionDataRepository promotionDataRepository) {
        this.promotionDataRepository = promotionDataRepository;
    }

    public Promotion execute (String promotionId) {
        return promotionDataRepository.getPromotion(promotionId);
    }
}
