package co.edu.uniquindio.Archivo.Complebaja;

import java.util.Scanner;
/*
 * Número de dígitos: Escribe una función recursiva
 * que cuente la cantidad de dígitos en un número.
 *
 * */
public class NumeroDigitos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un numero entero: ");
        int numero = sc.nextInt();
        sc.close();


        System.out.println(contarDigitos(numero));
    }

    public static int contarDigitos(int n) {
        if (n<10){
            return 1;
        }else{
            return 1+contarDigitos(n/10);
        }
    }

}
