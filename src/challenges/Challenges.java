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
        for (int i = 0; i < 100; i++) {
            numbers.add(i);
        }

        return numbers;
    }
}
