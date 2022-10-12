package com.kele.ItemPool;

import org.junit.Test;

import java.util.Arrays;
import java.util.Random;

/**
 * @author: kele3601
 * @date: 2022/10/12 22:04
 * @description:
 */
public class Solution {

    @Test
    public void test(){
        int[] nums = getRandomArray(10,10);
        Arrays.sort(nums);
        showArray(nums);
        int[] res = sortedSquares(nums);
        showArray(res);
    }

    public int[] sortedSquares(int[] nums) {
        int mid = 0;
        while (nums[mid]<0&&mid< nums.length-1){
            mid++;
        }

        int index = 0,r = mid ,l = r-1;
        int[] res = new int[nums.length];
        while (r< nums.length||l>=0){
            if (nums[l]*nums[l]>nums[r]*nums[r]){
                res[index++] = nums[r]*nums[r];
                r++;
            }else {
                res[index++] = nums[l]*nums[l];
                l--;
            }
        }
        return res;
    }

    /**
    * @Description: 获取随机数组
    * @Date: 2022/10/12
    * @Author: kele3601
    */
    private int[] getRandomArray(int length,int max){
        Random random = new Random();
        int[] res = new int[random.nextInt(length)];
        for (int i = 0; i < res.length; i++) {
            res[i] = random.nextInt(max)-max/2;
        }
        return res;
    }

    /**
    * @Description: 展示数组
    * @Date: 2022/10/12
    * @Author: kele3601
    */
    private void showArray(int[] nums){
        StringBuilder str = new StringBuilder("[");
        for (int i = 0; i < nums.length; i++) {
            str.append(nums[i]);

            if (i!= nums.length-1){
                str.append(",");
            }else {
                str.append("]");
            }
        }
        System.out.println(str);
    }
}
