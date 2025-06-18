package conversionTemperaturaEjercicio;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class ConversionTemperaturaTest {

	    @ParameterizedTest
	    @CsvFileSource(resources = "/temperature_test_cases.csv", numLinesToSkip = 1)
	    void testConvertTemperature(double input, String fromUnit, String toUnit, double expected) {
	        ConversionTemperatura c = new ConversionTemperatura(); 
	        assertEquals(expected, c.convertTemperature(input, fromUnit, toUnit));
	    }
}
