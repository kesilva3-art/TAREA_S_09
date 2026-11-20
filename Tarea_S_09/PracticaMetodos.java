import java.util.Scanner;

public class PracticaMetodos {

    // Ejercicio 1
    static boolean esMultiplo(int a, int b) {
        if (b != 0 && a % b == 0) {
            return true;
        } else {
            return false;
        }
    }

    // Ejercicio 2
    static void imprimirTabla(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }

    // Ejercicio 3
    static double promedio3(double a, double b, double c) {
        double promedio = (a + b + c) / 3;
        return promedio;
    }

    // Ejercicio 4
    static double ivaIncluido(double precio) {
        double iva = precio * 0.15;
        double total = precio + iva;
        return total;
    }

    // Ejercicio 5
    static boolean esBisiesto(int anio) {
        if (anio % 400 == 0) {
            return true;
        } else if (anio % 4 == 0 && anio % 100 != 0) {
            return true;
        } else {
            return false;
        }
    }

    // Ejercicio 6
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int num1, num2;
        int numero;
        double nota1, nota2, nota3;
        double precio;
        int anio;

        System.out.println("PRACTICA DE METODOS");

        // Llamada al ejercicio 1
        System.out.print("Ingrese el primer numero: ");
        num1 = teclado.nextInt();

        System.out.print("Ingrese el segundo numero: ");
        num2 = teclado.nextInt();

        if (num2 != 0) {
            System.out.println("Es multiplo: " + esMultiplo(num1, num2));
        } else {
            System.out.println("No se puede comprobar con cero.");
        }

        // Llamada al ejercicio 2
        System.out.print("Ingrese un numero para la tabla: ");
        numero = teclado.nextInt();

        imprimirTabla(numero);

        // Llamada al ejercicio 3
        System.out.print("Ingrese la primera nota: ");
        nota1 = teclado.nextDouble();

        System.out.print("Ingrese la segunda nota: ");
        nota2 = teclado.nextDouble();

        System.out.print("Ingrese la tercera nota: ");
        nota3 = teclado.nextDouble();

        System.out.println("El promedio es: " +
                promedio3(nota1, nota2, nota3));

        // Llamada al ejercicio 4
        System.out.print("Ingrese el precio: ");
        precio = teclado.nextDouble();

        System.out.println("El precio con IVA es: " +
                ivaIncluido(precio));

        // Llamada al ejercicio 5
        System.out.print("Ingrese el anio: ");
        anio = teclado.nextInt();

        if (esBisiesto(anio)) {
            System.out.println("El anio es bisiesto.");
        } else {
            System.out.println("El anio no es bisiesto.");
        }

        teclado.close();
    }
}