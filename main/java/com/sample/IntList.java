package com.sample;

public class IntList {

    private int[] list;
    private int numElements = 0;
    //-------------------------------------------------------------
    // Constructor -- creates an integer list of a given size.
    //-------------------------------------------------------------

    public IntList(int size) {
        list = new int[size];
    }
    //------------------------------------------------------------
    // Adds an integer to the list. If the list is full,
    // prints a message and does nothing.
    //------------------------------------------------------------

    public void add(int value) {
        if (numElements == list.length) {
            System.out.println("Can't add, list is full");
        } else {
            list[numElements] = value;
            numElements++;
        }
    }

    //-------------------------------------------------------------
    // Returns a string containing the elements of the list with their
    // indices.
    //-------------------------------------------------------------
    public String toString() {
        String returnString = "";
        for (int i = 0; i < numElements; i++) {
            returnString += i + ": " + list[i] + "\n";
        }
        return returnString;
    }
}
