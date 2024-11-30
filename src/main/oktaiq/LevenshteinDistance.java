package main.oktaiq;

/**
 * Write a java code function to calculate levenshtein distance?
 * Example: String1 = "fight" String2 = "friend"
 * Output = 4.
 * The reason for distance 4 is:
 * insert r to get "fright"
 * substitute g for e to get "frieht"
 * substitute h for n to get "frient"
 * substitute t for d to get "friend"
 *
 */
public class LevenshteinDistance {
    public int calculateLevenshteinDistance(String str1, String str2) {
        if (str1 == null && str2 == null) {
            return 0;
        }
        if (str1 == null || str1.isEmpty()) {
            return str2.length();
        }
        if (str2 == null || str2.isEmpty()) {
            return str1.length();
        }

        int[][] dpArr = new int[str1.length() + 1][str2.length() + 1];
        for (int i = 0; i <= str1.length(); i++) {
            dpArr[i][0] = i;
        }
        for (int i = 0; i <= str2.length(); i++) {
            dpArr[0][i] = i;
        }

        for (int i = 1; i <= str1.length(); i++) {
            for (int j = 1; j <= str2.length(); j++) {
                if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    dpArr[i][j] = dpArr[i - 1][j - 1];
                } else {
                    dpArr[i][j] = 1 + Math.min(
                            dpArr[i - 1][j - 1],
                            Math.min(
                                    dpArr[i][j - 1],
                                    dpArr[i - 1][j]
                            )
                    );
                }
            }
        }
        return dpArr[str1.length()][str2.length()];
    }
}
