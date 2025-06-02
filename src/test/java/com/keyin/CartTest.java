package com.keyin;

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
}
