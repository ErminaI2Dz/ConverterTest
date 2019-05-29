package converter;

import java.util.Scanner;

public class Converter {

	public static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		ConverterMethods converter = new ConverterMethods();

		int input;

		do {
			System.out.println("Choose!\n");
			System.out.println("1---->kilograms to pounds");
			System.out.println("2---->pounds to kilograms");
			System.out.println("3---->centimeters to inches");
			System.out.println("4---->inches to centimeters");
			System.out.println("5---->Celsius to Fahrenheit");
			System.out.println("6---->Fahrenheit to Celsius");
			System.out.println("7---->exit");

			input = Converter.input.nextInt();

			if (input == 1) {
				double kilograms, pounds;

				System.out.print("Input kilograms: ");
				kilograms = Converter.input.nextDouble();

				pounds = converter.kilograms2Pounds(kilograms);

				String answerKilogram = (kilograms == 1) ? " kilogram" : " kilograms";
				System.out.println(kilograms + answerKilogram + " = " + pounds + " funti.");

			} else if (input == 2) {
				double kilograms, pounds;

				System.out.print("Input pounds: ");
				pounds = Converter.input.nextDouble();

				kilograms = converter.pounds2Kilograms(pounds);

				String answerKilogram = (kilograms == 1) ? " kilogram" : " kilograms";
				System.out.println(pounds + " funti = " + kilograms + answerKilogram);

			} else if (input == 3) {
				double centimeters, inches;

				System.out.print("Input centimeters: ");
				centimeters = Converter.input.nextDouble();

				inches = converter.centimeters2inches(centimeters);

				String answerCentimeter = (centimeters == 1) ? " centimeter" : " centimeters";
				String answerInches = (inches == 1) ? " inch" : " inches";
				System.out.println(centimeters + answerCentimeter + " = " + inches + answerInches);

			} else if (input == 4) {
				double inches, centimeters;

				System.out.print("Unesite ince: ");
				inches = Converter.input.nextDouble();

				centimeters = converter.inches2centimeters(inches);

				String answerCentimeter = (centimeters == 1) ? " centimetar" : " centimetra";
				String answerInches = (inches == 1) ? " inc" : " inca";
				System.out.println(+inches + answerInches + " = " + centimeters + answerCentimeter);

			} else if (input == 5) {
				double Celsius, Fahrenheit;

				System.out.print("Unesite celzijuse: ");
				Celsius = Converter.input.nextDouble();

				Fahrenheit = converter.Celsius2Fahrenheit(Celsius);

				System.out.println(Celsius + " °C = " + Fahrenheit + " °F");

			} else if (input == 6) {
				double Celsius, Fahrenheit;

				System.out.print("Unesite farenhajte: ");
				Fahrenheit = Converter.input.nextDouble();

				Celsius = converter.Fahrenheit2Celsius(Fahrenheit);

				System.out.println(Fahrenheit + " °F = " + Celsius + " °C");

			} else if (input == 7) {
				break;
			} else {
				System.out.println("Incorrect input! Choose again!");

			}

			System.out.println("___________________________________________");
		} while (true);

		Converter.input.close();

	}

}
