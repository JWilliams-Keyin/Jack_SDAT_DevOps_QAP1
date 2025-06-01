package com.keyin;

import java.util.ArrayList;
import java.util.Arrays;

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
}
