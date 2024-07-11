package com.aluracursos.conversordivisas;

import java.util.Scanner;

public class Menu {
    private Conversor converter;
    private Scanner scanner;

    public Menu(Conversor converter){
        this.converter = converter;
        scanner = new Scanner(System.in);
    }

    public void displayMenu(){
        boolean exit = false;
        while (!exit) {
            System.out.println("**** Conversor de Divisas ****");
            System.out.println("*******************************");
            System.out.println("1 Dólar --> Peso Mexicano ");
            System.out.println("2 Peso Mexicano --> Dólar ");
            System.out.println("3 Dólar --> Peso Argentino ");
            System.out.println("4 Peso Argentino --> Dólar ");
            System.out.println("5 Dólar --> Real Brasileño ");
            System.out.println("6 Real Brasileño --> Dólar ");
            System.out.println("7 Salir ");
            System.out.println("*******************************");
            System.out.println("Seleccione la opción que desee: ");

            int option = scanner.nextInt();

            switch (option){
                case 1:
                    System.out.println("Ingrese la cantidad en Dolares a convertir: ");
                    double amount5 = scanner.nextDouble();
                    double conversionRate5 = converter.getConversionRate("USD", "MXN");
                    System.out.println(amount5 + " USD = " + (amount5 * conversionRate5) + " MXN");
                    break;
                case 2:
                    System.out.println("Ingrese la cantidad en Pesos Mexicanos a convertir: ");
                    double amount6 = scanner.nextDouble();
                    double conversionRate6 = converter.getConversionRate("MXN", "USD");
                    System.out.println(amount6 + " MXN = " + (amount6 * conversionRate6) + " USD");
                    break;
                case 3:
                    System.out.println("Ingrese la cantidad en Dolares a convertir: ");
                    double amount1 = scanner.nextDouble();
                    double conversionRate1 = converter.getConversionRate("USD", "ARS");
                    System.out.println(amount1 + " USD = " + (amount1 * conversionRate1) + " ARS");
                    break;
                case 4:
                    System.out.println("Ingrese la cantidad en Pesos Argentinos a convertir: ");
                    double amount2 = scanner.nextDouble();
                    double conversionRate2 = converter.getConversionRate("ARS", "USD");
                    System.out.println(amount2 + " ARS = " + (amount2 * conversionRate2) + " USD");
                    break;
                case 5:
                    System.out.println("Ingrese la cantidad en Dolares a convertir: ");
                    double amount3 = scanner.nextDouble();
                    double conversionRate3 = converter.getConversionRate("USD", "BRL");
                    System.out.println(amount3 + " USD = " + (amount3 * conversionRate3) + " BRL");
                    break;
                case  6:
                    System.out.println("Ingrese la cantidad en Reales Brasileños a convertir: ");
                    double amount4 = scanner.nextDouble();
                    double conversionRate4 = converter.getConversionRate("BRL", "USD");
                    System.out.println(amount4 + " BRL = " + (amount4 * conversionRate4) + " USD");
                    break;
                case 7:
                    exit = true;
                    break;
                default:
                    System.out.println("Por favor, ingrese una opción valida");
            }
        }
        System.out.println("BYE");
    }

    public Conversor getConverter() {
        return converter;
    }

    public void setConverter(Conversor converter) {
        this.converter = converter;
    }
}

