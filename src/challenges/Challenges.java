package challenges;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Challenges {

    public String helloWorld() {
        return "Hello World!";
    }

    public List print100() {
        List numbers = new ArrayList();
        for (int i = 1; i < 101; i++) {
            if(i % 3 == 0 && i % 5 == 0) { numbers.add("FizzBuzz"); }
            else if(i % 3 == 0) { numbers.add("Fizz"); }
            else if(i % 5 == 0) { numbers.add("Buzz"); }
            else { numbers.add(i); }
            System.out.println(numbers.get(i-1));
        }

        return numbers;
    }
}
