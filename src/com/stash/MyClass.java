package com.stash;

public class MyClass {
    public static void main(String args[]) {
        int someInt=153;
        String number = String.valueOf(someInt);
        char[] digits1 = number.toCharArray();
        String result="";
        for(int i=0;i<digits1.length;i++)
        {
            result=result+(String.valueOf(Math.pow((double) digits1[i],number.length())));
        }
        System.out.println(result);
    }
}
