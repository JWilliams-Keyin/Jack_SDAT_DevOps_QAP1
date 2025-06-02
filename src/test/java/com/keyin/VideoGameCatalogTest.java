package com.keyin;

/* Author: Jack Williams
*  Dates: May 26th - June 1st
*  Description: The VideoGameCatalogTest class tests the size of
*  the availableGames ArrayList in VideoGameCatalog to make sure
*  all of the games are present */

import com.keyin.services.VideoGameCatalog;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class VideoGameCatalogTest {

    @Test
    public void testGameCatalogHasProperGames() {
        VideoGameCatalog gameCatalog = new VideoGameCatalog();

        assertEquals(10, gameCatalog.availableGames.size());
        assertNotEquals(0, gameCatalog.availableGames.size());
        assertNotNull(gameCatalog.availableGames);
    }
}
