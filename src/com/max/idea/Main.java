package com.max.idea;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        double a = 5.4;
        byte b = 127;

        int[] nums = {1, 2, 3, 4, 5};
        int temp = nums[0];
        nums[0] = nums[nums.length - 1];
        nums[nums.length - 1] = temp;
        System.out.println(nums[0] + nums[nums.length / 2]);
    }
}
