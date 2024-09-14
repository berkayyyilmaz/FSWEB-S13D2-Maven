package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(numberToWords(-291));
    }

    public static boolean isPalindrome(int num){
        int number = Math.abs(num);
        String str = Integer.toString(number);
        String[] strArray = str.split("");
        String[] reverseArray = new String[strArray.length];
        for (int i = 0; i < strArray.length; i++) {
            reverseArray[i] = strArray[strArray.length - 1 - i];
        }
        return str.equals(String.join("", reverseArray));
    }

    public static boolean isPerfectNumber(int num){
        if (num < 0)
            return false;

        int total=0;
        for (int i=1 ; i<num ; i++){
            if (num % i == 0){
                total+=i;
            }
        }
        return (num == total);
    }

    public static String numberToWords(int number) {
        if(number<0) return "Invalid Value";
        String[] words = {"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
        String strNumber = Integer.toString(number);
        char[] charNumber = strNumber.toCharArray();
        String[] resultArray =new String[strNumber.length()];

        for (int i=0; i<strNumber.length(); i++){
            int num = Integer.parseInt(String.valueOf(charNumber[i]));
            resultArray[i] = words[num];
        }
        return String.join(" ",resultArray);
    }
}