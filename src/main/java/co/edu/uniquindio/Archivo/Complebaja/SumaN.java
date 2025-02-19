package co.edu.uniquindio.Archivo.Complebaja;

import java.util.Scanner;

public class SumaN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa el número : ");
        int n = sc.nextInt();
        sc.close();

        if(n<0){
            System.out.println("el npumero debe de ser positivo");
        }else{
            System.out.print("las sumas sucesivas de ese número son : "+suma(n));
        }

    }
    public static int suma(int a) {

        return (a==0)?0:a+suma(a-1);
    }
}
