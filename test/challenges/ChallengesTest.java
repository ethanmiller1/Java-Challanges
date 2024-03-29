package challenges;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


public class ChallengesTest {

    Challenges challenges;

    @BeforeEach
    void init() {
        challenges = new Challenges();
    }

    @Test
    public void helloWorld() {
        assertEquals("Hello World!", challenges.helloWorld());
    }

    @Test
    public void print100() {
        List actual = new ArrayList();
        actual = challenges.print100();
        assertEquals(100, actual.size());
    }

    @Test
    public void twoSum() {
        int[] numbers = new int[] { 2, 7, 11, 15 };
        int target = 9;
        List expected = Arrays.asList(0, 1);
        assertEquals(expected, challenges.twoSum(numbers, target));

    }

    @Test
    public void twoSumTest2() {
        int[] numbers = new int[] { 2, 7, 11, 15 };
        int target = 22;
        List expected = Arrays.asList(1, 3);
        assertEquals(expected, challenges.twoSum(numbers, target));

    }

    @Test
    public void reverseString() {
        String expected = "olleH";
        String str = "Hello";
        assertEquals(expected, challenges.reverseString(str));
    }

    @Test
    public void evenReturnsTrue() {
        // Get everything in the state that it needs to be in.
        challenges.count = 1;
        assertTrue(challenges.evenOrOdd());
    }

    @Test
    public void evenReturnsFalse() {
        assertFalse(challenges.evenOrOdd());
    }

    @Test
    public void fibonacci() {
        List expected = Arrays.asList(1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144);
        int limit = 12;
        assertEquals(expected, challenges.fibonacci(limit));
    }

    @Test
    public void prime() {
        boolean expected = true;
        int number = 7;
        assertEquals(expected, challenges.prime(number));
    }
}