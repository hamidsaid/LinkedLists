package Recursion;

public class binary_search {

    public static void main(String [] args){
      int [] data = {1,2,4,5,6,7,8,9};
      System.out.println(binarySearchRecusively(data,0,data.length-1,6));
      System.out.println(binarySearchIteratively(data,6));
      System.out.println(sequentialSearchIteratively(data,6));

    }


    public static int binarySearchRecusively(int []data,int firstIndex,int lastIndex, int value) {
        int middle = (firstIndex + lastIndex) / 2;

        if (data[middle] == value) {
            return middle;

        }else if (firstIndex > lastIndex){
            return -1;
        }else if(data[middle] > value){
            return binarySearchRecusively(data,firstIndex,middle,value);
        } else if (data[middle] < value ){
            return binarySearchRecusively(data,middle+1,lastIndex,value);
        }

        return 0;
    }

    public static int sequentialSearchIteratively(int []data, int value){
        for (int i =0;i<data.length;i++){
            if(value == data[i]){
                return i;
            }
        }
        return -1;
    }

    public static int binarySearchIteratively(int []data, int value){

        int first, last;
        first = 0;
        last = data.length - 1;
        while (true) {
            int middle = (first + last) / 2;
            if (data[middle] == value)
                 return middle;
            else if (first >= last)
                return -1;
            else if (value < data[middle])
                last = middle - 1;
            else
                first = middle + 1;
            }

    }


    }


