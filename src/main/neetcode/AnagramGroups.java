package main.neetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Anagram Groups
 * Given an array of strings strs, group all anagrams together into sublists. You may return the output in any order.
 * An anagram is a string that contains the exact same characters as another string, but the order of the characters
 * can be different.
 *
 * Example 1:
 * Input: strs = ["act","pots","tops","cat","stop","hat"]
 * Output: [["hat"],["act", "cat"],["stop", "pots", "tops"]]
 *
 * Example 2:
 * Input: strs = ["x"]
 * Output: [["x"]]
 *
 * Example 3:
 * Input: strs = [""]
 * Output: [[""]]
 *
 * Constraints:
 * 1 <= strs.length <= 1000.
 * 0 <= strs[i].length <= 100
 * strs[i] is made up of lowercase English letters.
 *
 */

public class AnagramGroups {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anagramsMap = new HashMap<>();
        if (strs == null || strs.length == 0) {
            new ArrayList<>();
        }
        for (String word: strs) {
            int[] charCount = new int[26];
            for (Character c : word.toCharArray()) {
                charCount[c - 'a']++;
            }
            String key = String.valueOf(charCount);
            if (!anagramsMap.containsKey(key)) {
                anagramsMap.put(key, new ArrayList<>());
            }
            anagramsMap.get(key).add(word);
        }
        return new ArrayList<>(anagramsMap.values());
    }
}
