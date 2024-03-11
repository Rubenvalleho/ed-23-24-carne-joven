package com.rubenvj.carnejoven.features.buy.data;

import com.rubenvj.carnejoven.features.buy.data.local.BuyFileLocalDataSource;
import com.rubenvj.carnejoven.features.buy.domain.Buy;
import com.rubenvj.carnejoven.features.buy.domain.BuyRepository;

import java.util.ArrayList;

public class BuyDataRepository implements BuyRepository {
    private BuyFileLocalDataSource buyFileLocalDataSource;

    private BuyDataRepository (BuyFileLocalDataSource buyFileLocalDataSource) {
        this.buyFileLocalDataSource = buyFileLocalDataSource;
    }
    private static BuyDataRepository instance = null;
    public static BuyDataRepository newInstance () {
        if (instance == null) {
            instance = new BuyDataRepository(buyFileLocalDataSource);
        }
        return instance;
    }

    @Override
    public void createBuy(Buy buy) {
        buyFileLocalDataSource.saveBuy(buy);
    }

    @Override
    public ArrayList<Buy> getBuysUseCase() {
        return buyFileLocalDataSource.obtainBuys();
    }
}
