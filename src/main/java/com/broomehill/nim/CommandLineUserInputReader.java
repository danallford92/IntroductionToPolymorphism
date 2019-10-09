package com.broomehill.nim;

import java.util.Scanner;

public class CommandLineUserInputReader implements UserInputReader {

    @Override
    public int readNumberOfSticksToPickUp(String playerName) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(playerName + " how many sticks would you like to pick up?");

        try {
            int pickedUpSticks = scanner.nextInt();

            if (pickedUpSticks <= 3 && pickedUpSticks >= 1) {
                return pickedUpSticks;
            }
        } catch (Exception e) {
            System.out.println("Something to do with letter");
            return readNumberOfSticksToPickUp(playerName);
        }

        System.out.println("You entered the wrong number");

        return readNumberOfSticksToPickUp(playerName);
    }

    @Override
    public String getNameFor(String placeholder) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(placeholder + " what do you want to be called?");

        String playerName = scanner.nextLine();

        return playerName;
    }
}
