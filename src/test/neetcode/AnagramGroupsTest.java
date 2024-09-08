package test.neetcode;

import main.neetcode.AnagramGroups;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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

    @Test
    void groupAnagramsTestFilled() {
        String[] input = {"act","pots","tops","cat","stop","hat"};
        List<String> l1 = new ArrayList<>();
        l1.add("hat");
        List<List<String>> expected = new ArrayList<>(){};
        expected.add(l1);
        List<String> l2 = new ArrayList<>();
        l2.add("act");
        l2.add("cat");
        expected.add(l2);
        List<String> l3 = new ArrayList<>();
        l3.add("stop");
        l3.add("pots");
        l3.add("tops");
        expected.add(l3);
        assertTrue(compareLists(expected, anagramGroups.groupAnagrams(input)));
    }

    private static boolean compareLists(List<List<String>> list1, List<List<String>> list2) {
        if(list1.size() != list2.size()) {
            return false;
        }
        for (List<String> innerList: list1) {
            Collections.sort(innerList);
        }
        for (List<String> innerList: list2) {
            Collections.sort(innerList);
        }
        list1.sort(Comparator.comparing(Object::toString));
        list2.sort(Comparator.comparing(Object::toString));
        return list1.equals(list2);
    }
}