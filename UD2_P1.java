package UD1;

import java.util.Scanner;

public class UD2_P1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  // Enunciado del programa
        System.out.println("******************************************");
        System.out.println("   CALCULADORA DE IMPUESTOS Y BONIFICACIONES");
        System.out.println("******************************************");
        System.out.println("Este programa calcula los impuestos anuales y posibles ayudas");
        System.out.println("en función de tu sueldo mensual bruto.");
        System.out.println("Reglas del cálculo:");
        System.out.println("1. Si tu sueldo anual supera 40,000 €, pagarás el 30% en impuestos.");
        System.out.println("2. Si tu sueldo anual está entre 10,000 € y 40,000 €, pagarás el 20% en impuestos.");
        System.out.println("3. Si tu sueldo anual es menor de 10,000 €, no pagarás impuestos.");
        System.out.println("4. Si tu sueldo anual es menor de 15,000 €, recibirás una ayuda de 1,500 €.");
        System.out.println("******************************************\n");

        // Crear el Scanner para la entrada de datos
        Scanner entrada = new Scanner(System.in);

        // Pedir al usuario su sueldo mensual bruto
        System.out.println("Introduce tu sueldo mensual bruto (en euros): ");
        double sueldoMensual = entrada.nextDouble();

        // Validar que el sueldo introducido es positivo
        if (sueldoMensual <= 0) {
            System.out.println("ERROR: El sueldo debe ser un número positivo.");
            return; // Finaliza el programa si el sueldo es inválido
        }

        // Calcular el sueldo anual
        double sueldoAnual = sueldoMensual * 12;

        // Inicializar variables para los impuestos y la ayuda
        double impuestos = 0.0;
        double ayuda = 0.0;

        // Calcular impuestos y ayudas según las reglas
        if (sueldoAnual > 40000) {
            impuestos = sueldoAnual * 0.30; // 30% de impuestos
        } else if (sueldoAnual >= 10000) {
            impuestos = sueldoAnual * 0.20; // 20% de impuestos
        }

        if (sueldoAnual < 15000) {
            ayuda = 1500; // Ayuda anual
        }

        // Mostrar los resultados
        System.out.println("\nResultados:");
        System.out.printf("Tu sueldo anual es de: %.2f €%n", sueldoAnual);
        System.out.printf("Te toca pagar: %.2f € en impuestos%n", impuestos);

        if (ayuda > 0) {
            System.out.printf("Recibes una ayuda de: %.2f €%n", ayuda);
        } else {
            System.out.println("No recibes ninguna ayuda.");
        }

        // Cerrar el Scanner
        entrada.close();
    }
}

