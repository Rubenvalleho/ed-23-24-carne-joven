package com.rubenvj.carnejoven.features.buy.domain;

import com.rubenvj.carnejoven.features.promotion.domain.Promotion;
import com.rubenvj.carnejoven.features.user.domain.User;

public class Buy {
    private String buyId;
    private String buyDate;
    private Promotion promotion;
    private User user;

    public Buy (String buyId, String buyDate, Promotion promotion, User user) {
        this.buyId = buyId;
        this.buyDate = buyDate;
        this.promotion = promotion;
        this.user = user;
    }

    public String getBuyId() {
        return buyId;
    }

    public void setBuyId(String buyId) {
        this.buyId = buyId;
    }

    public String getBuyDate() {
        return buyDate;
    }

    public void setBuyDate(String buyDate) {
        this.buyDate = buyDate;
    }

    public Promotion getPromotion() {
        return promotion;
    }

    public void setPromotion(Promotion promotion) {
        this.promotion = promotion;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
