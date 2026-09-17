package test;

import modelo.CalculadoraModelo;

public class CalculadoraModeloTest {

    public static void main(String[] args) {
        CalculadoraModelo calc = new CalculadoraModelo();
        int pasadas = 0;
        int fallidas = 0;

        // Prueba 1: Suma básica
        if (calc.sumar(5, 3) == 8.0) {
            System.out.println("✅ PRUEBA SUMA: PASADA");
            pasadas++;
        } else {
            System.out.println("❌ PRUEBA SUMA: FALLIDA");
            fallidas++;
        }

        // Prueba 2: División por cero (Manejo de excepción)
        try {
            calc.dividir(10, 0);
            System.out.println("❌ PRUEBA DIVISIÓN CERO: FALLIDA");
            fallidas++;
        } catch (ArithmeticException e) {
            System.out.println("✅ PRUEBA DIVISIÓN CERO: PASADA");
            pasadas++;
        }

        System.out.println("\n--- RESUMEN DE PRUEBAS ---");
        System.out.println("Pasadas: " + pasadas + " | Fallidas: " + fallidas);
    }
}
