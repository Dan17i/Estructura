package co.edu.uniquindio.Archivo.CompleInter;

import java.util.Scanner;

public class Padovan012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el número con el que desea iniciar la serie Padovan : ");
        int n = sc.nextInt();
        sc.close();

        if ( n <= 0 ){
            System.out.println("El número ingresado debe de ser positivo");
        }else{
            System.out.println("El resultado es : "+seriepadovan(n));
        }
    }

    public static int seriepadovan ( int n){
        if (n < 3){
            return 1;
        }else{
            return seriepadovan(n-2) + seriepadovan(n-3);
        }
    }
}
