package com.arrays;

public class ExampleArray {
    public static void main(String[] args) {
        JavaInt[] intarr=new JavaInt[10];
        for (int i=0;i<intarr.length;i++){
            JavaInt intArrVal = new JavaInt(i*i);
             intarr[i]=intArrVal;
        }
        for (int i=1;i<intarr.length+1;i++){
            System.out.println(intarr[i].value);
        }
    }
}
