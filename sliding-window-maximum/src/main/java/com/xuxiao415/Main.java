package com.xuxiao415;

import java.util.Arrays;

/**
 * @author wangzhengkai3
 * @date 2021-01-29 08:53
 **/
public class Main {
    public static void main(String[] args) {
        int[] nums = {1,-1};
        int[] res = maxSlidingWindow(nums, 1);
        System.out.println(Arrays.toString(res));
    }
    public static int[] maxSlidingWindow(int[] nums, int k) {
        Node[] q = new Node[nums.length + 1];
        int head = 0, tail = 0;
        int[] res = new int[nums.length - k + 1];
        int m = 0;
        for (int i = 0; i < nums.length; i++) {
            while (head < tail && nums[i] >= q[tail - 1].val) {
                tail--;
            }

            q[tail++] = new Node(i, nums[i]);
            // 如果对头元素不在求解区间内，则将其踢出队列
            while (q[head].index <= i - k) {
                head++;
            }
            // 取队头作为极值
            if (i >= k - 1) {
                res[m++] = q[head].val;
            }
        }
        return res;
    }

    public static class Node {
        public int index;
        public int val;

        public Node(int index, int val) {
            this.index = index;
            this.val = val;
        }
    }
}
