package com.damianos.leetcodepractise;

public class Main {
    public static void main(String[] args) {
        // 1 Check list of Strings
        // 2 Check Arrays

        String name = "Damianos";
        String correctAnswer = "";

        String reversedName = ReverseString.reverseString(name);
        if (correctAnswer.equals(reversedName)) {
            System.out.println("Correct result");
        } else {
            System.out.println("Wrong result: " + reversedName + " __ " + correctAnswer);
        }
    }

}