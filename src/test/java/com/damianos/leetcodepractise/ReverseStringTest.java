package com.damianos.leetcodepractise;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ReverseStringTest {

    @Test
    void reverseString() {
        String input = "Damianos";
        String output = "sonaimad";
        String result = ReverseString.reverseString(input);
        Assertions.assertEquals(result, output);
    }

    @Test
    void reverseString_not_equal() {
        String input = "Damianos";
        String output = "onaimaD";
        String result = ReverseString.reverseString(input);
        Assertions.assertNotEquals(result, output);
    }
}
