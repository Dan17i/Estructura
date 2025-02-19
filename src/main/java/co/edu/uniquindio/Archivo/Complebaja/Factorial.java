package co.edu.uniquindio.Archivo.Complebaja;

import java.util.Scanner;
/*
* Factorial de un número
* Escriba una función recursiva que calcule el factorial de un número entero positivo.
* Ejemplo: factorial(5) = 5 * 4 * 3 * 2 * 1 = 120
* */
public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int n = sc.nextInt();
        if (n<0){
            System.out.println("El numero no puede ser negativo");
        }else{
            System.out.println(factorial(n));
        }
    }
    public static int factorial(int n) {
        return (n== 0 || n==1) ? 1: n*factorial(n-1);
    }
}
