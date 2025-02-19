package co.edu.uniquindio.Archivo;

import java.util.ArrayList;
import java.util.List;

public class Permutaciones {

    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> resultado = new ArrayList<>();
        backtrack(resultado, new ArrayList<>(), nums);
        return resultado;
    }

    private static void backtrack(List<List<Integer>> resultado, List<Integer> permutacionActual, int[] nums) {
        // Si la permutación actual tiene la misma longitud que nums, la añadimos al resultado
        if (permutacionActual.size() == nums.length) {
            resultado.add(new ArrayList<>(permutacionActual));
            return;
        }


        // Recorremos todos los números en nums
        for (int i = 0; i < nums.length; i++) {
        // Si el número ya está en la permutación actual, lo saltamos
        if (permutacionActual.contains(nums[i])) {
            continue;
        }
        // Añadimos el número a la permutación actual
        permutacionActual.add(nums[i]);
        // Llamamos recursivamente para continuar construyendo la permutación
        backtrack(resultado, permutacionActual, nums);
        // Eliminamos el último número añadido para probar otras opciones (backtracking)
        permutacionActual.remove(permutacionActual.size() - 1);
    }
 }
}
