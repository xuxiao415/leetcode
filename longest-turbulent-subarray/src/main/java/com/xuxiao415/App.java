package com.xuxiao415;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
    public static int maxTurbulenceSize(int[] arr) {
        int[] up = new int[arr.length];
        int[] down = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            up[i] = 1;
            down[i] =1;
        }
        int res = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i - 1]) {
                up[i] = down[i-1] + 1;
            }
            else if (arr[i] < arr[i - 1]) {
                down[i] = up[i-1] + 1;
            } else {
                up[i] = 1;
                down[i] = 1;
            }
            res = Math.max(res, Math.max(up[i], down[i]));
        }
        return res;
    }

    public static int maxTurbulenceSizeNew(int[] arr) {
        int up = 1;
        int down = 1;

        int res = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i - 1]) {
                up = down + 1;
                down = 1;
            }
            else if (arr[i] < arr[i - 1]) {
                down = up + 1;
                up = 1;
            } else {
                up = 1;
                down = 1;
            }
            res = Math.max(res, Math.max(up, down));
        }
        return res;
    }
}
