package com.rubenvj.carnejoven.features.buy.presentation;

import com.rubenvj.carnejoven.features.buy.data.BuyDataRepository;
import com.rubenvj.carnejoven.features.buy.domain.CreateBuyUseCase;
import com.rubenvj.carnejoven.features.buy.domain.GetBuysUseCase;
import com.rubenvj.carnejoven.features.promotion.data.PromotionDataRepository;
import com.rubenvj.carnejoven.features.promotion.domain.GetPromotionUseCase;
import com.rubenvj.carnejoven.features.promotion.domain.Promotion;
import com.rubenvj.carnejoven.features.user.data.UserDataRepository;
import com.rubenvj.carnejoven.features.user.domain.GetUserUseCase;
import com.rubenvj.carnejoven.features.user.domain.User;

public class BuyPresentation {
    //Forma de crear un objeto que requiere de otros.
    public static void createBuy (String buyId, String buyDate, String dni, String promotionId) {
        GetUserUseCase getUserUseCase = new GetUserUseCase(UserDataRepository.newInstance());
        GetPromotionUseCase getPromotionUseCase = new GetPromotionUseCase(PromotionDataRepository.newInstance());
        CreateBuyUseCase createBuyUseCase = new CreateBuyUseCase(BuyDataRepository.newInstance());
        createBuyUseCase.execute(buyId, buyDate, getUserUseCase.execute(dni), getPromotionUseCase.execute(promotionId));
    }

    public static void getBuys () {
        GetBuysUseCase getBuysUseCase = new GetBuysUseCase(BuyDataRepository.newInstance());
        getBuysUseCase.execute();
    }
}
