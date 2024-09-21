package main.neetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * Is Anagram
 * Given two strings s and t, return true if the two strings are anagrams of each other, otherwise return false.
 * An anagram is a string that contains the exact same characters as another string, but the order of the characters
 * can be different.
 * Example 1:
 * Input: s = "racecar", t = "carrace"
 * Output: true
 * Example 2:
 * Input: s = "jar", t = "jam"
 * Output: false
 * Constraints:
 * s and t consist of lowercase English letters.
 * */

public class IsAnagram {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Integer> charMap = new HashMap<>();
        for (Character c: s.toCharArray()) {
            charMap.put(c, charMap.getOrDefault(c, 0) + 1);
        }

        for (Character c: t.toCharArray()) {
            if (!charMap.containsKey(c)) {
                return false;
            } else {
                charMap.put (c, (charMap.get(c) - 1));
                if (charMap.get(c) < 0) {
                    return false;
                }
            }
        }

        for (Character c: charMap.keySet()) {
            if (charMap.get(c) != 0) {
                return false;
            }
        }
        return true;
    }
}
