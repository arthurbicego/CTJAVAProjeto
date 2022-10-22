package Projeto;

import java.util.Arrays;
import java.util.Scanner;

public class ConversorTemperatura {

    public static void main(String[] args) {
        int numeroConversoes;
        boolean continuarPrograma = true;
        String decisaoContinuarPrograma;

        while (continuarPrograma) {
            Scanner entrada = new Scanner(System.in);
            System.out.println("Digite a quantidade de temperaturas a serem transformadas: ");
            numeroConversoes = entrada.nextInt();

            String[] unidadesOrigem = new String[numeroConversoes];
            String[] unidadesFinal = new String[numeroConversoes];
            double[] temperaturasOrigem = new double[numeroConversoes];
            double[] temperaturasFinal = new double[numeroConversoes];
            double mediaOrigem = 0;
            double mediaFinal = 0;

            for (int i = 0; i < numeroConversoes; i++) {

                System.out.println("Conversão " + (i + 1) + ": insira a unidade de origem da temperatura \n(C) - Celsius\n(F) - Fahrenheit\n(K) - Kelvin");
                Scanner entradaUnidadesOrigem = new Scanner(System.in);
                unidadesOrigem[i] = entradaUnidadesOrigem.nextLine();

                System.out.println("Conversão " + (i + 1) + ": insira a unidade para a qual deseja converter \n(C) - Celsius\n(F) - Fahrenheit\n(K) - Kelvin");
                Scanner entradaUnidadesConvertidas = new Scanner(System.in);
                unidadesFinal[i] = entradaUnidadesConvertidas.nextLine();

                System.out.println("Conversão " + (i + 1) + ": digite a temperatura de origem ");
                temperaturasOrigem[i] = entrada.nextDouble();

                // Celsius:
                if (unidadesOrigem[i].equalsIgnoreCase("C")) {
                    if (unidadesFinal[i].equalsIgnoreCase("C")) {
                        temperaturasFinal[i] = MetodosConversao.celsiusParaCelsius(temperaturasOrigem[i]);
                        String fraseResultado = "Conversão " + (i + 1) + ": a temperatura de origem foi " + temperaturasOrigem[i] + "º" + unidadesOrigem[i] +
                                ". Que, convertendo, equivale a " + temperaturasFinal[i] + "º" + unidadesFinal[i] + ".\n";
                        System.out.println(fraseResultado);
                    }
                    if (unidadesFinal[i].equalsIgnoreCase("F")) {
                        temperaturasFinal[i] = MetodosConversao.celsiusParaFahrehnheit(temperaturasOrigem[i]);
                        String fraseResultado = "Conversão " + (i + 1) + ": a temperatura de origem foi " + temperaturasOrigem[i] + "º" + unidadesOrigem[i] +
                                ". Que, convertendo, equivale a " + temperaturasFinal[i] + "º" + unidadesFinal[i] + ".\n";
                        System.out.println(fraseResultado);
                    }
                    if (unidadesFinal[i].equalsIgnoreCase("K")) {
                        temperaturasFinal[i] = MetodosConversao.celsiusParaKelvin(temperaturasOrigem[i]);
                        String fraseResultado = "Conversão " + (i + 1) + ": a temperatura de origem foi " + temperaturasOrigem[i] + "º" + unidadesOrigem[i] +
                                ". Que, convertendo, equivale a " + temperaturasFinal[i] + "º" + unidadesFinal[i] + ".\n";
                        System.out.println(fraseResultado);
                    }
                    // Fahrenheit:
                } else if (unidadesOrigem[i].equalsIgnoreCase("F")) {

                    if (unidadesFinal[i].equalsIgnoreCase("C")) {
                        temperaturasFinal[i] = MetodosConversao.fahrenheitParaCelsius(temperaturasOrigem[i]);
                        String fraseResultado = "Conversão " + (i + 1) + ": a temperatura de origem foi " + temperaturasOrigem[i] + "º" + unidadesOrigem[i] +
                                ". Que, convertendo, equivale a " + temperaturasFinal[i] + "º" + unidadesFinal[i] + ".\n";
                        System.out.println(fraseResultado);
                    }
                    if (unidadesFinal[i].equalsIgnoreCase("F")) {
                        temperaturasFinal[i] = MetodosConversao.fahrenheitParaFahrenheit(temperaturasOrigem[i]);
                        String fraseResultado = "Conversão " + (i + 1) + ": a temperatura de origem foi " + temperaturasOrigem[i] + "º" + unidadesOrigem[i] +
                                ". Que, convertendo, equivale a " + temperaturasFinal[i] + "º" + unidadesFinal[i] + ".\n";
                        System.out.println(fraseResultado);
                    }
                    if (unidadesFinal[i].equalsIgnoreCase("K")) {
                        temperaturasFinal[i] = MetodosConversao.fahrenheitParaKelvin(temperaturasOrigem[i]);
                        String fraseResultado = "Conversão " + (i + 1) + ": a temperatura de origem foi " + temperaturasOrigem[i] + "º" + unidadesOrigem[i] +
                                ". Que, convertendo, equivale a " + temperaturasFinal[i] + "º" + unidadesFinal[i] + ".\n";
                        System.out.println(fraseResultado);
                    }
                    // Kelvin:
                } else if (unidadesOrigem[i].equalsIgnoreCase("K")) {

                    if (unidadesFinal[i].equalsIgnoreCase("C")) {
                        temperaturasFinal[i] = MetodosConversao.kelvinParaCelsius(temperaturasOrigem[i]);
                        String fraseResultado = "Conversão " + (i + 1) + ": a temperatura de origem foi " + temperaturasOrigem[i] + "º" + unidadesOrigem[i] +
                                ". Que, convertendo, equivale a " + temperaturasFinal[i] + "º" + unidadesFinal[i] + ".\n";
                        System.out.println(fraseResultado);
                    }
                    if (unidadesFinal[i].equalsIgnoreCase("F")) {
                        temperaturasFinal[i] = MetodosConversao.kelvinParaFahrenheit(temperaturasOrigem[i]);
                        String fraseResultado = "Conversão " + (i + 1) + ": a temperatura de origem foi " + temperaturasOrigem[i] + "º" + unidadesOrigem[i] +
                                ". Que, convertendo, equivale a " + temperaturasFinal[i] + "º" + unidadesFinal[i] + ".\n";
                        System.out.println(fraseResultado);
                    }
                    if (unidadesFinal[i].equalsIgnoreCase("K")) {
                        temperaturasFinal[i] = MetodosConversao.kelvinParaKelvin(temperaturasOrigem[i]);
                        String fraseResultado = "Conversão " + (i + 1) + ": a temperatura de origem foi " + temperaturasOrigem[i] + "º" + unidadesOrigem[i] +
                                ". Que, convertendo, equivale a " + temperaturasFinal[i] + "º" + unidadesFinal[i] + ".\n";
                        System.out.println(fraseResultado);
                    }
                }
            }
            for (int i = 0; i < numeroConversoes; i++) {
                mediaOrigem += temperaturasOrigem[i];
                mediaFinal += temperaturasFinal[i];
            }
            System.out.println("A média das temperaturas inicias é: " + mediaOrigem + ". A média das temperaturas finais é: " + mediaFinal + ".");

            System.out.println("Deseja converter novamente? (S/N)");
            Scanner entradaContinuarPrograma = new Scanner(System.in);
            decisaoContinuarPrograma = entradaContinuarPrograma.nextLine();

            if (!decisaoContinuarPrograma.equalsIgnoreCase("S")) {
                continuarPrograma = false;
                System.out.println("Programa finalizado. Obrigado!");
            }
        }

    }
}