package test.leetcode;

import main.leetcode.RemoveDuplicatesFromAnArray;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveDuplicatesFromAnArrayTest {
    private final RemoveDuplicatesFromAnArray removeDuplicatesFromAnArray = new RemoveDuplicatesFromAnArray();

    @Test
    public void removeDuplicatesTest() {
        int[] nums = {1, 1, 2};
        int expected = 2;
        assertEquals(expected, removeDuplicatesFromAnArray.removeDuplicates(nums));
    }

    @Test
    public void removeDuplicates2Test() {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int expected = 5;
        assertEquals(expected, removeDuplicatesFromAnArray.removeDuplicates(nums));
    }
}