package com.kele.ItemPool.items;

/**
 * @author: kele3601
 * @date: 2022/10/11 21:45
 * @description: 704. 二分查找
 */
public class Search704 {


    /**
     * 二分查找步骤：
     *      1. 找值：找到中位数
     *      2. 比较：比较大小
     *      3. 处理：if（num>target）{}else{}
     */
    public int search(int[] nums, int target) {
        int left = 0, right = nums.length - 1;

        while (left <= right) {
            int mid = (right - left) / 2 + left;
            int num = nums[mid];

            if (num == target) {
                return mid;
            } else if (num > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return -1;
    }

//    public int search(int[] nums, int target) {
//
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] == target) {
//                return i;
//            }
//        }
//        return -1;
//    }
}
