package UD1;

public class UD1_P2 {

    public static void main(String[] args) {
        // Enunciado del programa
        System.out.println("******************************************");
        System.out.println("   PROYECCIÓN DE POBLACIÓN EN EEUU        ");
        System.out.println("******************************************");
        System.out.println("Descripción:");
        System.out.println("Este programa calcula la proyección de la población en Estados Unidos");
        System.out.println("durante los próximos 5 años, basándose en los siguientes datos:");
        System.out.println(" - Cada 7 segundos nace una persona.");
        System.out.println(" - Cada 13 segundos fallece una persona.");
        System.out.println(" - Cada 45 segundos una persona emigra al país.");
        System.out.println("La población inicial es de 312,032,486 personas.");
        System.out.println("******************************************\n");

        // Constantes
        final int SEGUNDOS_ANUALES = 60 * 60 * 24 * 365;
        final int NACIMIENTO = 7; // Cada 7 segundos nace alguien
        final int MUERTE = 13;    // Cada 13 segundos muere alguien
        final int INMIGRACION = 45; // Cada 45 segundos alguien emigra
        int poblacionActual = 312032486; // Población inicial
        int añoActual = 2024;

        // Cálculo de cambios anuales
        long nacimientosAnuales = SEGUNDOS_ANUALES / NACIMIENTO;
        long muertesAnuales = SEGUNDOS_ANUALES / MUERTE;
        long inmigracionAnual = SEGUNDOS_ANUALES / INMIGRACION;
        long cambioAnual = nacimientosAnuales + inmigracionAnual - muertesAnuales;

        // Impresión de resultados
        System.out.println("PROYECCIÓN DE POBLACIÓN EN EEUU LOS PRÓXIMOS 5 AÑOS");
        System.out.println("---------------------------------");
        System.out.println("Año actual (" + añoActual + "): " + poblacionActual + " personas");

        for (int año = 1; año <= 5; año++) {
            poblacionActual += cambioAnual; 
            System.out.println("Año " + (añoActual + año) + ": " + poblacionActual + " personas");
        }
    }
}
