public class Q18_UnitConverter3 {

    public static double convertFahrenheitToCelsius(double fahrenheit) {
        double fahrenheit2celsius = (fahrenheit - 32) * 5 / 9;
        return fahrenheit2celsius;
    }

    public static double convertCelsiusToFahrenheit(double celsius) {
        double celsius2fahrenheit = (celsius * 9 / 5) + 32;
        return celsius2fahrenheit;
    }

    public static double convertPoundsToKilograms(double pounds) {
        double pounds2kilograms = 0.453592;
        return pounds * pounds2kilograms;
    }

    public static double convertKilogramsToPounds(double kilograms) {
        double kilograms2pounds = 2.20462;
        return kilograms * kilograms2pounds;
    }

    public static double convertGallonsToLiters(double gallons) {
        double gallons2liters = 3.78541;
        return gallons * gallons2liters;
    }

    public static double convertLitersToGallons(double liters) {
        double liters2gallons = 0.264172;
        return liters * liters2gallons;
    }

    public static void main(String[] args) {
        System.out.println("32°F is " + convertFahrenheitToCelsius(32) + "°C.");
        System.out.println("0°C is " + convertCelsiusToFahrenheit(0) + "°F.");
        System.out.println("100 pounds is " + convertPoundsToKilograms(100) + " kilograms.");
        System.out.println("45 kilograms is " + convertKilogramsToPounds(45) + " pounds.");
        System.out.println("10 gallons is " + convertGallonsToLiters(10) + " liters.");
        System.out.println("50 liters is " + convertLitersToGallons(50) + " gallons.");
    }
}
