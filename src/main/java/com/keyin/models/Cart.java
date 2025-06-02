package com.keyin.models;

/* Author: Jack Williams
*  Dates: May 26th - June 1st
*  Description: The Cart class handles all logic regarding adding
*  and removing games from the user's cart, as well as calculating
*  the total price of all games in the cart */

import java.util.ArrayList;

public class Cart {

    // Attributes

    public ArrayList<VideoGame> gamesInCart;

    // Constructor

    public Cart(){
        this.gamesInCart = new ArrayList<>();
    }

    // Getter

    public ArrayList<VideoGame> getGamesInCart() {
        return gamesInCart;
    }

    // Methods

    public void addToCart(VideoGame videoGame){
        gamesInCart.add(videoGame);
        System.out.println("Game added to cart!");
    }

    public void removeFromCart(VideoGame videoGame) {
        gamesInCart.remove(videoGame);
        System.out.println("Game removed from cart!");
    }

    public double getTotalPrice() {
        double totalPrice = 0;

        for (int i = 0; i < gamesInCart.size(); i++) {
            VideoGame nextVideoGame = gamesInCart.get(i);
            double gamePrice = nextVideoGame.getGamePrice();
            totalPrice += gamePrice;
        }

        return totalPrice;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < gamesInCart.size(); i++) {
            VideoGame videoGame = gamesInCart.get(i);
            stringBuilder.append(videoGame.toString()).append("\n");
        }

        return stringBuilder.toString();
    }
}
