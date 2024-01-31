import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
    @Test
    public void testReverseInPlace() {
        int[] input1 = {3};
        ArrayExamples.reverseInPlace(input1);
        assertArrayEquals(new int[] {3}, input1);
    }

    @Test
    public void newTestReverseInPlace() {
        int[] input2 = {1, 2, 3, 4, 5};
        ArrayExamples.reverseInPlace(input2);
        assertArrayEquals(new int[]{5, 4, 3, 2, 1}, input2);
    }

    @Test
    public void testReversed() {
        int[] input1 = {};
        assertArrayEquals(new int[] {}, ArrayExamples.reversed(input1));
    }

    @Test
    public void newTestReversed() {
        int[] input2 = {1, 2, 3, 4, 5};
        assertArrayEquals(new int[] {5, 4, 3, 2, 1}, ArrayExamples.reversed(input2));
    }

    @Test
    public void testAverageWithoutLowest() {
        double[] input1 = {};
        double[] input2 = {102};
        assertEquals(0, ArrayExamples.averageWithoutLowest(input1), 0);
        assertEquals(0, ArrayExamples.averageWithoutLowest(input2), 0);
    }
}
