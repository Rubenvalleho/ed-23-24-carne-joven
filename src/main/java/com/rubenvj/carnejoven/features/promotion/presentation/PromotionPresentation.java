package com.rubenvj.carnejoven.features.promotion.presentation;

import com.rubenvj.carnejoven.features.promotion.data.PromotionDataRepository;
import com.rubenvj.carnejoven.features.promotion.domain.*;

public class PromotionPresentation {
    public static void getPromotion(String promotionId) {
        GetPromotionUseCase getPromotionUseCase = new GetPromotionUseCase(PromotionDataRepository.newInstance());
        getPromotionUseCase.execute(promotionId);
    }

    public static void  getPromotions() {
        GetPromotionsUseCase getPromotionsUseCase = new GetPromotionsUseCase(PromotionDataRepository.newInstance());
        getPromotionsUseCase.execute();
    }

    public static void createPromotion(Promotion promotion) {
        CreatePromotionUseCase createPromotionUseCase = new CreatePromotionUseCase(PromotionDataRepository.newInstance());
        createPromotionUseCase.execute(promotion);
    }

    public static void deletePromotion(String promotionId) {
        DeletePromotionUseCase deletePromotionUseCase = new DeletePromotionUseCase(PromotionDataRepository.newInstance());
        deletePromotionUseCase.execute();
    }
}
