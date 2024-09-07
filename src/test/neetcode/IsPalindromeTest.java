package test.neetcode;

import main.neetcode.IsPalindrome;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class IsPalindromeTest {
    private final IsPalindrome testPalindrome = new IsPalindrome();

    @Test
    void isPalindromeTestTrue() {
        assertTrue(testPalindrome.isPalindrome("Was it a car or a cat I saw?"));
    }

    @Test
    void isPalindromeTestFalse() {
        assertFalse(testPalindrome.isPalindrome("0P"));
    }
}