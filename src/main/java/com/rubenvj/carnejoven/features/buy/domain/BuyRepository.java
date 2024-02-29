package com.rubenvj.carnejoven.features.buy.domain;

import java.util.ArrayList;

public interface BuyRepository {
    public void createBuy(Buy buy);
    public ArrayList<Buy> getBuysUseCase();
}
