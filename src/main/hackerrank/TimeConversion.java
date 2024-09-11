package main.hackerrank;

public class TimeConversion {
    public String timeConversion(String s) {
        int hr = (Integer.parseInt(s.substring(0,2))) % 12;;
        if (s.charAt(8) == 'P') {
            hr += 12;
        }
        String outTime = hr + "";
        if (hr < 10) {
            outTime = "0" + hr;
        }
        return outTime + s.substring(2, 8);
    }
}
