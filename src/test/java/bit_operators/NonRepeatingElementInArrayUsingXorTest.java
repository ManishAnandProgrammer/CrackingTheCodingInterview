package bit_operators;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class NonRepeatingElementInArrayUsingXorTest {

    @ParameterizedTest
    @MethodSource("inputs")
    void nonRepeatingIntegerInArray(int[] array, int expected) {
        NonRepeatingElementInArrayUsingXor nonRepeating = new NonRepeatingElementInArrayUsingXor();
        assertEquals(expected, nonRepeating.getOnlyNonRepeatingElement(array));
    }

    static Stream<Arguments> inputs() {
        return Stream.of(
                arguments(new int[] {1,2,3,4,5,4,3,2,1}, 5),
                arguments(new int[] {9,8,7,6,5,6,7,5,9,8,10}, 10),
                arguments(new int[] {23,24,25,26,99,26,25,24,23}, 99)
        );
    }
}
