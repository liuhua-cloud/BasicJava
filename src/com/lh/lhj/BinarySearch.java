package com.lh.lhj;

public class BinarySearch {
    public static int search(int[] nums, int target) {
        //方法一
        int left=0;
        int right=nums.length-1;
        int mid;
        while(left<=right){
            mid=left+(right-left)/2;
            if(nums[mid]>target){
                right=mid-1;
            }else if(nums[mid]<target){
                left=mid+1;
            }else
                return mid;
        }
    return -1;

        //方法二
//        for (int i=0;i<nums.length;i++){
//            if(nums[i]==target){
//                return i;
//            }
//        }
//        return -1;



    }
}
