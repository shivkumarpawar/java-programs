import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;


public class CountOccurrencesInString {

    public static void main(String[] args) {
        

    String input = "one two two three three three four four four four";

    String[] inputArray = input.split(" ");
    List<String> inputList = Arrays.asList(inputArray);

    Map<String, Long> map = inputList.stream().collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new, Collectors.counting()));

    System.out.println(map);

}
}