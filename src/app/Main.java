package app;

public class Main {

    public static void main(String[] args) {
        System.out.println("My Fahrenheit to Celsius app.");

        double fahr = 100;
        double celsius = konvFahrToCel(fahr);

        System.out.println("Result is: " + celsius + "°C Celsius");
    }

    public static double konvFahrToCel (double fahr) {
        return (5.0/9.0) * (fahr - 32);
    }
}
