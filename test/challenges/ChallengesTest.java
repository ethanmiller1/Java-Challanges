package challenges;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class ChallengesTest {
    Challenges challenges;



    @Test
    public void helloWorld() {
        challenges = new Challenges();
        assertEquals("Hello World!", challenges.helloWorld());
    }
}