package com.rubenvj.carnejoven.features.promotion.domain;

import com.rubenvj.carnejoven.features.promotion.data.PromotionDataRepository;
import com.rubenvj.carnejoven.features.user.domain.CreateUserUseCase;

public class CreatePromotionUseCase {
    private PromotionRepository promotionRepository;
    public CreatePromotionUseCase (PromotionRepository promotionRepository) {
        this.promotionRepository = promotionRepository;
    }

    public void execute (Promotion promotion) {
        promotionRepository.createPromotion(promotion);
    }
}
