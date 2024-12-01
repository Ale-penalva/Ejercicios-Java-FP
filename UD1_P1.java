package UD1;

import java.util.Scanner;

public class UD1_P1 {

    public static void main(String[] args) {
        // Enunciado del programa
        System.out.println("******************************************");
        System.out.println("    CÁLCULOS GEOMÉTRICOS Y PITÁGORAS     ");
        System.out.println("******************************************");
        System.out.println("Este programa realiza los siguientes cálculos:");
        System.out.println("1. Calcula el área y el perímetro de un círculo a partir de su radio.");
        System.out.println("2. Calcula el área de un rectángulo a partir de su base y altura.");
        System.out.println("3. Calcula la hipotenusa de un triángulo rectángulo usando el Teorema de Pitágoras.");
        System.out.println("******************************************\n");

        // Crear el Scanner para la entrada de datos
        Scanner entrada = new Scanner(System.in);

        // Cálculo del círculo
        System.out.print("Dime el valor del radio de un círculo: ");
        double radio = entrada.nextDouble();
        double areaCirculo = Math.PI * Math.pow(radio, 2);
        double perimetroCirculo = Math.PI * 2 * radio;

        // Cálculo del rectángulo
        System.out.print("Ahora dime el valor de la base de un rectángulo: ");
        double base = entrada.nextDouble();
        System.out.print("No olvides decirme el valor de la altura del rectángulo: ");
        double altura = entrada.nextDouble();
        double areaRectangulo = base * altura;

        // Mostrar resultados del círculo y el rectángulo
        System.out.printf("De momento tenemos un círculo de perímetro %.2f y área %.2f, ", perimetroCirculo, areaCirculo);
        System.out.printf("y un rectángulo con área %.2f.%n", areaRectangulo);

        // Cálculo del Teorema de Pitágoras
        System.out.print("Me gusta el Teorema de Pitágoras, dime el valor del cateto 1: ");
        double cateto1 = entrada.nextDouble();
        System.out.print("Y ahora del cateto 2: ");
        double cateto2 = entrada.nextDouble();
        double hipotenusaCuadrado = Math.pow(cateto1, 2) + Math.pow(cateto2, 2); 
        double hipotenusa = Math.sqrt(hipotenusaCuadrado);                      
        System.out.printf("El valor de la hipotenusa al cuadrado es %.2f, ", hipotenusaCuadrado);
        System.out.printf("por lo tanto, la hipotenusa es %.2f.%n", hipotenusa);

        // Cerrar el Scanner
        entrada.close();
    }

}
