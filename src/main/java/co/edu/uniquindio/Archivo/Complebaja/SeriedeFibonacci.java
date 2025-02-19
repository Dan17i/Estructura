package co.edu.uniquindio.Archivo.Complebaja;

import java.util.Scanner;
/*
* Serie de Fibonacci
* Escriba una función recursiva que calcule el n-ésimo término de la serie de Fibonacci.
* Ejemplo: fibonacci(6) = 8
* Fórmula: F(n) = F(n-1) + F(n-2), con F(0) = 0 y F(1) = 1
* */
public class SeriedeFibonacci {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el numero: ");
        int num = sc.nextInt();

        if(num<0 ){
            System.out.print("el número debe de ser mayor que 0");
        }else {
            System.out.println("El resultado de la serie fibonacci es : " + SeriedeFibonacci(num));
        }

    }
    public static int SeriedeFibonacci(int num) {
         if (num == 0) return 0;
         if (num == 1) return 1;
         return SeriedeFibonacci(num - 1 ) + SeriedeFibonacci(num - 2);
    }
}
