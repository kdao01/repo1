package com.sample;

public class ListTest
{
public static void main(String[] args)
{
IntList myList = new IntList(10);
myList.add(100);
myList.add(50);
myList.add(200);
myList.add(25);
System.out.println(myList);


IntList myList2 = new SortIntList(10);
myList2.add(100);
myList2.add(50);
myList2.add(200);
myList2.add(25);
System.out.println(myList2);


}
}