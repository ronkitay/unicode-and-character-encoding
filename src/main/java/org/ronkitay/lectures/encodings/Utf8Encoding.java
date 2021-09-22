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
        System.out.printf("The string '%s' is represented as %s. Its length is %d characters.%n", string, BytesHelper.showBytes(string, StandardCharsets.UTF_8),
                string.length());
    }


}
