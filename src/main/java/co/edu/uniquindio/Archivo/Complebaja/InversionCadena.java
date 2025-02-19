package co.edu.uniquindio.Archivo.Complebaja;

import java.util.Scanner;
/*
*
*
* */
public class InversionCadena {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la palabra : ");
        String palabra = sc.nextLine();
        sc.close();

        System.out.println("palabra invertida: ");
        inversionCadena(palabra);

    }
    public static void inversionCadena(String palabra) {
        if (palabra.length() <= 1) {
            System.out.print(palabra);
        } else {
            System.out.print(palabra.charAt(palabra.length() - 1));
            inversionCadena(palabra.substring(0, palabra.length() - 1));
        }
    }
}
