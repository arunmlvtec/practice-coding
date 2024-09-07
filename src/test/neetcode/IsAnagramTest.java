package test.neetcode;

import main.neetcode.IsAnagram;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
/**
 * Is Anagram
 *
 * Given two strings s and t, return true if the two strings are anagrams of each other,
 * otherwise return false.
 * An anagram is a string that contains the exact same characters as another string,
 * but the order of the characters can be different.
 *
 * Example 1:
 * Input: s = "racecar", t = "carrace"
 * Output: true
 *
 * Example 2:
 * Input: s = "jar", t = "jam"
 * Output: false
 *
 * Constraints:
 * s and t consist of lowercase English letters.
 *
 * */

public class IsAnagramTest {
    private final IsAnagram isAnagramTest = new IsAnagram();

    @Test
    public void isAnagramTestTrue() {
        String s = "carrace";
        String t = "racecar";
        assertTrue(isAnagramTest.isAnagram(s, t));
    }

    @Test
    public void isAnagramTestFalse() {
        String s = "jar";
        String t = "jam";
        assertFalse(isAnagramTest.isAnagram(s, t));
    }
}
