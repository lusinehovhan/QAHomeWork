package com.company.Exercise9;

public class Exercise4Detect {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,6,7,8,9,10,11,12};
        System.out.println("The missing number is: " + detect(arr));
    }
    static int detect (int [] num){
        int n = num.length;
        int result = 0;
        for (int i = 0; i < n; i++) {
            if((num[i] - i) > 1){
                result = i+1;
                break;
            }
        }
       return result;
    }
}
