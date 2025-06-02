package com.keyin;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class PurchaseServiceTest {

    @Test
    public void testPurchaseGoesThrough() {
        Cart cart = new Cart();

        VideoGame newGame1 = new VideoGame("TestGame", "TestDev", "TestDate", 69.99, "TestGenre");
        VideoGame newGame2 = new VideoGame("TestGame2", "TestDev", "TestDate2", 20, "TestGenre2");

        cart.addToCart(newGame1);
        cart.addToCart(newGame2);

        PurchaseService purchaseService = new PurchaseService();

        Purchase purchase = purchaseService.makePurchase(cart);

        System.out.println(purchase);

        assertNotNull(purchase);
        assertEquals(89.99, purchase.getTotalPrice());
        assertEquals(2, purchase.getGamesInCart().size());
    }
}
