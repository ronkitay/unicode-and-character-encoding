package org.ronkitay.lectures.encodings;

import java.nio.charset.StandardCharsets;

import static org.ronkitay.lectures.encodings.BytesHelper.showBytes;

/**
 * @author Ron Kitay
 * @since 10-Sep-2021.
 */
public class AsciiEncoding {

    private static final byte LOWERCASE_A = 97;
    private static final byte UPPERCASE_A = 65;

    public static void main(String[] args) {
        backspaceDemo();
        spaceDemo();
        crlfDemo();
        lettersDemo();
    }


    private static void backspaceDemo() {
        var demoBackspaceWithoutOverwrite = new String(new byte[] {'h', 'e', 'l', 'l', 'o', 8, 8}, StandardCharsets.US_ASCII);
        System.out.printf("The string 'hello\\8\\8' is printed as: '%s' even though it has %d characters.%n",
                demoBackspaceWithoutOverwrite,
                demoBackspaceWithoutOverwrite.length());

        var demoBackspaceWithOverwrite = new String(new byte[] {'h', 'e', 'l', 'l', 'o', 8, 8, 'p'}, StandardCharsets.US_ASCII);
        System.out.printf("The string 'hello\\8\\8p' is printed as: '%s' even though it has %d characters.%n",
                demoBackspaceWithOverwrite,
                demoBackspaceWithOverwrite.length());
    }

    private static void spaceDemo() {
        var demoSpaceAsDecimal = new String(new byte[] {'h', 'e', 'l', 'l', 'o', 32, 'w', 'o', 'r', 'l', 'd'}, StandardCharsets.US_ASCII);
        System.out.printf("The string 'hello\\30world' is printed as: '%s'%n",
                demoSpaceAsDecimal);

        var demoSpaceAsHexaDecimal = new String(new byte[] {'h', 'e', 'l', 'l', 'o', 0x20, 'w', 'o', 'r', 'l', 'd'}, StandardCharsets.US_ASCII);
        System.out.printf("The string 'hello\\0x20world' is printed as: '%s'%n",
                demoSpaceAsHexaDecimal);

    }

    private static void crlfDemo() {
        crDemo();
        System.out.println("----------------------------------------");
        lfDemo();
    }

    private static void crDemo() {
        var carrigeReturnDemo = new String(new byte[] {'h', 'e', 'l', 'l', 'o', 13, 'w', 'o', 'r', 'l', 'd'}, StandardCharsets.US_ASCII);
        System.out.printf("The string 'hello\\13world' is printed as:%n%s%neven though it has %d characters.%n",
                carrigeReturnDemo,
                carrigeReturnDemo.length());
    }

    private static void lfDemo() {
        var lineFeedDemo = new String(new byte[] {'h', 'e', 'l', 'l', 'o', 10, 'w', 'o', 'r', 'l', 'd'}, StandardCharsets.US_ASCII);
        System.out.printf("The string 'hello\\10world' is printed as:%n%s%nThis may work differently depending on the platform!.%n",
                lineFeedDemo);
    }


    private static void lettersDemo() {
        lowercaseLettersDemo();
        uppercaseLettersDemo();
        toLowerDemo();
    }

    private static void uppercaseLettersDemo() {
        var uppercaseLettersDemo = new String(new byte[]{ UPPERCASE_A, (byte) ( UPPERCASE_A + 1), (byte) ( UPPERCASE_A + 2)},
                StandardCharsets.US_ASCII);
        System.out.printf("Uppercase letters: %s%n", uppercaseLettersDemo);
    }

    private static void lowercaseLettersDemo() {
        var lowercaseLettersDemo = new String(new byte[]{ LOWERCASE_A, (byte) ( LOWERCASE_A + 1), (byte) ( LOWERCASE_A + 2)},
                StandardCharsets.US_ASCII);
        System.out.printf("Lowercase letters: %s%n", lowercaseLettersDemo);
    }

    private static void toLowerDemo() {
        var toLowerDiff =  LOWERCASE_A - UPPERCASE_A;

        byte[] bytesForUppercase = {UPPERCASE_A, (byte) (UPPERCASE_A + 1), (byte) (UPPERCASE_A + 2)};
        var uppercaseLetters = new String(bytesForUppercase,StandardCharsets.US_ASCII);

        byte [] bytesForLowercase = new byte[bytesForUppercase.length];
        for (int i = 0; i < bytesForUppercase.length; i++) {
            bytesForLowercase[i] = (byte) (bytesForUppercase[i] + toLowerDiff);
        }

        var toLowerCaseDemo = new String(bytesForLowercase,StandardCharsets.US_ASCII);
        System.out.printf("Uppercase letters '%s' as lowercase are: %s%n", uppercaseLetters, toLowerCaseDemo);
    }

}
