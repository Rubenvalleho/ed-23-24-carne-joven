package com.rubenvj.carnejoven.features.promotion.domain;

import com.rubenvj.carnejoven.features.promotion.data.PromotionDataRepository;

public class DeletePromotionUseCase {
    private PromotionDataRepository promotionDataRepository;
    public DeletePromotionUseCase (PromotionDataRepository promotionDataRepository) {
        this.promotionDataRepository = promotionDataRepository;
    }

    public void execute () {
        promotionDataRepository.deletePromotion();
    }
}
