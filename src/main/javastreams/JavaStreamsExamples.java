package main.javastreams;

import java.util.List;
import java.util.stream.Collectors;

public class JavaStreamsExamples {
    public List<Integer> intStreamSkipping(List<Integer> input) {
        return input
                .stream()
                .skip(5)
                .collect(Collectors.toList());
    }

    public Integer intStreamSum(List<Integer> input) {
        return input
                .stream()
                .mapToInt(Integer::intValue)
                .sum();
    }

    public String streamSortAndFindFirst(List<String> input) {
        return input
                .stream()
                .sorted()
                .findFirst()
                .orElse(null);
    }

    public List<String> streamFilterAndSort(List<String> input) {
        return input
                .stream()
                .filter(s -> s.startsWith("S"))
                .sorted()
                .collect(Collectors.toList());
    }
    public Double streamSquareAverage(List<Integer> input) {
        return input
                .stream()
                .mapToInt(integer -> integer * integer)
                .average().orElse(0.0);
    }
//    public static void main(String[] args) throws IOException {
//
//        // 7. Stream from List, filter and print
//        List<String> people = Arrays.asList("Al", "Ankit", "Brent", "Sarika", "amanda", "Hans", "Shivika", "Sarah");
//        people
//                .stream()
//                .map(String::toLowerCase)
//                .filter(x -> x.startsWith("a"))
//                .forEach(System.out::println);
//
//        // 8. Stream rows from text file, sort, filter, and print
//        Path path1 = Paths.get("/Users/apokharna/IdeaProjects/practice-coding/src/main/resources/javastreams/bands.txt");
//        Stream<String> bands = Files.lines(path1);
//        bands
//                .sorted()
//                .filter(x -> x.length() > 13)
//                .forEach(System.out::println);
//        bands.close();
//
//        // 9. Stream rows from text file and save to List
//        List<String> bands2 = Files.lines(path1)
//                .filter(x -> x.contains("jit"))
//                .collect(Collectors.toList());
//        bands2.forEach(x -> System.out.println(x));
//
//        // 10. Stream rows from CSV file and count
//        Path path = Paths.get("/Users/apokharna/IdeaProjects/practice-coding/src/main/resources/javastreams/data.txt");
//        Stream<String> rows1 = Files.lines(path);
//        int rowCount = (int) rows1
//                .map(x -> x.split(","))
//                .filter(x -> x.length == 3)
//                .count();
//        System.out.println(rowCount + " rows.");
//        rows1.close();
//
//        // 11. Stream rows from CSV file, parse data from rows
//        Stream<String> rows2 = Files.lines(path);
//        rows2
//                .map(x -> x.split(","))
//                .filter(x -> x.length == 3)
//                .filter(x -> Integer.parseInt(x[1]) > 15)
//                .forEach(x -> System.out.println(x[0] + "  " + x[1] + "  " + x[2]));
//        rows2.close();
//
//        // 12. Stream rows from CSV file, store fields in HashMap
//        Stream<String> rows3 = Files.lines(path);
//        Map<String, Integer> map = new HashMap<>();
//        map = rows3
//                .map(x -> x.split(","))
//                .filter(x -> x.length == 3)
//                .filter(x -> Integer.parseInt(x[1]) > 15)
//                .collect(Collectors.toMap(
//                        x -> x[0],
//                        x -> Integer.parseInt(x[1])));
//        rows3.close();
//        for (String key : map.keySet()) {
//            System.out.println(key + "  " + map.get(key));
//        }
//
//        // 13. Reduction - sum
//        double total = Stream.of(7.3, 1.5, 4.8)
//                .reduce(0.0, (Double a, Double b) -> a + b);
//        System.out.println("Total = " + total);
//
//        // 14. Reduction - summary statistics
//        IntSummaryStatistics summary = IntStream.of(7, 2, 19, 88, 73, 4, 10)
//                .summaryStatistics();
//        System.out.println(summary);
//    }
}
