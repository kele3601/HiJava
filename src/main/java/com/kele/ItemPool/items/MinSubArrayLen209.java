package com.kele.ItemPool.items;

import com.kele.ItemPool.Solution;
import org.junit.Test;

/**
 * @author: kele3601
 * @date: 2022/10/12 23:40
 * @description:
 */
public class MinSubArrayLen209 extends Solution {

    @Test
    public void test() {
//        int[] nums = getRandomArray(true,10,10);
        int[] nums = {2, 3, 1, 2, 4, 3};
        showArray(nums);
        System.out.println(minSubArrayLen(7, nums));
    }

    public int minSubArrayLen(int target, int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int res = Integer.MAX_VALUE, l = 0, r = 0, sum = 0;

        while (r < nums.length) {
            sum += nums[r];
            while (sum >= target) {
                res = Math.min(res, r - l + 1);
                sum -= nums[l++];
            }
            r++;
        }
        return res == Integer.MAX_VALUE ? 0 : res;
    }

    public int minSubArrayLen0(int target, int[] nums) {
        int length = 100000;
        for (int l = 0; l < nums.length; l++) {
            int r = l, sum = nums[l];
            while (sum < target && r < nums.length - 1) {
                r++;
                sum += nums[r];
            }
            if (sum >= target) {
                length = Math.min(r - l + 1, length);
            }
        }
        return length == 100000 ? 0 : length;
    }
}
