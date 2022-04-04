package com.company;

public class QN2 {

    public static void main(String[] args) {
        if (equals()){
            System.out.println("The two arrays are correspoding");
        } else{
            System.out.println("The two arrays are NOT correspoding");
        }


    }

    public static boolean equals(){
        int [][] myArray= new int[3][3];
        for (int i = 0; i<myArray.length ; i++){
            for (int j = 0 ; j<myArray[i].length; j++){
                myArray[i][j] = i+j;
            }
        }

        int [][] myArray2= new int[3][3];
        for (int i = 0; i<myArray2.length ; i++){
            for (int j = 0 ; j<myArray2[i].length; j++){
                myArray2[i][j] = i*j;
            }
        }

        for (int i = 0; i<myArray2.length ; i++){
            for (int j = 0 ; j<myArray2[i].length; j++){
                if (myArray[i][j] == myArray2[i][j]){
                    return true;
                }
            }
        }
        return false;
    }

}
