public class Prac {


    public static void main(String[] args) {
        String string2 = "madakm";
        if (isPalindrome(string2))
            System.out.println(string2 + " is a palindrome");
        else
            System.out.println(string2 + " is not a palindrome");

        System.out.println(zeros(1200012));
    }

    public static boolean isPalindrome(String s) {

        // if the string has one or zero characters then recursive call is stopped.
        if (s.length() == 0 || s.length() == 1)
            return true;

        // checking the first and last character of the string. if equals then call the
        // same function with substring from index 1 to length -1. Because substring
        // excludes the endIndex.
        // if these two values are not same then string is not Palindrome so this
        // returns false.
        if (s.charAt(0) == s.charAt(s.length() - 1))
            return isPalindrome(s.substring(1, s.length() - 1));

        // this statment is executed if and if only first and last character of string
        // at any time is not equal.
        return false;
    }

    public static int zeros(int numb){
        if (numb ==0){
            return 1;
        }else if(numb<10 && numb >-10){
            return 0;
        }else{
            return zeros(numb/10) + zeros(numb%10);
        }
    }


}
