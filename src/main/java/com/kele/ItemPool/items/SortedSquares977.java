package com.kele.ItemPool.items;

import java.util.Arrays;

/**
 * @author: kele3601
 * @date: 2022/10/12 21:49
 * @description: 977. 有序数组的平方
 */
public class SortedSquares977 {

    /**
    * @Description: 双指针（外 -> 内）：左右指针选择更大的一个，倒置放于新数组中
    * @Date: 2022/10/12
    * @Author: kele3601
    */
    public int[] sortedSquares2(int[] nums) {
        int l = 0, r = nums.length - 1, index = nums.length - 1;
        int[] res = new int[nums.length];

        while (index >= 0) {
            if (nums[l] * nums[l] > nums[r] * nums[r]) {
                res[index] = nums[l] * nums[l];
                l++;
            } else {
                res[index] = nums[r] * nums[r];
                r--;
            }
            index--;
        }
        return res;
    }

    /**
    * @Description: 暴力：1. 取平方 2. 排序
    * @Date: 2022/10/12
    * @Author: kele3601
    */
    public int[] sortedSquares1(int[] nums) {
        int[] num = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            num[i] = nums[i] * nums[i];
        }

        Arrays.sort(num);
        return num;
    }
}
