package co.edu.uniquindio.Archivo.Complebaja;

import java.util.Scanner;
/*
* Máximo común divisor (MCD):
* Implementa el algoritmo de Euclides de manera
* recursiva para calcular el MCD de dos números.
* */
public class mcd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el primer número que desea calcular el MCD: ");
        int n1 = sc.nextInt();
        System.out.print("Ingrese el segundo número que desea calcular el MCD: ");
        int n2 = sc.nextInt();
        sc.close();

        int numMayor = Math.max(n1, n2);
        int numMenor = Math.min(n1, n2);

        int resultado = calcularMcd(numMayor, numMenor);

        System.out.println("El MCD es: " + resultado);

    }
    public static int calcularMcd(int numMayor, int numMenor) {
        if (numMenor == 0) {
            return numMayor;
        } else {
            return calcularMcd(numMenor, numMayor % numMenor);
        }
    }
}
