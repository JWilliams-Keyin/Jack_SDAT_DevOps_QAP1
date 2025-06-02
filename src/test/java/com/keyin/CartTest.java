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
}
