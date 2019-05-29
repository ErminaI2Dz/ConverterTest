package test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import converter.ConverterMethods;

public class ConverterMethodsTest {
	ConverterMethods converter;

	@Before
	public void setUp() {
		// arrange
		converter = new ConverterMethods();
	}

	@Test
	public void kilograms2PoundsTest() {
		// acting
		int result = (int) (converter.kilograms2Pounds(2));
		// assertion
		assertEquals(4, result);
	}

	@Test
	public void pounds2KilogramsTest() {

		int result = (int) converter.pounds2Kilograms(2);
		assertEquals(0, result);
	}

	@Test
	public void centimeters2inchesTest() {
		int result = (int) converter.centimeters2inches(3);
		assertEquals(1, result);

	}

	@Test
	public void inches2centimetersTest() {
		int result = (int) converter.inches2centimeters(4);
		assertEquals(10, result);
	}

	@Test
	public void Celsius2FahrenheitTest() {
		int result = (int) converter.Celsius2Fahrenheit(10);
		assertEquals(50, result);
	}

	@Test
	public void Fahrenheit2CelsiusTest() {
		int result = (int) converter.Fahrenheit2Celsius(50);
		assertEquals(10, result);
	}

}
