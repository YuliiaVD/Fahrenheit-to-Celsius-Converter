package app;

public class Main {

    public static void main(String[] args) {
        System.out.println("My Fahrenheit to Celsius app.");

        double fahr = 100;
        double cels = 38;
        double celsius = konvFahrToCel(fahr);
        double fahren = konvCelsToFahr(cels);

        System.out.println("Result is: " + celsius + "°C Celsius and " + fahren + "°F Fahrenheit");
    }

    public static double konvFahrToCel (double fahr) {
        return (5.0/9.0) * (fahr - 32);
    }

    public static double konvCelsToFahr (double cels) {
        return ((cels * 9)/5)+32;
    }
}
