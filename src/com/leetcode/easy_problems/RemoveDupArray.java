package com.leetcode.easy_problems;

/**
 * #26
 *Given a sorted array nums, remove the duplicates in-place such that each element appear only once and return the new length.
 *Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
 *
 *Example:
 *  Given nums = [1,1,2],
 *  Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively.
 *  It doesn't matter what you leave beyond the returned length.
**/

public class RemoveDupArray {

    public static int removeDups() {
        int sortedArray[] = {1, 1, 1, 3, 3, 3, 6, 6, 6, 7, 8, 9, 10, 10, 11};
        int i = 0;
        if (sortedArray.length == 0 || sortedArray.length == 1) {
            return sortedArray.length;
        }
        for (int j = 1; j < sortedArray.length; j++) {
            if(sortedArray[i] != sortedArray[j]){
                i++;
                sortedArray[i] = sortedArray[j];
            }
        }
        return i + 1;
    }
}
