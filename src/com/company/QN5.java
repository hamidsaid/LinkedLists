package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class QN5 {
    public static void main(String[] args) {
     int [] myArr = {64,12,23,20,92};

     System.out.println("Original Array: "
                + Arrays.toString(myArr));

     myArr = deleteItem(myArr,2);

     System.out.println("Resultant Array: "
                + Arrays.toString(myArr));
    }

    public static int[] deleteItem(int [] arr, int location){
        int [] newArr = new int[arr.length-1];

        for (int i=0,j=0 ; i<arr.length;i++){
            if (i == location){
                continue;
            }
            newArr[j] = arr[i];
            j++;
        }

        return newArr;

    }



}
