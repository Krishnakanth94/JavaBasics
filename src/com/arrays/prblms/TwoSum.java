package com.arrays.prblms;


/*       Given an array of integers, return indices of the two numbers such that they add up to a specific target.
*
*        You may assume that each input would have exactly one solution, and you may not use the same element twice.
*
*        Example:
*        Given nums = [2, 7, 11, 15], target = 9,
*
*        Because nums[0] + nums[1] = 2 + 7 = 9,
*        return [0, 1].
*/


import java.util.jar.JarEntry;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr={2, 7, 11, 15};
        int[] res=new int[2];
        for (int i=0;i<arr.length;i++){
            for(int j = i+1; j< arr.length; j++){
                if(arr[i]+arr[j]==9){
                    res[0]=i;
                    res[1]=j;
                }
            }
        }
        for(int i:res){
            System.out.println(i);
        }
        
    }
}
