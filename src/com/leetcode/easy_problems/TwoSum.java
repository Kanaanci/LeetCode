package com.leetcode.easy_problems;

import java.util.HashMap;

/**
 * #1
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 *
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 *
 * Example:
 * Given nums = [2, 7, 11, 15], target = 9,
 * Because nums[0] + nums[1] = 2 + 7 = 9,
 * return [0, 1].
 */

public class TwoSum {

    public static int[] findTwoSum(){
        int[] nums = {1,5,3,8,4,6,2,4};
        int target = 9;
        int complement;

        HashMap<Integer, Integer> numsMap = new HashMap<Integer, Integer>();

        for(int i = 0; i < nums.length; i++){
            complement = target - nums[i];
            System.out.println("\nTarget = " + target  + "\nValue of index " + i + " = " + nums[i] + "\nComplement = " + complement);

            if(numsMap.containsKey(complement)) {
                System.out.println("[" + i + "," + numsMap.get(complement) + "]");
                return new int[] {i, numsMap.get(complement)};
            }
            numsMap.put(nums[i], i);
            System.out.println(numsMap);
        }
        throw new IllegalArgumentException("No sum solution");
    }
}
