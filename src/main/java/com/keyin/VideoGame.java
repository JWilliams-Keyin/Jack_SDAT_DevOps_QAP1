package com.keyin;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

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

    // Getters & Setters


    public String getGameTitle() {
        return gameTitle;
    }

    public String getGameDeveloper() {
        return gameDeveloper;
    }

    public LocalDate getGameReleaseDate() {
        return gameReleaseDate;
    }

    public double getGamePrice() {
        return gamePrice;
    }

    public String getGamePlatforms() {
        return Arrays.deepToString(gamePlatforms);
    }

    public String getGameGenres() {
        return Arrays.deepToString(gameGenres);
    }

    public void setGameTitle(String gameTitle) {
        this.gameTitle = gameTitle;
    }

    public void setGameDeveloper(String gameDeveloper) {
        this.gameDeveloper = gameDeveloper;
    }

    public void setGameReleaseDate(LocalDate gameReleaseDate) {
        this.gameReleaseDate = gameReleaseDate;
    }

    public void setGamePrice(double gamePrice) {
        this.gamePrice = gamePrice;
    }

    public void setGamePlatforms(ArrayList<String>[] gamePlatforms) {
        this.gamePlatforms = gamePlatforms;
    }

    public void setGameGenres(ArrayList<String>[] gameGenres) {
        this.gameGenres = gameGenres;
    }
}
