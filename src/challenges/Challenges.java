package challenges;

import java.util.*;

public class Challenges {

    public String helloWorld() {
        return "Hello World!";
    }

    public List print100() {
        List numbers = new ArrayList();
        for (int i = 1; i <= 100; i++) {
            if(i % 3 == 0 && i % 5 == 0) { numbers.add("FizzBuzz"); }
            else if(i % 3 == 0) { numbers.add("Fizz"); }
            else if(i % 5 == 0) { numbers.add("Buzz"); }
            else { numbers.add(i); }
            System.out.println(numbers.get(i-1));
        }

        return numbers;
    }

    public List twoSum(int[] numbers, int target) {
        Map<Integer, Integer> visitedNumbers = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            // Delta is the number that completes the current number. Delta of 2 is 7, because 9 - 2 = 7.
            int delta = target - numbers[i];
            if (visitedNumbers.containsKey(delta)) {
                // If a delta is found in the map, return its position as well as the current index position.
                Integer[] indices = new Integer[] { visitedNumbers.get(delta), i };
                // Convert array to list and return.
                List indexes = Arrays.asList(indices);
                return indexes;
            }
            // Add key / value pair to map to check it for a delta in the next iteration.
            visitedNumbers.put(numbers[i], i);
        }
        // If no match is found...
        return new ArrayList(Arrays.asList(-1, -1));
    }

    public String reverseString(String str) {
        String reverse = new StringBuilder(str).reverse().toString();
        return reverse;
    }

    public boolean evenOrOdd() {
        return true;
    }
}
