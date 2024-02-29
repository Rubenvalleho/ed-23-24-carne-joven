package com.rubenvj.carnejoven.features.promotion.domain;

import com.rubenvj.carnejoven.features.promotion.data.PromotionDataRepository;
import com.rubenvj.carnejoven.features.user.domain.CreateUserUseCase;

public class CreatePromotionUseCase {
    private PromotionDataRepository promotionDataRepository;
    public CreatePromotionUseCase (PromotionDataRepository promotionDataRepository) {
        this.promotionDataRepository = promotionDataRepository;
    }

    public void execute (Promotion promotion) {
        promotionDataRepository.createPromotion(promotion);
    }
}
