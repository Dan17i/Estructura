package co.edu.uniquindio.Archivo.Complebaja;

import java.util.Scanner;
/*
 * Cuenta regresiva: Crea una función recursiva que imprima una
 * cuenta regresiva desde un número dado hasta 0.
 *
 * */
public class CuentaRegresiva {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el número inicial : ");
        int num = sc.nextInt();
        sc.close();

        if (num < 0){
            System.out.println("EL número debe ser mayor que 0");
        }else{
            CuentaRegresiva(num);
        }
    }
    public static void CuentaRegresiva(int num){
        if (num == 0) {
            System.out.println("Termino la ejecución!!");
        } else{
            System.out.println(num);
            CuentaRegresiva(num-1);

        }
    }
}
