package com.lh.lhj;

import java.util.Arrays;

/**
 * 给你一个数组 nums 和一个值 val，你需要 原地 移除所有数值等于 val 的元素，并返回移除后数组的新长度。
 * <p>
 * 不要使用额外的数组空间，你必须仅使用 O(1) 额外空间并 原地 修改输入数组。
 * <p>
 * 元素的顺序可以改变。你不需要考虑数组中超出新长度后面的元素。
 * <p>
 * 示例 1:
 * <p>
 * 给定 nums = [3,2,2,3], val = 3,
 * <p>
 * 函数应该返回新的长度 2, 并且 nums 中的前两个元素均为 2。
 * <p>
 * 你不需要考虑数组中超出新长度后面的元素。
 */
public class RemoveElement {

    public static int removeElement(int[] nums, int val) {
        //平民愚蠢解法
        int j = 0;
        int num1[] = new int[nums.length];
        int num2[]=new int [0];
        int z = nums.length;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                num1[j++] = nums[i];
                z--;
            }
        }
        return num2.length;

//官方解法
//               int j=0;
//        for(int i=0;i<nums.length;i++){
//            if(nums[i]!=val){
//                nums[j++]=nums[i];
//            }
//        }
//
//        int num1[]=Arrays.copyOf(nums,j);
//        return  j;
    }
}
