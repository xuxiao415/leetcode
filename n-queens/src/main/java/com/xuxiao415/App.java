package com.xuxiao415;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println(solveNQueens(4));
    }
    public  static List<List<String>> solveNQueens(int n) {
        List<List<String>> res = new ArrayList<>();
        List<List<String>> path = new ArrayList<>();
        List<String> tmp = new ArrayList<>();
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < n; i++) {
                tmp.add(".");
            }
            path.add(tmp);
            tmp = new ArrayList<>();
        }
        getRest(res, path, 0);
        return res;
    }

    public static void getRest(List<List<String>> res, List<List<String>> path, int row) {
        if (row == path.size()) {
            List<String> tmp = new ArrayList<>();
            for (int i = 0; i < path.size(); i++) {
                tmp.add(String.join("", path.get(i)));
            }
            res.add(tmp);
            return;
        }

            for (int j = 0; j < path.size(); j++) {
                if (!isValid(path, row, j)) {
                    continue;
                }
                path.get(row).set(j, "Q");
                getRest(res, path, row + 1);
                path.get(row).set(j, ".");
            }

    }

    public static boolean isValid(List<List<String>> path, int m, int n) {
        for (int i = m-1; i >= 0; i--) {
            if ("Q".equals(path.get(i).get(n))) {
                return false;
            }
        }
        for (int i = n-1; i >= 0; i--) {
            if ("Q".equals(path.get(m).get(i))) {
                return false;
            }
        }
        for (int i = m-1, j = n-1; i >= 0 && j >= 0; j--, i--) {
            if ("Q".equals(path.get(i).get(j))) {
                return false;
            }
        }

        for (int i = m -1, j = n + 1; i >= 0 && j < path.size(); j++, i--) {
            if ("Q".equals(path.get(i).get(j))) {
                return false;
            }
        }
        return true;
    }
}
