package com.broomehill.nim;

public class Main {

    public static void main(String[] args) {
        UserInputReader userInputReader = null; // Create an implementation of UserInputReader to read from the command line

        String player1Name = userInputReader.getNameFor("Player 1");
        String player2Name = userInputReader.getNameFor("Player 2");

        Game game = new Game(player1Name, player2Name);

        while(!game.isComplete()) {
            int numberOfSticks = userInputReader.readNumberOfSticksToPickUp(game.currentPlayerName());
            game.pickUpSticks(numberOfSticks);
        }

        System.out.println(game.winner());
    }
}
