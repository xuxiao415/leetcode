package com.xuxiao415;

/**
 * @author wangzhengkai3
 * @date 2021-02-20 14:18
 **/
public class Main {
    public static void main(String[] args) {
        System.out.println(minDistance("horse", "ros"));
    }
    public static int minDistance(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();
        // dp[i][j]表示word1前i个字符变成word2前j个字符的编辑距离
        int [][] dp = new int[m + 1][n + 1];
        for (int i = 0; i < m + 1; i++) {
            dp[0][i] = i;
        }
        for (int i = 0; i < n + 1; i++) {
            dp[i][0] = i;
        }
        for (int i = 1; i < m + 1; i++) {
            for (int j = 1; j < n + 1; j++) {
                // 如果word1[i]和word2[j]相等，则dp[i][j]与dp[i-1][j-1]相等
                // 取字符时i-1和j-1是因为i，j是从1开始的
                if (word1.charAt(i-1) == word2.charAt(j-1)) {
                    dp[i][j] = dp[i - 1][j - 1];
                } else {
                    // 删除，插入，替换操作都需要编辑距离加一，三者取最小即可
                    dp[i][j] = 1 + Math.min(dp[i -1][j-1], Math.min(dp[i-1][j], dp[i][j-1]));
                }
            }
        }
        return dp[m][n];
    }
}
