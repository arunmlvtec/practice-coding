package test.hackerrank;

import main.hackerrank.TimeConversion;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TimeConversionTest {
    private final TimeConversion timeConversion = new TimeConversion();

    @Test
    public void testTimeConversionAM() {
        String time = "12:40:22AM";
        assertEquals("00:40:22", timeConversion.timeConversion(time));
    }

    @Test
    public void testTimeConversionPM() {
        String time = "07:05:45PM";
        assertEquals("19:05:45", timeConversion.timeConversion(time));
    }

}