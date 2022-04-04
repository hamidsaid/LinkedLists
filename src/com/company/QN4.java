package com.company;

public class QN4 {
    public static void main(String[] args) {
        insertItem(23, 0);
        insertItem(44, 1);
        insertItem(22,2);

    }

    public static void insertItem(int item, int location){
        int [] myArray= new int[3];
        myArray[location] = item;
    }

}
