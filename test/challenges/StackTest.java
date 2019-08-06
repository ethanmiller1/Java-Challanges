package challenges;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackTest {

    // Declare stack object.
    Stack stack;

    @BeforeEach
    public void init() {
        stack = new Stack(10);
    }

    @Test
    public void push() {
        // Arrange
        stack.push(1);

        // Actions
        Object result = stack.peak();

        // Assert
        assertEquals(1, result);
    }

    @Test
    public void pop() {
        // Arrange
        stack.push("First");
        stack.push("Second");

        // Act
        Object pop = stack.pop();
        Object peak = stack.peak();

        // Assert
        assertEquals("First", peak);
        assertEquals("Second", pop);
    }
}