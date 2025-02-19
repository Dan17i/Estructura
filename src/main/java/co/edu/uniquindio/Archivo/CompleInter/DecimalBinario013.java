package co.edu.uniquindio.Archivo.CompleInter;

import java.util.Scanner;

public class DecimalBinario013 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el número que desea convertir a binario : ");
        int n = sc.nextInt();
        sc.close();
        if (n <= 0) {
            System.out.println("El número debe de ser positivo ");
        }else {
            System.out.println(" el resultado es : "+conversionBinario(n));
        }
        }
        public static String conversionBinario(int n) {
            if (n == 0) {
                return "0";
            } else if (n == 1) {
                return "1";
            }else{
                return conversionBinario(n/2) + (n%2);
            }
        }
}
