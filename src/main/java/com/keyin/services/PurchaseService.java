package com.keyin.services;

/* Author: Jack Williams
*  Dates: May 26th - June 1st
*  Description: The PurchaseService class handles the logic for a
*  purchase to be made. The included method returns a new Purchase
*  object with all of the data from the user's cart at the time, and
*  clears their cart */

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
