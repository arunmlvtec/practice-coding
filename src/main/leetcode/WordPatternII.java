package main.leetcode;

/**
 * 291. Word Pattern II
 * <p></p>
 * Given a pattern and a string s, return true if s matches the pattern.
 * A string s matches a pattern if there is some bijective mapping of single characters to non-empty strings such that if each character in pattern is replaced by the string it maps to, then the resulting string is s. A bijective mapping means that no two characters map to the same string, and no character maps to two different strings.
 * <p></p>
 *
 * Example 1:
 * Input: pattern = "abab", s = "redblueredblue"
 * Output: true
 * Explanation: One possible mapping is as follows:
 * 'a' -> "red"
 * 'b' -> "blue"
 * <p></p>
 *
 * Example 2:
 * Input: pattern = "aaaa", s = "asdasdasdasd"
 * Output: true
 * Explanation: One possible mapping is as follows:
 * 'a' -> "asd"
 * <p></p>
 *
 * Example 3:
 * Input: pattern = "aabb", s = "xyzabcxzyabc"
 * Output: false
 * <p></p>
 *
 * Constraints:
 * 1 <= pattern.length, s.length <= 20
 * pattern and s consist of only lowercase English letters.
 */

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class WordPatternII {
    public boolean wordPatternMatch(String pattern, String s) {
        // Maps to track character to string mapping and vice versa
        Map<Character, String> charToStr = new HashMap<>();
        Set<String> mappedStrs = new HashSet<>();

        return backtrack(pattern, 0, s, 0, charToStr, mappedStrs);
    }

    private boolean backtrack(String pattern, int pIndex, String s, int sIndex,
                              Map<Character, String> charToStr, Set<String> mappedStrs) {
        // Base case: if we've processed the entire pattern and string
        if (pIndex == pattern.length() && sIndex == s.length()) {
            return true;
        }

        // If either pattern or string is exhausted but not both, return false
        if (pIndex == pattern.length() || sIndex == s.length()) {
            return false;
        }

        char currentChar = pattern.charAt(pIndex);

        // If the character is already mapped
        if (charToStr.containsKey(currentChar)) {
            String mappedStr = charToStr.get(currentChar);

            // Check if the mapped string appears at the current position
            if (sIndex + mappedStr.length() > s.length() ||
                    !s.substring(sIndex, sIndex + mappedStr.length()).equals(mappedStr)) {
                return false;
            }

            // Continue with the next character in pattern
            return backtrack(pattern, pIndex + 1, s, sIndex + mappedStr.length(),
                    charToStr, mappedStrs);
        }

        // If character is not mapped, try all possible substrings
        for (int end = sIndex + 1; end <= s.length(); end++) {
            String substring = s.substring(sIndex, end);

            // Skip if this substring is already mapped to another character
            if (mappedStrs.contains(substring)) {
                continue;
            }

            // Create new mapping
            charToStr.put(currentChar, substring);
            mappedStrs.add(substring);

            // Continue with this mapping
            if (backtrack(pattern, pIndex + 1, s, end, charToStr, mappedStrs)) {
                return true;
            }

            // Backtrack if this mapping doesn't work
            charToStr.remove(currentChar);
            mappedStrs.remove(substring);
        }

        return false;
    }

    public static void main(String[] args) {
        WordPatternII wp2 = new WordPatternII();

        // Test examples
        System.out.println(wp2.wordPatternMatch("abab", "redblueredblue")); // true
        System.out.println(wp2.wordPatternMatch("aaaa", "asdasdasdasd")); // true
        System.out.println(wp2.wordPatternMatch("aabb", "xyzabcxzyabc")); // false
    }
}
