package main.rokt;

public class StringPattern {

    public static void main(String[] args) {
        System.out.println(areStringsEqual("r.kt", "rokt") == true);
        System.out.println(areStringsEqual("r.kt", "rokt") != true);

        System.out.println(areStringsEqual("r1kt", "rock") != true);
    }

    public static boolean areStringsEqual(String s1, String s2) {
        int s1Len = s1.length();
        int s2Len = s2.length();
        int i = 0;
        int j = 0;
        while (i < s1Len && j < s2Len) {
            char ch = s1.charAt(i);
            if (Character.isDigit(ch)) {
                StringBuilder sb = new StringBuilder();
                while (i < s1Len && Character.isDigit(s1.charAt(i))) {
                    sb.append(s1.charAt(i));
                    i += 1;
                }
                int jump = Integer.parseInt(sb.toString());
                i += jump;
                j += jump;
            } else {
                if (ch != s2.charAt(i)) {
                    return false;
                }
                i += 1;
                j += 1;
            }
        }
        return i == s1Len && j == s2Len;
    }
//
//    public static boolean areStringsEqual(String s1, String s2) {
//        int s1Len = s1.length();
//        int s2Len = s2.length();
//        int dotCount = 0;
//
//        int loopLength = Math.min(s1Len, s2Len);
//        int i = 0;
//        while (i < loopLength) {
//            if (s1.charAt(i) != s2.charAt(i) && s1.charAt(i) != '.' && s2.charAt(i) != '.') {
//                return false;
//            } else {
//                if (s1.charAt(i) == '.' || s2.charAt(i) == '.') {
//                    dotCount += 1;
//                }
//            }
//            i+= 1;
//        }
//        return true;
//    }
}
