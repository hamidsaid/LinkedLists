public class Fibonacci {

    public static void main(String [] args){
        //n! = n*(n-1)!;
        System.out.println(recursiveFib(8));
        System.out.println(fib(8));

    }

    public static int recursiveFib(int numb){
       if (numb == 0) return 0;
       if (numb == 1) return 1;
       return (recursiveFib(numb-2) + recursiveFib(numb-1));
    }

    public static int fib(int n)
    {
        int f[] = new int[100];
        f[0] = 0; f[1] = 1;
        for (int i= 2; i<= n; i++)
            f[i] = f[i-1] + f[i-2];
        return f[n];
    }


}





