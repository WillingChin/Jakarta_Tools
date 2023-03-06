package com.tools.xin.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author XIN_CHIN
 * @version 2023.3
 * @date 3/7/2023 3:00 AM
 */
public class String2Numeric {

    /**
     * 过滤非数字
     *
     * @param str
     * @return
     */
    public static String getNumeric(String str) {
        str = str.trim();
        String str2 = "";
        if (str != null && !"".equals(str)) {
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) >= 48 && str.charAt(i) <= 57) {
                    str2 = str.charAt(i) + "";
                }
            }
        }
        return str2;
    }

    /**
     * 过滤非数字
     *
     * @param str
     * @return
     */
    public static String getNumeric2(String str) {
        String regEx = "[^0-9]";
        Pattern p = Pattern.compile(regEx);
        Matcher m = p.matcher(str);
        String result = m.replaceAll("").trim();

        return result;
    }


    /**
     * 过滤非数字和小数点
     *
     * @param str
     * @return
     */
    public static String getNumericPoints(String str) {
        char[] charArr = str.toCharArray();
        String result = "";
        for (int i = 0; i < charArr.length; i++) {
            if (("0123456789.").indexOf(charArr[i]) != -1) {
                result += charArr[i] + "";
            }
        }
        return result;
    }


}
