package co.edu.uniquindio.Archivo;

import java.util.Scanner;
/*
*
* Suma de los primeros N números naturales
* Hacer una función recursiva que sume los primeros N números naturales.
* Ejemplo: suma(4) = 4 + 3 + 2 + 1 = 10
*
* */
public class SumaNprimeros {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el numero:");
        int num = sc.nextInt();

        if (num<0){
            System.out.println("el número debe de ser positivo");
        }else{
            System.out.print(" El resultado de la suma de sus primeros es : "+ sumaPrimeros(num));
        }
    }
    public static int sumaPrimeros(int num) {
      return (num==0 ||num == 1) ? 1: num+sumaPrimeros(num-1);
    }
}
