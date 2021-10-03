package org.ronkitay.lectures.encodings;

import java.nio.charset.Charset;

/**
 * @author Ron Kitay
 * @since 22-Sep-2021.
 */
public class BytesHelper {
    static String showBytes(String string, Charset charset) {
        byte[] bytes = string.getBytes(charset);

        return printBytes(bytes);
    }

    public static String printBytes(byte[] bytes) {
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
