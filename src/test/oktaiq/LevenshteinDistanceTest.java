package test.oktaiq;

import main.oktaiq.LevenshteinDistance;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LevenshteinDistanceTest {
    private final LevenshteinDistance levenshteinDistance = new LevenshteinDistance();

    @Test
    public void calculateLevenshteinDistanceForUnequalStringsTest() {
        assertEquals(4, levenshteinDistance.calculateLevenshteinDistance(
                "friend", "fight"));
    }

    @Test
    public void calculateLevenshteinDistanceForEqualStringsTest() {
        assertEquals(3, levenshteinDistance.calculateLevenshteinDistance(
                "friend", "fright"));
    }

    @Test
    public void calculateLevenshteinDistanceForOneNullStringTest() {
        assertEquals(6, levenshteinDistance.calculateLevenshteinDistance(
                "friend", null));
    }

    @Test
    public void calculateLevenshteinDistanceForBothNullStringsTest() {
        assertEquals(0, levenshteinDistance.calculateLevenshteinDistance(
                null, null));
    }

    @Test
    public void calculateLevenshteinDistanceForEmptyStringsTest() {
        assertEquals(0, levenshteinDistance.calculateLevenshteinDistance(
                "", ""));
    }

    @Test
    public void calculateLevenshteinDistanceForOneEmptyStringTest() {
        assertEquals(4, levenshteinDistance.calculateLevenshteinDistance(
                "", "null"));
    }
}