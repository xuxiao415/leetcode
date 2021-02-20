package com.xuxiao415;

/**
 * @author wangzhengkai3
 * @date 2021-02-01 13:48
 **/
public class Main {
    public static void main(String[] args) {

    }
    public int rob(int[] nums) {
        int a = 0;
        int b = 0;
        for (int i = 0; i < nums.length; i++) {
            int tmp = b;
            b = Math.max(a + nums[i], b);
            a = tmp;
        }
        return b;
    }
}
