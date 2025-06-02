package com.keyin.models;

import java.util.ArrayList;

public class Purchase {

    // Attributes

    ArrayList<VideoGame> gamesInCart;
    double totalPrice;

    // Constructor

    public Purchase(ArrayList<VideoGame> gamesInCart, double totalPrice) {
        this.gamesInCart = gamesInCart;
        this.totalPrice = totalPrice;
    }

    // Getters

    public ArrayList<VideoGame> getGamesInCart() {
        return gamesInCart;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    // Methods

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < gamesInCart.size(); i++) {
            VideoGame videoGame = gamesInCart.get(i);
            stringBuilder.append(videoGame.toString()).append("\n");
        }

        return "Your Purchase:" + "\n" +
                stringBuilder.toString() + "\n" +
                "Total Price: " + totalPrice;
    }
}
