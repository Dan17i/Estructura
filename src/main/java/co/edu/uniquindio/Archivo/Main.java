package co.edu.uniquindio.Archivo;

import java.util.List;

import static co.edu.uniquindio.Archivo.Permutaciones.permute;
import static co.edu.uniquindio.Archivo.Matrushka.*;

public class Main {
    public static void main(String[] args) {

        int[] nums = {1, 2, 3};

        List<List<Integer>> permutaciones = permute(nums);

        // Imprimimos todas las permutaciones
        for (List<Integer> permutacion : permutaciones) {
            System.out.println(permutacion);
        }

        Matrushka matruhka = new Matrushka();

        int cant = 5;

        matruhka.ImprimirMatr(cant);


        System.out.println(suma(cant));

    }

    public static int suma ( int cant){
        if(cant == 0){
            return 0;
        }else{
            return cant+suma(cant-1);
        }

    }
}