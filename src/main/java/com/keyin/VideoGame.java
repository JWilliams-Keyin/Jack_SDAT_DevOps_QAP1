package com.keyin;

public class VideoGame {

    // Attributes

    public String gameTitle;
    public String gameDeveloper;
    public String gameReleaseDate;
    public double gamePrice;
    public String gameGenre;

    // Constructor

    public VideoGame(String gameTitle, String gameDeveloper, String gameReleaseDate, double gamePrice, String gameGenre){
        this.gameTitle = gameTitle;
        this.gameDeveloper = gameDeveloper;
        this.gameReleaseDate = gameReleaseDate;
        this.gamePrice = gamePrice;
        this.gameGenre = gameGenre;
    }

    // Getters & Setters


    public String getGameTitle() {
        return gameTitle;
    }

    public String getGameDeveloper() {
        return gameDeveloper;
    }

    public String getGameReleaseDate() {
        return gameReleaseDate;
    }

    public double getGamePrice() {
        return gamePrice;
    }

    public String getGameGenre() {
        return gameGenre;
    }

    public void setGameTitle(String gameTitle) {
        this.gameTitle = gameTitle;
    }

    public void setGameDeveloper(String gameDeveloper) {
        this.gameDeveloper = gameDeveloper;
    }

    public void setGameReleaseDate(String gameReleaseDate) {
        this.gameReleaseDate = gameReleaseDate;
    }

    public void setGamePrice(double gamePrice) {
        this.gamePrice = gamePrice;
    }

    public void setGameGenre(String gameGenres) {
        this.gameGenre = gameGenres;
    }

    // Methods

    public String toString() {
        return gameTitle + " " +
                "(" + "Developer: " + gameDeveloper + ")" + " "  +
                "(" + "Release Date: " + gameReleaseDate + ")" + " " +
                "(" + "Price: " + gamePrice + ")" + " " +
                "(" + "Genres: " + gameGenre + ")";
    }
}
