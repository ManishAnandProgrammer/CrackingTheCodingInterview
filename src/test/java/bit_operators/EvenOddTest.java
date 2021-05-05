package bit_operators;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ArgumentsSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.function.Supplier;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class EvenOddTest {

    private EvenOdd evenOdd;

    @BeforeEach
    void init() {
        evenOdd = new EvenOdd();
    }

    @ParameterizedTest
    @DisplayName("Is Number Odd")
    @ValueSource(ints = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21})
    void isOdd(int argument) {
        assertFalse(evenOdd.isEven(argument), () -> argument + " must be Odd");
    }

    @ParameterizedTest
    @DisplayName("Is Number Even")
    @ValueSource(ints = {2, 4, 6, 8, 10, 12, 14, 2000, 2212, 842})
    void isEven(int argument) {
        assertTrue(evenOdd.isEven(argument), () -> argument + " must be Even");
    }
}
