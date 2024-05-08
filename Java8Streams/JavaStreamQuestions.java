import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class JavaStreamQuestions {

    public static void main(String[] args) {
        
        // Question: Find the sum of all even numbers in a list using Java 8 Streams.

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int sumOfEvenNumbers = numbers.stream()
                                    .filter(n -> n % 2 == 0)
                                    .mapToInt(Integer::intValue)
                                    .sum();
        System.out.println("Sum of even numbers: " + sumOfEvenNumbers);
    
        // Question: Given a list of strings, find the count of strings starting with a specific prefix using Java 8 Streams.
        List<String> words = Arrays.asList("apple", "banana", "apricot", "grape", "orange", "apex");
        String prefix = "ap";
        long count = words.stream()
                        .filter(word -> word.startsWith(prefix))
                        .count();
        System.out.println("Count of strings starting with '" + prefix + "': " + count);

        // Convert a list of strings to uppercase using Java 8 Streams
        List<String> words2 = Arrays.asList("apple", "banana", "cherry", "date");
        List<String> upperCaseWords = words2.stream()
                                        .map(String::toUpperCase)
                                        .collect(Collectors.toList());
        System.out.println("Uppercase words: " + upperCaseWords);
        
        // Remove duplicate elements from a list using Java 8 Streams
        List<Integer> distinctNumbers = numbers.stream()
                                            .distinct()
                                            .collect(Collectors.toList());
        System.out.println("Distinct numbers: " + distinctNumbers);
        
        // Question: Sort a list of strings in descending order of length using Java 8 Streams
        List<String> sortedWords = words.stream()
                                    .sorted((s1, s2) -> Integer.compare(s2.length(), s1.length()))
                                    .collect(Collectors.toList());
        System.out.println("Words sorted by length (descending): " + sortedWords);

        // Question: Calculate the average of all numbers in a list using Java 8 Streams
        double average = numbers.stream()
                            .mapToDouble(Integer::doubleValue)
                            .average()
                            .orElse(0.0);
        System.out.println("Average: " + average);

        //Question : find the maximum number from the list
        int max = numbers.stream()
                        .mapToInt(Integer::intValue)
                        .max()
                        .orElse(0);
        System.out.println("Maximum number: " + max);

        //Question: Group a list of strings by their lengths using Java 8 Streams
        List<String> words3 = Arrays.asList("apple", "banana", "cherry", "date");
        Map<Integer, List<String>> groupsByLength = words3.stream()
                                                        .collect(Collectors.groupingBy(String::length));
        System.out.println("Groups by length: " + groupsByLength);

        // Question: Check if all elements in a list are greater than a specific value using Java 8
        int threshold = 3;
        boolean allGreaterThanThreshold = numbers.stream()
                                                .allMatch(n -> n > threshold);
        System.out.println("Are all numbers greater than " + threshold + "? " + allGreaterThanThreshold);


        // Question: Find the first element in a list using Java 8 Streams.
        Optional<String> firstElement = words.stream()
                                            .findFirst();
        System.out.println("First element: " + firstElement.orElse("List is empty"));

        // Question : Find out the usernames from list of emails

        List<String> emails = Arrays.asList("shiv@gmail.com","ram@gmail.com", "prem@gmail.com");

        emails.stream().map(x->x.split("@")[0]).forEach(System.out::println);

    }
}
