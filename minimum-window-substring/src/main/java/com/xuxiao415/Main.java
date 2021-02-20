package com.xuxiao415;

import java.util.HashMap;
import java.util.Map;

/**
 * @author wangzhengkai3
 * @date 2021-02-20 11:02
 **/
public class Main {
    public static void main(String[] args) {
        System.out.println(minWindow("aaaaaaaaaaaabbbbbcdd","abcdd"));
    }

    public static String minWindow(String s, String t) {
        int left = 0, right = 0;
        Map<Character, Integer> need = new HashMap<>();
        for (int i = 0; i < t.length(); i++) {
            need.put(t.charAt(i), need.getOrDefault(t.charAt(i), 0) + 1);
        }
        Map<Character, Integer> window = new HashMap<>();
        int start = 0, len = Integer.MAX_VALUE;
        int valid = 0;
        while (right < s.length()) {
            Character c = s.charAt(right++);
            if (need.containsKey(c)) {
                window.put(c, window.getOrDefault(c, 0) + 1);
                if (window.get(c).equals(need.get(c))) {
                    valid++;
                }
            }
            while (valid == need.size()) {
                if (right - left < len) {
                    start = left;
                    len = right - left;
                }
                Character ch = s.charAt(left++);
                if (need.containsKey(ch)) {
                    window.put(ch, window.getOrDefault(ch, 0) - 1);
                    if (window.get(ch) < need.get(ch)) {
                        valid--;
                    }
                }
            }
        }
        return len == Integer.MAX_VALUE ? "" : s.substring(start, start + len);
    }
}
