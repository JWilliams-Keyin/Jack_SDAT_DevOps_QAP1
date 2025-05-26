package com.keyin;

import java.time.LocalDate;
import java.util.ArrayList;

public class VideoGame {

    // Attributes

    public String gameTitle;
    public String gameDeveloper;
    public LocalDate gameReleaseDate;
    public double gamePrice;
    public ArrayList<String>[] gamePlatforms;
    public ArrayList<String>[] gameGenres;

    // Constructor

    public VideoGame(String gameTitle, String gameDeveloper, LocalDate gameReleaseDate, double gamePrice, ArrayList<String>[] gamePlatforms, ArrayList<String>[] gameGenres){
        this.gameTitle = gameTitle;
        this.gameDeveloper = gameDeveloper;
        this.gameReleaseDate = gameReleaseDate;
        this.gamePrice = gamePrice;
        this.gamePlatforms = gamePlatforms;
        this.gameGenres = gameGenres;
    }
}
