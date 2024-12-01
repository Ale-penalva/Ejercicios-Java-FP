package UD1;

import java.util.Scanner;

public class UD1_P4 {
    public static void main(String[] args) {
        // Enunciado del programa
        System.out.println("******************************");
        System.out.println("      MÁQUINA DE BEBIDAS      ");
        System.out.println("******************************");
        System.out.println("Instrucciones:");
        System.out.println("1. Introduce el precio de la bebida en céntimos (máximo 100 céntimos).");
        System.out.println("2. Introduce la cantidad de dinero que vas a insertar (máximo 100 céntimos).");
        System.out.println("3. El programa calculará el cambio y te mostrará la cantidad de monedas necesarias.");
        System.out.println("******************************\n");

        // Crear el objeto Scanner para entrada de datos
        Scanner entrada = new Scanner(System.in);

        // Solicitar el precio de la bebida
        System.out.print("Introduce el precio de la bebida (en céntimos): ");
        int precio = entrada.nextInt();

        // Solicitar la cantidad de dinero introducido
        System.out.print("¿Cuánto dinero vas a introducir? (en céntimos, máximo 100): ");
        int dinero = entrada.nextInt();

        // Calcular el cambio a devolver
        int cambio = dinero - precio;

        // Mostrar el cambio total
        System.out.println("\nTu cambio es: " + cambio + " céntimos");

        // Calcular el número de monedas necesarias para cada denominación
        int moneda50 = cambio / 50;
        cambio = cambio % 50;

        int moneda20 = cambio / 20;
        cambio = cambio % 20;

        int moneda10 = cambio / 10;
        cambio = cambio % 10;

        int moneda5 = cambio / 5;
        cambio = cambio % 5;

        int moneda2 = cambio / 2;
        cambio = cambio % 2;

        int moneda1 = cambio;

        // Mostrar el desglose del cambio en monedas
        System.out.println("Tu cambio desglosado es el siguiente:");
        System.out.println("Monedas de 50 céntimos: " + moneda50);
        System.out.println("Monedas de 20 céntimos: " + moneda20);
        System.out.println("Monedas de 10 céntimos: " + moneda10);
        System.out.println("Monedas de 5 céntimos: " + moneda5);
        System.out.println("Monedas de 2 céntimos: " + moneda2);
        System.out.println("Monedas de 1 céntimo: " + moneda1);

        // Cerrar el Scanner
        entrada.close();
    }
}
