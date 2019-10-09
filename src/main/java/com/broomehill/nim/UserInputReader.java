package com.broomehill.nim;

public interface UserInputReader {

    /**
     * The returned value must be a valid number of sticks (1, 2 or 3)
     * @return number of sticks the user wants to pick up.
     * @param s
     */
    int readNumberOfSticksToPickUp(String s);

    /**
     *
     * @param playerName - this will be displayed to the user
     * @return
     */
    String getNameFor(String playerName);


}
