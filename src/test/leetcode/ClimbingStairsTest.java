package test.leetcode;

import main.leetcode.ClimbingStairs;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClimbingStairsTest {
    private final ClimbingStairs climbingStairs = new ClimbingStairs();

    @Test
    void climbStairsTest() {
        assertEquals(2, climbingStairs.climbStairs(2));
        assertEquals(3, climbingStairs.climbStairs(3));
        assertEquals(5, climbingStairs.climbStairs(4));
    }
}