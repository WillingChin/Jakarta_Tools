package com.tools.xin.util;

/**
 * @author XIN_CHEN
 * @date 3/7/2023 2:59 AM
 * @version 2023.3
 */
public class CircleNumber {

    String num = "①②③④⑤⑥⑦⑧⑨⑩⑪⑫⑬⑭⑮⑯⑰⑱⑲⑳";
    Integer length = num.length();

    public static char getCircleNumber(int digit){
        int firstCircle = 9311+digit;
        return (char)firstCircle;
    }
}
