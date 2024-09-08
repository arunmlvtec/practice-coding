package test.neetcode;

import main.neetcode.ValidateParentheses;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class ValidateParenthesesTest {
    private final ValidateParentheses validateParentheses = new ValidateParentheses();

    @Test
    void isValidTestTrueWithEmptyString() {
        assertTrue(validateParentheses.isValid(""));
    }

    @Test
    void isValidTestTrueWithValidInput() {
        assertTrue(validateParentheses.isValid("([{}])"));
    }

    @Test
    void isValidTestFalseWithInvalidInput() {
        assertFalse(validateParentheses.isValid("[(])"));
    }

    @Test
    void isValidTestFalseWithIncompleteParantheses() {
        assertFalse(validateParentheses.isValid("["));
    }
}