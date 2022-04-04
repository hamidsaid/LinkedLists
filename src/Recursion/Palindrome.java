package Recursion;

import java.util.Locale;

public class Palindrome {
    String string;
    static String reversedString = "";

    public static void main(String [] args){
      System.out.println(isPalindrome("level"));
    }

     static boolean isPalindrome(String s)
    {
        for(int i = s.length()-1;i>=0;i--){
            reversedString = reversedString + s.charAt(i);
        }
        if (reversedString.toLowerCase(Locale.ROOT).equals(s.toLowerCase())){
            return true;
        }else{
            return false;
        }
    }


}
