package com.kele.ItemPool;

import java.util.Random;

/**
 * @author: kele3601
 * @date: 2022/10/12 22:04
 * @description:
 */
public class Solution {

    /**
     * @Description: 获取随机数组
     * @Date: 2022/10/12
     * @Author: kele3601
     */
    public int[] getRandomArray(boolean allBiggerZero, int length, int max) {
        Random random = new Random();
        int[] res = new int[random.nextInt(length)];
        for (int i = 0; i < res.length; i++) {
            if (allBiggerZero) {
                res[i] = random.nextInt(max);

            } else {
                res[i] = random.nextInt(max) - max / 2;
            }
        }
        return res;
    }

    /**
     * @Description: 展示数组
     * @Date: 2022/10/12
     * @Author: kele3601
     */
    public void showArray(int[] nums) {
        StringBuilder str = new StringBuilder("[");
        for (int i = 0; i < nums.length; i++) {
            str.append(nums[i]);

            if (i != nums.length - 1) {
                str.append(",");
            } else {
                str.append("]");
            }
        }
        System.out.println(str);
    }
}
