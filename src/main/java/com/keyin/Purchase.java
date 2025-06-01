package com.keyin;

import java.util.ArrayList;

public class Purchase {

    // Attributes

    ArrayList<VideoGame>[] gamesInCart;
    double totalPrice;

    // Constructor

    public Purchase(ArrayList<VideoGame>[] gamesInCart, double totalPrice) {
        this.gamesInCart = gamesInCart;
        this.totalPrice = totalPrice;
    }

    // Getters

    public ArrayList<VideoGame>[] getGamesInCart() {
        return gamesInCart;
    }

    public double getTotalPrice() {
        return totalPrice;
    }
}
