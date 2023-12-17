package com.calculadoraimc;

import java.util.Scanner;

public class CalculadoraIMC {

    public static void main(String[] args) {
        // Crear un objeto Scanner para la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese su peso en kilogramos
        System.out.print("Ingrese su peso en kilogramos: ");
        double peso = scanner.nextDouble();

        // Pedir al usuario que ingrese su altura en metros
        System.out.print("Ingrese su altura en metros: ");
        double altura = scanner.nextDouble();

        // Validar que el peso y la altura sean valores positivos
        if (peso <= 0 || altura <= 0) {
            System.out.println("Por favor, ingrese valores válidos para peso y altura.");
            // Salir del programa si los valores no son válidos
            System.exit(0);
        }

        // Calcular el IMC (Índice de Masa Corporal)
        double imc = peso / (altura * altura);

        // Mostrar el resultado del IMC con dos decimales
        System.out.printf("Su IMC es: %.2f\n", imc);

        // Interpretar el resultado del IMC
        if (imc < 18.5) {
            System.out.println("Bajo peso");
        } else if (imc < 25) {
            System.out.println("Normal");
        } else if (imc < 30) {
            System.out.println("Sobrepeso");
        } else {
            System.out.println("Obeso");
        }

        // Cerrar el objeto Scanner
        scanner.close();
    }
}
