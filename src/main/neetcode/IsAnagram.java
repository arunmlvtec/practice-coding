package main.neetcode;

import java.util.HashMap;
import java.util.Map;

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
