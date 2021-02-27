package com.company.Exercise11;

public class Exercise3RecursionPolindrome {
    public static void main(String[] args) {
        System.out.println(palindrome("rtyytr"));
    }
    static boolean palindrome(String s) {
        if (s.length() == 0 || s.length() == 1) {
            return true;
        }
        if (s.charAt(0) == s.charAt(s.length() - 1)) {
            return palindrome(s.substring(1, s.length() - 1));
        }
        return false;
    }
}
