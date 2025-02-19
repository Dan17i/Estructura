package co.edu.uniquindio.Archivo.CompleInter;

import java.util.Scanner;

/*
*
* Producto de dos números usando sumas: Implementa la multiplicación de dos
* números enteros usando solo sumas y recursión.
* */
public class MultiPorSumas011 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el numero que desea multiplicar : ");
        int num = sc.nextInt();
        System.out.print("Ingrese la cantidad de veces que desea multiplicar : ");
        int cmul = sc.nextInt();
        sc.close();
        System.out.println("---------------------------------------------------------------------------------");
        System.out.println("El resultado de la suma successiva dicha cantidad de veces indicada es : "+MultiPorSuma(num,cmul ));
        System.out.println("---------------------------------------------------------------------------------");
    }
    public static int MultiPorSuma(int num, int cmul) {
        return (cmul == 0)?0:num +MultiPorSuma(num,cmul-1);
    }
}
