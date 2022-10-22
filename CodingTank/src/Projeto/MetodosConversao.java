package Projeto;

public class MetodosConversao {

    // Celsius:
    public static double celsiusParaFahrehnheit(double celsius) {
        final double FATOR_1 = (double) 9 / 5;
        final double FATOR_2 = 32;
        return ((celsius * FATOR_1) + FATOR_2);
    }

    public static double celsiusParaKelvin(double celsius) {
        return (celsius + 273.15);
    }

    public static double celsiusParaCelsius(double celsius) {
        return (celsius);
    }

    // Fahrenheit:
    public static double fahrenheitParaCelsius(double fahrenheit) {
        final double FATOR_1 = (double) 5 / 9;
        final double FATOR_2 = 32;
        return (FATOR_1 * (fahrenheit - FATOR_2));
    }

    public static double fahrenheitParaKelvin(double fahrenheit) {
        final double FATOR_1 = (double) 5 / 9;
        final double FATOR_2 = 32;
        return ((FATOR_1 * (fahrenheit - FATOR_2)) + 273.15);
    }

    public static double fahrenheitParaFahrenheit(double fahrenheit) {
        return (fahrenheit);
    }

    // Kelvin:
    public static double kelvinParaCelsius(double kelvin) {
        return (kelvin - 273.15);
    }
    public static double kelvinParaFahrenheit(double kelvin) {
        final double FATOR_1 = (double) 9 / 5;
        final double FATOR_2 = 32;
        return (FATOR_1 * (kelvin - 273.15) + FATOR_2);
    }
    public static double kelvinParaKelvin(double kelvin) {
        return (kelvin);
    }
}
