package com.sample;

public class SortIntList extends IntList {

	

	    private int[] list;
	    private int numElements = 0;
	    //-------------------------------------------------------------
	    // Constructor -- creates an integer list of a given size.
	    //-------------------------------------------------------------

	    public SortIntList(int size) {
	    	super(size);
	        list = new int[size];
	    }
	    //------------------------------------------------------------
	    // Adds an integer to the list. If the list is full,
	    // prints a message and does nothing.
	    //------------------------------------------------------------

	    public void add(int value)
	    {
	    	System.out.println("numElements" + numElements );
	     if(numElements == 0){
	        list[numElements] = value;
	        numElements++;

	     }
	     else{
	        list[numElements] = value;
	        for(int check = 0; check < numElements; check++){
	           if(list[check] > value){
	              for(int swap = numElements; swap> check; swap--){
	                 list[swap] = list[swap-1];
	              }
	              list[check] = value;

	              break;
	           }
	        }
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
