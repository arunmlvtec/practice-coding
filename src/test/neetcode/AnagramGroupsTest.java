package test.neetcode;

import main.neetcode.AnagramGroups;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AnagramGroupsTest {
    AnagramGroups anagramGroups = new AnagramGroups();

    @Test
    void groupAnagramsTestEmpty() {
        String[] input = new String[0];
        List<List<String>> expected = new ArrayList<>();
        assertEquals(expected, anagramGroups.groupAnagrams(input));
    }
}