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
        List expected = new ArrayList();
        expected = Arrays.asList(0, 1);
        assertEquals(expected, challenges.twoSum());

    }
}