package com.gj.exercise_5;

public class Exercise_61 {
    public int search (int[] nums, int target) {
        // write code here
        if (nums==null || nums.length==0){
            return -1;
        }
//        int left = firstbsearch(nums,target);
//        int rigth = lasrbsearch(nums,target);
//        if (left==-1 || rigth==-1){
//            return -1;
//        }
//        return rigth-left+1;
        int left = 0;
        int right = nums.length-1;
        while (left<=right){
            int mid = (left+right)/2;
            if (nums[mid]<target){
                left = mid+1;
            }else if (nums[mid]>target){
                right = mid-1;
            }else {
                if (mid!=0 && nums[mid]==nums[mid-1]){
                    right = mid-1;
                }else {
                    return mid;
                }
            }
        }
        return -1;


    }

    public int firstbsearch(int[] nums, int target){
        int left = 0;
        int right = nums.length-1;
        while (left<=right){
            int mid = (left+right)/2;
            if (nums[mid]<target){
                left = mid+1;
            }else if (nums[mid]>target){
                right = mid-1;
            }else {
                if (mid!=0 && nums[mid]==nums[mid-1]){
                    right = mid-1;
                }else {
                    return mid;
                }
            }
        }
        return -1;
    }

    public int lasrbsearch(int[] nums, int target){
        int left = 0;
        int right = nums.length-1;
        while (left<=right){
            int mid = (left+right)/2;
            if (nums[mid]<target){
                left = mid+1;
            }else if (nums[mid]>target){
                right = mid-1;
            }else {
                if (mid!=nums.length-1 && nums[mid]==nums[mid+1]){
                    left = mid+1;
                }else {
                    return mid;
                }
            }
        }
        return -1;
    }

}
