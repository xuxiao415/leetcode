package com.xuxiao415;

/**
 * @author wangzhengkai3
 * @date 2021-01-25 16:52
 **/
public class Main {
    public static void main(String[] args) {

    }

    public static String replace(StringBuffer stringBuffer) {
        StringBuffer res = new StringBuffer();
        for (int i = 0; i < stringBuffer.length(); i++) {
            if (stringBuffer.charAt(i) == ' ') {
                stringBuffer.append("%20");
            } else {
                stringBuffer.append(stringBuffer.charAt(i));
            }
        }
        return res.toString();
    }
}
