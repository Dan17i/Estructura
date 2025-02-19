package co.edu.uniquindio.Archivo.tallerentrega;

import java.util.Scanner;

public class Potencias011 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese el número base : ");
        int num = entrada.nextInt();
        System.out.print("Ingrese el exponente de dicha base : ");
        int exp = entrada.nextInt();
        entrada.close();

        if (num<0 && exp<0 ){
            System.out.println("Ambos números deben ser positivos");
        }else{
            System.out.println("El resultado de dicha potencia es: " + operacionpotencia(num, exp));
        }
    }
    public static int operacionpotencia(int num, int exp){
        if (exp==0){
            return 1;
        }else {
            return num*operacionpotencia(num,exp-1);
        }
    }
}
