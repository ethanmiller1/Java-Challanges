package challenges;

import java.lang.reflect.Array;
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

    // Variable belongs to class, not instance.
    public static Integer count = 0;

    public boolean evenOrOdd() {
        count++;
        System.out.println(count);
        if(count % 2 == 0) {
            return true;
        } else {
            return false;
        }

    }

    public List fibonacci(int limit) {

        if (limit == 1) {
            return Arrays.asList(1);
        } else if (limit == 2) {
            return Arrays.asList(1, 1);
        }

        List output = new ArrayList();
        output.add(1);
        output.add(1);
        int fib1 = 1, fib2 = 1, fibonacci = 1;
        for (int i = 3; i <= limit; i++ ) {
            fibonacci = fib1 + fib2;
            // Increment
            fib1 = fib2;
            fib2 = fibonacci;
            output.add(fibonacci);
        }

        return output;
    }

    public boolean prime(int number) {
        if (number < 0) {
            return false;
        }
        if (number == 0 || number == 1) {
            return false;
        }
        if (number == 2 || number == 3) {
            return true;
        }
        if ((number * number - 1) % 24 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
