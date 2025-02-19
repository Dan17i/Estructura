package co.edu.uniquindio.Archivo.tallerentrega;

import java.util.Scanner;

public class VectorRepeticiones03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size;
        // Validar que el tamaño del vector sea un número entero positivo
        do {
            System.out.print("Ingrese el tamaño del vector (positivo): ");
            while (!scanner.hasNextInt()) {
                System.out.println("Error: Ingrese un número válido.");
                scanner.next();  // Descarta la entrada incorrecta
            }
            size = scanner.nextInt();
            if (size <= 0) {
                System.out.println("Error: El tamaño debe ser mayor a 0.");
            }
        } while (size <= 0);

        // Crear el vector
        int[] vector = new int[size];

        // Pedir los datos para llenar el vector
        for (int i = 0; i < size; i++) {
            System.out.print("Ingrese el valor para la posición " + (i+1) + ": ");
            while (!scanner.hasNextInt()) {
                System.out.println("Error: Ingrese un número válido.");
                scanner.next();  // Descarta la entrada incorrecta
            }
            vector[i] = scanner.nextInt();
        }

        // Mostrar el vector
        System.out.println("El vector ingresado es:");
        for (int num : vector) {
            System.out.print(num + ",");
        }
        System.out.println();
        // Pedir el número a buscar
        System.out.print("Ingrese el número a contar: ");
        int num = scanner.nextInt();

        // Llamar a la función recursiva
        int repeticiones = contarRepeticiones(vector, num, 0);

        // Mostrar el resultado
        System.out.println("El número " + num + " aparece " + repeticiones + " veces en el vector.");

        // Cerrar el scanner
        scanner.close();


    }
    /**
     * Función recursiva para contar repeticiones de un número en un vector
     */
    public static int contarRepeticiones(int[] vector, int num, int inc) {
        // Caso base: Si llegamos al final del vector, retornamos 0
        if (inc == vector.length) {
            return 0;
        }

        // Caso recursivo: Si encontramos el número, sumamos 1 y avanzamos al siguiente índice
        if (vector[inc] == num) {
            return 1 + contarRepeticiones(vector, num, inc + 1);
        } else {
            return contarRepeticiones(vector, num, inc + 1);
        }
    }
}