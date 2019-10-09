package com.broomehill.nim;

public class Game {

    private int remainingSticks = 30;
    private int counter = 1;
    private String player1Name;
    private String player2Name;

    public Game(String player1Name, String player2Name) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;
    }

    public boolean isComplete() {
        return remainingSticks<=0;
    }

    public String currentPlayerName() {
        if(counter % 2 != 0) {
            return player1Name;
        }
        return player2Name;
    }

    public void pickUpSticks(int numberOfSticks) {
        remainingSticks -= numberOfSticks;

        counter++;
    }

    public int getRemainingSticks() {
        return remainingSticks;
    }

    public String winner() {
        return currentPlayerName();
    }
}
