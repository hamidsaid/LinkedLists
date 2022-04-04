package com.company;


public class Main {

    public static void main(String[] args) {

      if(isRagged()){
          System.out.println("\nThe array is Ragged");
      } else{
          System.out.println("\nThe array is NOT Ragged");
      }

    }

    public static boolean isRagged(){

        int [][] myArray= new int[3][];
        myArray[0] = new int[3];
        myArray[1] = new int[3];
        myArray[2] = new int[3];

        for (int i = 0; i<myArray.length ; i++){
            for (int j = 0 ; j<myArray[i].length; j++){
                myArray[i][j] = i+j;
            }
        }
        for (int i = 0; i<myArray.length ; i++){
            System.out.println("\n");
            for (int j = 0 ; j<myArray[i].length; j++){
                System.out.print(myArray[i][j] + " ");
            }
        }

        for (int i = 0; i<myArray.length-1 ; i++) {
            if (myArray[i].length != myArray[i + 1].length) {
                return true;
            }
        }
        return false;
    }


}
