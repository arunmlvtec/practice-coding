package main.neetcode;

/**
 * Is Palindrome
 * Given a string s, return true if it is a palindrome, otherwise return false.
 * A palindrome is a string that reads the same forward and backward.
 * It is also case-insensitive and ignores all non-alphanumeric characters.
 * Example 1:
 * Input: s = "Was it a car or a cat I saw?"
 * Output: true
 * Explanation: After considering only alphanumerical characters we have "wasitacaroracatisaw", which is a palindrome.
 * Example 2:
 * Input: s = "tab a cat"
 * Output: false
 * Explanation: "tabacat" is not a palindrome.
 * Constraints:
 * 1 <= s.length <= 1000
 * s is made up of only printable ASCII characters.
 *  */
public class IsPalindrome {
    public boolean isPalindrome(String s) {
        int start = 0;
        int end = s.length()-1;
        while (start < end) {
            if (isAlphaNumeric(s.charAt(start))) {
                start++;
            } else if (isAlphaNumeric(s.charAt(end))) {
                end--;
            } else if(Character.toLowerCase(s.charAt(start)) != Character.toLowerCase(s.charAt(end))) {
                return false;
            } else {
                start++;
                end--;
            }
        }
        return true;
    }

    private boolean isAlphaNumeric(char c) {
        return ((c < 65 || c > 90) &&
                (c < 97 || c > 122) &&
                (c < 48 || c > 57));
    }
}
