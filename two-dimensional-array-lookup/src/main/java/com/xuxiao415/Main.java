package com.xuxiao415;

/**
 * @author wangzhengkai3
 * @date 2021-01-25 16:17
 **/
public class Main {
    public static void main(String[] args) {
        //int[][] a = {{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}};
        int[][] a = null;
        System.out.println(find(7, a));
    }

    public static boolean find(int target, int[][] array) {
        if (array == null || array.length == 0) {
            return false;
        }
        int maxi = array.length;
        int maxj = array[0].length;
        int i = 0, j = maxj - 1;
        while (i < maxi && j >= 0) {
            if (array[i][j] == target) {
                return true;
            } else if (array[i][j] < target) {
                i ++;
            } else {
                j --;
            }
        }


        return false;
    }
}
