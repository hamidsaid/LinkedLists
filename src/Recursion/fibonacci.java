package Recursion;

public class fibonacci {
    public static void main(String [] args){
        System.out.println(fibonacciRecursively(12));
        System.out.println(fibonacciIteratively(12));
    }

    public static int fibonacciRecursively(int num){
        if (num == 1){
            return 1;
        }
        if (num == 0){
            return 0;
        }
        return fibonacciRecursively(num-1) + fibonacciRecursively(num-2);
    }

    public static int fibonacciIteratively(int num){
        int [] f = new int[num+1];
        f[0] = 0;
        f[1] =1;

        for (int i =2;i<=num;i++){
            f[i] = f[i-1] + f[i-2];
        }
        return f[num];
    }
}
