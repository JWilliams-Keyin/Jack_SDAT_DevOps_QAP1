package com.keyin;

import java.util.ArrayList;
import java.util.Arrays;

public class VideoGameCatalog {

    // Attributes

    ArrayList<VideoGame> availableGames;

    // Constructor

    public VideoGameCatalog() {
        availableGames = new ArrayList<>();

        VideoGame game1 = new VideoGame("Doom: The Dark Ages", "Id Software", "May 15th, 2025", 89.99, "FPS");
        VideoGame game2 = new VideoGame("Subnautica", "Unknown Worlds Entertainment", "January 23rd, 2018", 39.99, "Survival");
        VideoGame game3 = new VideoGame("Elder Scrolls IV: Oblivion - Remastered", "Virtuos, Bethesda Game Studios", "April 22nd, 2025", 66.99, "RPG");
        VideoGame game4 = new VideoGame("Super Mario Bros. Wonder", "Nintendo", "October 20th, 2023", 79.99, "Platformer");
        VideoGame game5 = new VideoGame("Sonic Frontiers", "Sonic Team", "November 8th, 2022", 79.99, "Platformer");
        VideoGame game6 = new VideoGame("The Last Of Us Part 2", "Naughty Dog", "June 19th, 2020", 50.00, "Action-adventure");
        VideoGame game7 = new VideoGame("Mario Kart World", "Nintendo", "June 5th, 2025", 109.99, "Racing");
        VideoGame game8 = new VideoGame("Cyberpunk 2077", "CD Projekt RED", "December 10th, 2020", 79.99, "RPG");
        VideoGame game9 = new VideoGame("Sid Meier's Civilization VI", "Firaxis Games", "October 21st, 2016", 39.99, "Strategy");
        VideoGame game10 = new VideoGame("Pikmin 4", "Nintendo", "July 21st, 2023", 79.99, "Strategy");

        availableGames.add(game1);
        availableGames.add(game2);
        availableGames.add(game3);
        availableGames.add(game4);
        availableGames.add(game5);
        availableGames.add(game6);
        availableGames.add(game7);
        availableGames.add(game8);
        availableGames.add(game9);
        availableGames.add(game10);
    }

    // Getter

    public ArrayList<VideoGame> getAvailableGames() {
        return availableGames;
    }

    // Methods

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();

        for (VideoGame videoGame : availableGames) {
            stringBuilder.append(videoGame.toString()).append("\n");
        }

        return stringBuilder.toString();
    }
}
