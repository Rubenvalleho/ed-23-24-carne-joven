package com.rubenvj.carnejoven.features.buy.domain;

import java.util.ArrayList;

public class GetBuysUseCase {
    private BuyRepository buyRepository;
    public GetBuysUseCase (BuyRepository buyRepository) {
        this.buyRepository = buyRepository;
    }

    public ArrayList<Buy> execute () {
        return buyRepository.getBuysUseCase();
    }
}
