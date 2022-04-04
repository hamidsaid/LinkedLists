package Recursion;

public class zeros {
    public static void main(String [] args) {
        System.out.println(zeros(805));
    }

    static int zeros(int numb){
        if(numb==0)          // 1 digit (zero/non-zero):
            return 1;         // bottom out.
        else if(numb < 10 && numb > -10)
            return 0;
        else                 // > 1 digits: recursion
            return zeros(numb/10) + zeros(numb%10);
    }

}
