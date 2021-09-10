package org.ronkitay.lectures.encodings;

import java.nio.charset.StandardCharsets;

/**
 * @author Ron Kitay
 * @since 10-Sep-2021.
 */
public class Utf16Encoding {

    public static void main(String[] args) {
        demoStringAsUtf16("ABC");
        demoStringAsUtf16("אבג");
        demoStringAsUtf16("🤦🏽‍️");
        demoStringAsUtf16("😀");
    }

    private static void demoStringAsUtf16(String string) {
        System.out.printf("The string '%s' is represented as %s. Its length is %d characters.%n", string, showBytes(string),
                string.length());
    }

    private static String showBytes(String string) {
        byte[] bytes = string.getBytes(StandardCharsets.UTF_16);

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
