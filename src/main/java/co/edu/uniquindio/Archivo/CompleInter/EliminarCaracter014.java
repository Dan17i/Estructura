package co.edu.uniquindio.Archivo.CompleInter;

import java.util.Scanner;

public class EliminarCaracter014 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el valor de la caracter: ");
        String caracter = sc.nextLine();
        System.out.print("caracter que desea borrar: ");
        String borrar = sc.nextLine();
        sc.close();

        if (caracter.contains(borrar)){
            System.out.print(eliminarCaracter(caracter,borrar));
        }else{
            System.out.println("No se puede borrar el caracter");
        }

    }
    public static String eliminarCaracter(String caracter, String borrar) {

        if (caracter.length() == 0){
            return "";
        }

        char palabra = caracter.charAt(0);

         if(palabra == borrar.charAt(0)){
             return eliminarCaracter(caracter.substring(1),borrar);
         }
         else{
             return palabra+eliminarCaracter(caracter.substring(1), borrar);
         }
    }
}

