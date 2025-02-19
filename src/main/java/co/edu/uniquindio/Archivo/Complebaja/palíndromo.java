package co.edu.uniquindio.Archivo.Complebaja;

import java.util.Scanner;

public class palíndromo {
/*
* Verificar si una palabra es un palíndromo
* Implementar una función recursiva que determine si una palabra se lee igual de izquierda a derecha y de derecha a izquierda.
* Ejemplo: "reconocer" → True, "perro" → False
*
* */
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.print("Ingrese la palabra : ");
     String palabra = sc.nextLine();
     sc.close();

     String palabrainvertida=  inversionCadena(palabra);

     if(verificarPal(palabra,palabrainvertida)) {
         System.out.println("la palabra si es  polindroma : " + palabrainvertida);
     }else{
         System.out.println( " La palabra no es polindroma " + palabra);
     }
    }
    public static String inversionCadena(String palabra) {
        if (palabra.length() <= 1) {
            return palabra;
        } else {
            return palabra.charAt(palabra.length() - 1) + inversionCadena(palabra.substring(0, palabra.length() - 1));
        }
    }
    public static boolean verificarPal(String palabra, String palabraInvertida) {
        return palabra.equals(palabraInvertida);
    }

}
