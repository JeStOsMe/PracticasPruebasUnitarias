package co.com.sofka.app.calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class BasicCalculatorTest {
    
    private final BasicCalculator basicCalculator = new BasicCalculator();

    @Test
    @DisplayName("Testing sum: 1+1=2")
    public void sum() {
        // Arrange
        Long number1 = 1L;
        Long number2 = 1L;
        Long expectedValue = 2L;

        // Act
        Long result = basicCalculator.sum(number1, number2);

        // Assert
        assertEquals(expectedValue, result);
    }

    @DisplayName("Testing several sums")
    @ParameterizedTest(name = "{0} + {1} = {2}")
    @CsvSource({
            "0,    1,   1",
            "1,    2,   3",
            "49,  51, 100",
            "1,  100, 101"
    })
    public void severalSums(Long first, Long second, Long expectedResult) {
        assertEquals(expectedResult, basicCalculator.sum(first, second),
                first + " + " + second + " should equal " + expectedResult);
    }

    //Para Resta
    @Test
    @DisplayName("Testing subtract: 1-1=0")
    public void subtract() {
        // Arrange
        Long number1 = 1L;
        Long number2 = 1L;
        Long expectedValue = 0L;

        // Act
        Long result = basicCalculator.subtract(number1, number2);

        // Assert
        assertEquals(expectedValue, result);
    }

    @DisplayName("Testing several subtracts")
    @ParameterizedTest(name = "{0} - {1} = {2}")
    @CsvSource({
            "0,    1,   -1",
            "1,    2,   -1",
            "51,  49, 2",
            "0,  0, 0"
    })
    public void severalSubtracts(Long first, Long second, Long expectedResult) {
        assertEquals(expectedResult, basicCalculator.subtract(first, second),
                first + " - " + second + " should equal " + expectedResult);
    }

    //Para multiplicación
    @Test
    @DisplayName("Testing multiply: 2*2=4")
    public void multiply() {
        // Arrange
        Long number1 = 2L;
        Long number2 = 2L;
        Long expectedValue = 4L;

        // Act
        Long result = basicCalculator.multiply(number1, number2);

        // Assert
        assertEquals(expectedValue, result);
    }

    @DisplayName("Testing several sums")
    @ParameterizedTest(name = "{0} * {1} = {2}")
    @CsvSource({
            "0,    1,   0",
            "1,    2,   2",
            "7,  5, 35",
            "0,  0, 0",
            "1,  1,  1"
    })
    public void severalMultiplications(Long first, Long second, Long expectedResult) {
        assertEquals(expectedResult, basicCalculator.multiply(first, second),
                first + " * " + second + " should equal " + expectedResult);
    }

    //Para división
    @Test
    @DisplayName("Testing divide: 1/1=1")
    public void divide() {
        // Arrange
        Long number1 = 1L;
        Long number2 = 1L;
        Double expectedValue = 1.0;

        // Act
        Double result = basicCalculator.divide((double)number1, (double)number2);

        // Assert
        assertEquals(expectedValue, result);
    }

    @DisplayName("Testing several divisons")
    @ParameterizedTest(name = "{0} / {1} = {2}")
    @CsvSource({
            "0,    1,   0",
            "1,    2,   0.5",
            "4,  2, 2.0",
            "5,  0, 0"
    })
    public void severalDivisions(Long first, Long second, Double expectedResult) {
        assertEquals(expectedResult, basicCalculator.divide((double)first, (double)second),
                first + " / " + second + " should equal " + expectedResult);
    }
}
