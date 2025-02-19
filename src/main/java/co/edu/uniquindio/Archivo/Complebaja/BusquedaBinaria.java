package co.edu.uniquindio.Archivo.Complebaja;

import java.util.Scanner;

public class BusquedaBinaria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; // Array ordenado

        System.out.print("Ingrese el número que desea buscar: ");
        int target = scanner.nextInt(); // Leer el número desde la consola

        int result = binarySearch(array, 0, array.length - 1, target);

        if (result == -1) {
            System.out.println("El dígito " + target + " no se encuentra en el array.");
        } else {
            System.out.println("El dígito " + target + " se encuentra en la posición: " + result);
        }

        scanner.close(); // Cerrar el scanner
    }

    // Función de búsqueda binaria utilizando recursividad
    static int binarySearch(int[] array, int left, int right, int target) {
        if (right >= left) {
            int mid = left + (right - left) / 2;

            if (array[mid] == target) {
                return mid; // Se encontró el elemento
            }

            if (array[mid] > target) {
                return binarySearch(array, left, mid - 1, target); // Buscar en la izquierda
            }

            return binarySearch(array, mid + 1, right, target); // Buscar en la derecha
        }

        return -1; // Elemento no encontrado
    }
}
