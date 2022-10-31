package com.damianos.leetcodepractise;

public class ReverseString {

    // INPUT a _ b _ c
    // OUT   _ _ _ _ a
    //       _ _ b _ a
    //       c _ b _ a
    public static String reverseString(String value) {
        if (value == null) {
            return null;
        }

        int size = value.length() - 1;

        char[] valueCharacters = value.toCharArray();
        char[] outputArray = new char[value.length()];

        for (int i = 0; i <= size; i++) {
            outputArray[size - i] = valueCharacters[i];
        }

        return String.valueOf(outputArray);
    }

    // INPUT a _ b _ c
    // OUT   c _ _ _ a
    //       c _ b _ a
    public static String reverseStringB(String value) {
        int size = value.length() - 1;
        int half = value.length() / 2;

        char[] valueCharacters = value.toCharArray();

        for (int i = 0; i < half ; i++) {
            char temp = valueCharacters[i];
            valueCharacters[i] = valueCharacters[size - i];
            valueCharacters[size - i] = temp;
        }

        return String.valueOf(valueCharacters);
    }

    // INPUT a _ b _ c
    // OUT   c _ _ _ _
    //       c _ b _ _
    //       c _ b _ a
    public static String reverseStringC(String value) {
        int size = value.length() - 1;
        String result = "";

        char[] valueCharacters = value.toCharArray();

        for (int i = size; i >= 0; i--) {
            result += valueCharacters[i];
        }

        return result;
    }

    // INPUT a _ b _ c
    // OUT   c _ _ _ _
    //       c _ b _ _
    //       c _ b _ a
    public static String reverseStringD(char[] valueToCharArray) {
        int size = valueToCharArray.length; // Sto char[] gia na pareis to length den kaneis ti method length()
        String result = "";

        for (int i = size; i >= 0; i--) {
            result += valueToCharArray[i];
        }

        return result;
    }
}
