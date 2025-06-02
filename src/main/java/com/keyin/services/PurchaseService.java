package com.keyin.services;

import com.keyin.models.Cart;
import com.keyin.models.Purchase;
import com.keyin.models.VideoGame;

import java.util.ArrayList;

public class PurchaseService {

    // Methods

    public Purchase makePurchase(Cart cart) {
        ArrayList<VideoGame> gamesInCart = new ArrayList<>(cart.getGamesInCart());
        double totalPrice = cart.getTotalPrice();

        cart.gamesInCart.clear();
        return new Purchase(gamesInCart, totalPrice);
    }
}
