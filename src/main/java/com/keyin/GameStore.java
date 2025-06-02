package com.keyin;

/* Author: Jack Williams
*  Dates: May 26th - June 1st
*  Description: The GameStore class is a demo class that shows all
*  the functionality of the program when run */

import com.keyin.models.Cart;
import com.keyin.models.Purchase;
import com.keyin.services.PurchaseService;
import com.keyin.services.VideoGameCatalog;

public class GameStore {
    public static void main(String[] args) {
        VideoGameCatalog gameCatalog = new VideoGameCatalog();

        System.out.println(gameCatalog);
        System.out.println();

        Cart cart = new Cart();

        cart.addToCart(gameCatalog.availableGames.get(4));
        cart.addToCart(gameCatalog.availableGames.get(7));
        cart.addToCart(gameCatalog.availableGames.get(0));

        System.out.println(cart);
        System.out.println(cart.getTotalPrice());
        System.out.println();

        cart.removeFromCart(cart.gamesInCart.getFirst());

        System.out.println(cart);
        System.out.println(cart.getTotalPrice());
        System.out.println();

        PurchaseService purchaseService = new PurchaseService();

        Purchase purchase = purchaseService.makePurchase(cart);

        System.out.println(purchase);
    }
}
