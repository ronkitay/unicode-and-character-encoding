package org.ronkitay.lectures.encodings;

import java.nio.charset.StandardCharsets;

/**
 * @author Ron Kitay
 * @since 10-Sep-2021.
 */
public class Iso8859Encoding {

    public static void main(String[] args) {
        demoStringAsIso8859("ABC");
        demoStringAsIso8859("אבג");
        demoStringAsIso8859("🤦🏽‍️");
        demoStringAsIso8859("😀");
    }

    private static void demoStringAsIso8859(String string) {
        System.out.printf("The string '%s' is represented as %s. Its length is %d characters.%n", string, showBytes(string),
                string.length());
    }

    private static String showBytes(String string) {
        byte[] bytes = string.getBytes(StandardCharsets.ISO_8859_1);

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
