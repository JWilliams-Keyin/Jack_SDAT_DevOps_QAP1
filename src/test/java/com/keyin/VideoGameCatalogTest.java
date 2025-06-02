package com.keyin;

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
