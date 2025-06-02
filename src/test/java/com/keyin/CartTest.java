package com.keyin;

/* Author: Jack Williams
*  Dates: May 26th - June 1st
*  Description: The CartTest class tests all of the methods that
*  can be called from the Cart class */

import com.keyin.models.Cart;
import com.keyin.models.VideoGame;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class CartTest {

    @Test
    public void testGameAddition() {
        Cart cart1 = new Cart();

        VideoGame newGame1 = new VideoGame("TestGame", "TestDev", "TestDate", 69.99, "TestGenre");

        cart1.addToCart(newGame1);

        assertEquals(1, cart1.gamesInCart.size());
        assertNotEquals(0, cart1.gamesInCart.size());
    }

    @Test
    public void testGameRemoval() {
        Cart cart2 = new Cart();

        VideoGame gameToRemove = new VideoGame("RemoveMe", "RemoveDev", "RemoveDate", 69.99, "RemoveGenre");
        VideoGame newGame2 = new VideoGame("TestGame2", "TestDev", "TestDateAgain", 69.99, "TestGenreAgain");

        cart2.addToCart(gameToRemove);
        cart2.addToCart(newGame2);

        cart2.removeFromCart(gameToRemove);

        assertEquals(1, cart2.gamesInCart.size());
        assertNotEquals(0, cart2.gamesInCart.size());
        assertNotEquals(2, cart2.gamesInCart.size());
    }

    @Test
    public void testTotalPriceCalculation() {
        Cart cart3 = new Cart();

        VideoGame newGame3 = new VideoGame("TestGame3", "TestDev", "TestDate3", 45.44, "TestGenre3");
        VideoGame newGame4 = new VideoGame("TestGame4", "TestDev", "TestDate4", 32.55, "TestGenre4");

        cart3.addToCart(newGame3);
        cart3.addToCart(newGame4);

        assertEquals(77.99, cart3.getTotalPrice());
        assertNotEquals(0, cart3.getTotalPrice());
        assertNotEquals(45.44, cart3.getTotalPrice());
        assertNotEquals(32.55, cart3.getTotalPrice());
    }
}
