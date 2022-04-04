import com.company.Node;

import java.util.Scanner;

public class Rough {
    public static void main(String args[])
    {
        int n = 4;
        int arr[] = {1,2,3,4,5,6,7};
        System.out.println(addNum(arr,1));
    }

    public static int addNum (int arr[], int n) {
        if (n>arr.length) {
            return 0;
        }else if (n == 1) {
           return arr[0];
        }
        return arr[n-1] + addNum(arr,n-1);
    }



}


