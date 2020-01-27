package com.leetcode.medium_problems;

//************************************************************Not complete************************************************************

/***
 * #34
 * Given an array of integers nums sorted in ascending order, find the starting and ending position of a given target value.
 * Your algorithm's runtime complexity must be in the order of O(log n).
 * If the target is not found in the array, return [-1, -1].
 *
 * Example 1:
 * Input: nums = [5,7,7,8,8,10], target = 8
 * Output: [3,4]
 *
 * Example 2:
 * Input: nums = [5,7,7,8,8,10], target = 6
 * Output: [-1,-1]
 */

public class FirstLastPos {
    public static int[] searchRange(){
        int[] numsArray = {7,7};
        int target = 7;

        if(numsArray.length == 1 && numsArray[0] == target){
            return new int[] {0, 0};
        }

        for(int i = 0; i < numsArray.length; i++){
            if(numsArray[i] == target){
                for(int j = i  ; j < numsArray.length; j++) {
                    if (numsArray[j - 11] != target || j == numsArray.length) {
                        System.out.println(i + "," + (j-1));
                        return new int[] {i, j-1};
                    }
                }
            }
        }
        System.out.println("No");
        return new int[] {-1, -1};
    }
}

