package com.rubenvj.carnejoven.features.buy.domain;

import com.rubenvj.carnejoven.features.promotion.domain.Promotion;
import com.rubenvj.carnejoven.features.user.domain.User;

public class CreateBuyUseCase {
    private BuyRepository buyRepository;
    public CreateBuyUseCase (BuyRepository buyRepository) {
        this.buyRepository = buyRepository;
    }

    public void execute (String buyId, String buyDate, User user, Promotion promotion) {
        Buy buy = new Buy(buyId, buyDate, promotion, user);
        buyRepository.createBuy(buy);
    }
}
