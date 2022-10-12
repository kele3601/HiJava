package com.kele.ItemPool.items;

/**
 * @author: kele3601
 * @date: 2022/10/11 23:27
 * @description: 27. 移除元素
 */
public class RemoveElement27 {

    /**
    * @Description:
    * @Date: 2022/10/11
    * @Author: kele3601
    */
    public int removeElement(int[] nums, int val) {
        int slow = 0;
        for (int fast = 0; fast < nums.length; fast++) {
            if (nums[fast] != val) {
                nums[slow] = nums[fast];
                slow++;
            }
        }
        return slow;
    }
}
