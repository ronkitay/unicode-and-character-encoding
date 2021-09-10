package org.ronkitay.lectures.encodings;

import java.nio.charset.StandardCharsets;

/**
 * @author Ron Kitay
 * @since 10-Sep-2021.
 */
public class Utf8Encoding {

    public static void main(String[] args) {
        demoStringAsUtf8("ABC");
        demoStringAsUtf8("אבג");
        demoStringAsUtf8("🤦🏽‍️");
        demoStringAsUtf8("😀");
    }

    private static void demoStringAsUtf8(String string) {
        System.out.printf("The string '%s' is represented as %s. Its length is %d characters.%n", string, showBytes(string),
                string.length());
    }

    private static String showBytes(String string) {
        byte[] bytes = string.getBytes(StandardCharsets.UTF_8);

        StringBuilder sb = new StringBuilder();
        sb.append('[');

        for (int i = 0; i < bytes.length; i++) {
            int res = bytes[i] & 0xFF;
            sb.append(Integer.toHexString(res).toUpperCase());
            sb.append(",");
        }

        sb.deleteCharAt(sb.length()-1);
        sb.append(']');

        return sb.toString();
    }


}
