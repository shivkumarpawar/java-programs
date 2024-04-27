import java.util.Arrays;
import java.util.List;

public class FindMissingNumber {
  
public static void main(String[] args) {
    
    final List<Integer> list = Arrays.asList(1,2,3,4,5,7,8,9);

    // if range is given 1-100 
    int currentSum = 0;
    int actualSum = 0;

    for(int i : list){

        currentSum+= i;
    }

    System.out.println(currentSum);
    for(int i = 1; i<=9; i++){
        actualSum += i;
    }
  
    System.out.println(actualSum-currentSum);

   } 
}

// we can also solve this question by using natural number sum or XOR operation
