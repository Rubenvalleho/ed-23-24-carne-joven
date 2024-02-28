package com.rubenvj.carnejoven.features.promotion.domain;

public class Promotion {
    private final String promotionId;
    private String title;
    private String description;
    private String discount;

    public Promotion (String promotionId, String title, String description, String discount) {
        this.promotionId = promotionId;
        this.title = title;
        this.description = description;
        this.discount = discount;
    }

    public String getPromotionId() {
        return promotionId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDiscount() {
        return discount;
    }

    public void setDiscount(String discount) {
        this.discount = discount;
    }
}
