package com.company;

public class QN3 {


    public static void main(String [] args){
        int [][] myArray= new int[3][3];
        for (int i = 0; i<myArray.length ; i++){
            for (int j = 0 ; j<myArray[i].length; j++){
                myArray[i][j] = i+j;
            }
        }
        //printing the 2 dmsnl
        for (int i = 0; i<myArray.length ; i++){
            for (int j = 0 ; j<myArray[i].length; j++){
                System.out.print(myArray[i][j] + " ");
            }
            System.out.println("\n");
        }
        //Printing the new one dmnsl
        int [] newArr = linearize(myArray);
        for (int i = 0; i<newArr.length; i++){
            System.out.print(newArr[i]);
        }

    }

    public static int[] linearize(int [][] arr){
        int [] myArr = new int[9];
        int k =0;
        for (int i = 0; i<arr.length ; i++){
            for (int j = 0 ; j<arr[i].length; j++){
                myArr[k] = arr[i][j];
                k++;
            }
        }

        return myArr;
    }
}
