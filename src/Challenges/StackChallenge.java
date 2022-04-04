package Challenges;

import java.util.LinkedList;

public class StackChallenge {

    public static void main(String[] args) {
        // should return true
        System.out.println(checkForPalindrome("abccba"));
        // should return true
        System.out.println(checkForPalindrome("Was it a car or a cat I saw?"));
        // should return true
        System.out.println(checkForPalindrome("I did, did I?"));
        // should return false
        System.out.println(checkForPalindrome("hello"));
        // should return true
        System.out.println(checkForPalindrome("Don't nod"));
    }

    public static boolean checkForPalindrome(String string) {
        //will back our stack with a linkedlist
        LinkedList<Character> stack = new LinkedList<>();
        String original ="";
        String reversed ="";

        for(int i =0;i<string.length();i++){
            char c = string.toLowerCase().charAt(i);
            //strip our string from spaces and punctuations
            //and push it onto the stack
            if (c >= 'a' && c<='z'){
                original = original + c;
                stack.push(c);
            }
        }
        //pop the characters
        while (!stack.isEmpty()){
            reversed = reversed + stack.pop();
        }

        //Check if its a palindrome
        if (original.equals(reversed)){
            return true;
        }
        return false;
    }

}
