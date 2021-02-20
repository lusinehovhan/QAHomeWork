package com.company.Exercise10;

public class Exercise1Substring {
    public static void main(String[] args) {
        String s = "Life is good!";
        System.out.println(partString(s, 3));
        System.out.println(partString(s, 2, 9));
    }
    static String partString(String str, int start){
        String str1 = "";
        for (int i = start; i <str.length() ; i++) {
            str1 = str1 + str.charAt(i);
        }
        return str1;
    }
    static String partString(String str, int start, int end){
        String str1 = "";
        for (int i = start; i <str.length() ; i++) {
            while(i <= end){
                str1 = str1 + str.charAt(i);
               break;
            }
        }
        return str1;
    }
}
