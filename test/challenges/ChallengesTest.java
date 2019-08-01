package challenges;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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
}