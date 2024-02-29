package com.rubenvj.carnejoven.features.promotion.domain;

import com.rubenvj.carnejoven.features.promotion.data.PromotionDataRepository;

public class DeletePromotionUseCase {
    private PromotionRepository promotionRepository;
    public DeletePromotionUseCase (PromotionRepository promotionRepository) {
        this.promotionRepository = promotionRepository;
    }

    public void execute () {
        promotionRepository.deletePromotion();
    }
}
