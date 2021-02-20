package com.xuxiao415;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Stack;

/**
 * @author wangzhengkai3
 * @date 2021-01-25 20:24
 **/
public class Main {
    public static void main(String[] args) {

    }

    public static Character[] convertToInfixExpression(String expression) {
        Character[] result = new Character[expression.length()];
        Map<Character, Integer> level = new HashMap<>();
        level.put('|', 1);
        level.put('&', 1);
        Character leftBrace = '(';
        Character rightBrace = ')';
        Character whiteSpace = ' ';
        int k = 0;

        Stack<Character> tmp = new Stack<>();
        for (int i = 0; i < expression.length() - 1; i++) {
            Character c = expression.charAt(i);
            if (whiteSpace.equals(c)) {
                continue;
            } else if (leftBrace.equals(c)) {
                tmp.push(c);
            } else if (c.equals('0') || c.equals('1')) {
                result[k++] = c;
            } else if (c.equals('|')) {

            } else if (c.equals('&')) {

            }
        }




        char[] tmp = new char[expression.length()];
        int j = 0;
        int k = 0;
        for (int i = 0; i < expression.length() - 1; i++) {
            char c = expression.charAt(i);
            if (c >= 48 && c <= 57){
                result[k++] = c;
            } else if (c == '(') {
                tmp[j] = '(';
            } else if (c == ')') {

            }
        }
    }
}
