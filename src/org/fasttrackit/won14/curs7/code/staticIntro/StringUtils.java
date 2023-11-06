package org.fasttrackit.won14.curs7.code.staticIntro;

public class StringUtils {
    public static String replaceAndReverse(String input, String oldString, String newString) {
        String replacedString = input.replaceAll(oldString, newString);
        char[] letters = replacedString.toCharArray();
        StringBuilder result = new StringBuilder();
        for (int i = letters.length - 1; i >= 0; i--) {
            result.append(letters[i]);
        }
        return result.toString();
    }
}
