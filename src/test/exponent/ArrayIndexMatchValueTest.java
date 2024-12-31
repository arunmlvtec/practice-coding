package test.exponent;

import main.exponent.ArrayIndexMatchValue;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ArrayIndexMatchValueTest {
    private ArrayIndexMatchValue aimv = new ArrayIndexMatchValue();

    @Test
    void indexEqualsValueSearchTestMiddleValue() {
        assertEquals(2, aimv.indexEqualsValueSearch(new int[]{-8, 0, 2, 5}));
    }

    @Test
    void indexEqualsValueSearchTestLastValue() {
        assertEquals(3, aimv.indexEqualsValueSearch(new int[]{-8, 0, 1, 3}));
    }

    @Test
    void indexEqualsValueSearchTestValueNotPresent() {
        assertEquals(-1, aimv.indexEqualsValueSearch(new int[]{-8, 0, 1, 4}));
    }

    @Test
    void indexEqualsValueSearchTestFirstValue() {
        assertEquals(0, aimv.indexEqualsValueSearch(new int[]{0, 10, 12, 19, 33}));
    }
}