package co.edu.uniquindio.Archivo.tallerentrega;

import java.util.ArrayList;
import java.util.List;

public class ListaPar05 {
    public static List<Integer> obtenerParesRecursivo(List<Integer> listaOriginal, int pos) {
        // Caso base: cuando llegas al final de la lista original
        if (pos >= listaOriginal.size()) {
            return new ArrayList<>(); // Retorna una nueva lista vacía
        }

        // Llama recursivamente con el siguiente índice
        List<Integer> listaPares = obtenerParesRecursivo(listaOriginal, pos + 1);

        // Verifica si el elemento actual es par
        int elemento = listaOriginal.get(pos);
        if (elemento % 2 == 0) {
            listaPares.add(0, elemento); // Añade el elemento al inicio de la lista de pares
        }

        return listaPares;
    }

    public static void main(String[] args) {
        List<Integer> listaOriginal = new ArrayList<>();
        listaOriginal.add(1);
        listaOriginal.add(2);
        listaOriginal.add(3);
        listaOriginal.add(4);
        listaOriginal.add(5);

        List<Integer> listaPares = obtenerParesRecursivo(listaOriginal, 0);

        // Imprime la nueva lista con solo números pares
        System.out.println("Lista de números pares: " + listaPares);
    }
}
