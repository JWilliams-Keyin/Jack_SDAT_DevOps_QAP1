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

    // Methods

    public void addToCart(VideoGame videoGame){
        gamesInCart.add(videoGame);
    }
}
