package com.company.Exercise7;

public class Exercise1Sum {
    public static void main(String[] args) {
        String str = "6+7+8+9+5+23+56";
        String[] strArr = str.split("(?!^)\\b");
        int result = Integer.parseInt(strArr[0]);
        for (int i = 0; i < strArr.length; i++) {
            if(strArr[i].equals("+")) {
                result = result + Integer.parseInt(strArr[i+1]);
            }
        }
        String str1 = String.valueOf(result);
        System.out.println(str + " " + "=" + " " + str1);
    }
}
