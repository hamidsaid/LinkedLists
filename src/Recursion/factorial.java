package Recursion;

public class factorial {
    static int res=1;
    static int baseCase = 1;

    public static void main(String[] args) {
        //calculate the factorial of a number iteratively

        System.out.println(factorialIteratively(5));
        System.out.print(factorialRecursively(5));

    }

    public static int factorialIteratively(int numb) {

        if (numb == 0) {
            return 1;
        }
        for (int n=1;n<=numb;n++){
            res *= n;
        }
      return res;
    }

    public static int factorialRecursively(int numb){
        if (numb == 0) {
            return 1;
        }
        return numb * factorialRecursively(numb-1);
    }



}