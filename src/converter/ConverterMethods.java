package converter;

public class ConverterMethods {

	// This method converts kilograms to pounds
	public double kilograms2Pounds(double kilograms) {

		return kilograms * 2.205;

	}

	// This method converts pounds to kilograms
	public double pounds2Kilograms(double pounds) {

		return pounds / 2.205;

	}

	// This method converts centimeters to inches
	public double centimeters2inches(double centimeters) {

		return centimeters / 2.54;

	}

	// This method convert inches to centimeters
	public double inches2centimeters(double inches) {

		return inches * 2.54;

	}

	// This method convert Celsius to Fahrenheit
	public double Celsius2Fahrenheit(double Celsius) {

		return (Celsius * 9 / 5) + 32;

	}

	// This method convert Fahrenheit to Celsius
	public double Fahrenheit2Celsius(double Fahrenheit) {

		return (Fahrenheit - 32) * 5 / 9;

	}

}
