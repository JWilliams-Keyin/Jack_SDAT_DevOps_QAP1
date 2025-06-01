package com.keyin;

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
    }

    public void removeFromCart(VideoGame videoGame) {
        gamesInCart.remove(videoGame);
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
}
