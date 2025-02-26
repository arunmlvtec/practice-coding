package test.javastreams;

import main.javastreams.JavaStreamsExamples;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class JavaStreamsExamplesTest {
    private final JavaStreamsExamples jse = new JavaStreamsExamples();

    @Test
    public void testIntStreamSkipping() {
        List<Integer> expected = IntStream
                .rangeClosed(1, 10)
                .skip(5)
                .boxed()
                .collect(Collectors.toList());
        List<Integer> input = IntStream
                .rangeClosed(1, 10)
                .boxed()
                .collect(Collectors.toList());
        assertEquals(expected, jse.intStreamSkipping(input));
    }

    @Test
    public void testIntStreamSum() {
        Integer expected = IntStream
                .rangeClosed(1, 5)
                .sum();
        List<Integer> input = IntStream
                .rangeClosed(1, 5)
                .boxed()
                .collect(Collectors.toList());
        assertEquals(expected, jse.intStreamSum(input));
    }

    @Test
    public void testStreamSortAndFindFirst() {
        String expected = Stream
                .of("Ava", "Aneri", "Alberto")
                .sorted()
                .findFirst()
                .orElse(null);
        List<String> input = List.of("Ava", "Aneri", "Alberto");
        assertEquals(expected, jse.streamSortAndFindFirst(input));
    }

    @Test
    public void testStreamFilterAndSort() {
        List<String> expected = Stream
                .of("Al", "Ankit", "Kushal", "Brent", "Sarika", "amanda", "Hans", "Shivika", "Sarah")
                .filter(s -> s.startsWith("S"))
                .sorted()
                .collect(Collectors.toList());
        List<String> input = List.of("Al", "Ankit", "Kushal", "Brent", "Sarika", "amanda", "Hans", "Shivika", "Sarah");
        assertEquals(expected, jse.streamFilterAndSort(input));
    }

    @Test
    public void testStreamSquareAverage() {
        List<Integer> input = List.of(2, 4, 6, 8, 10);
        Double expected = Stream
                .of(2, 4, 6, 8, 10)
                .mapToInt(x -> x * x)
                .average()
                .orElse(0.0);
        assertEquals(expected, jse.streamSquareAverage(input));
    }
}