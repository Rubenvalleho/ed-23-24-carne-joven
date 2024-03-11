package com.rubenvj.carnejoven.features;

import com.rubenvj.carnejoven.features.buy.presentation.BuyPresentation;
import com.rubenvj.carnejoven.features.company.domain.Company;
import com.rubenvj.carnejoven.features.company.presentation.CompanyPresentation;
import com.rubenvj.carnejoven.features.promotion.data.PromotionDataRepository;
import com.rubenvj.carnejoven.features.promotion.domain.Promotion;
import com.rubenvj.carnejoven.features.promotion.presentation.PromotionPresentation;
import com.rubenvj.carnejoven.features.user.domain.User;
import com.rubenvj.carnejoven.features.user.presentation.UserPresentation;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        UserPresentation.createUser(new User("708", "Rubén", "Vallejo", "Casa"));
        UserPresentation.getUser("708");

        CompanyPresentation.createCompany(new Company("123", "Compañia", "34390"));
        CompanyPresentation.getCompany("123");

        PromotionPresentation.createPromotion(new Promotion("777", "Promocion", "Promocion", "15%"));
        PromotionPresentation.getPromotion("777");

        BuyPresentation.createBuy("001", "29/02/2024", "708", "777");
        BuyPresentation.getBuys();

        ArrayList<User> users = new ArrayList<>();
    }
}