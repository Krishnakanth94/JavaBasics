package com.arrays.prblms;

/*      Given an array of integers A sorted in non-decreasing order, return an array of the squares of each number, also in sorted non-decreasing order.
*
*
*
*        Example 1:
*        Input: [-4,-1,0,3,10]
*        Output: [0,1,9,16,100]
*
*        Example 2:
*        Input: [-7,-3,2,3,11]
*        Output: [4,9,9,49,121]
*
*
*        Note:
*        1 <= A.length <= 10000
*        -10000 <= A[i] <= 10000
*        A is sorted in non-decreasing order.
*/
public class SquaresofaSortedArray {
    public static void main(String[] args) {
      int[] A={-4,-1,0,3,10};
        int[] tempResult=new int[A.length];
        for(int i=0;i<A.length;i++){
            tempResult[i]=A[i]*A[i];
        }
        for(int i=0;i<tempResult.length;i++){
            for(int j=i+1;j<tempResult.length;j++){
                if(tempResult[i]>tempResult[j]){
                    int k=tempResult[i];
                    tempResult[i]=tempResult[j];
                    tempResult[j]=k;
                }
            }
        }
      for(int a:tempResult){
          System.out.println(a);
      }
    }
}
