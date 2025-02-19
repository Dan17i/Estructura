package co.edu.uniquindio.Archivo.tallerentrega;

import java.util.ArrayList;
import java.util.List;

public class InvertirLista04 {
    public static void main(String[] args) {

        List<Integer> numeros = new ArrayList<Integer>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);
        numeros.add(6);
        System.out.println("Esta es la lista ordenada: " + numeros);
        invertirLista(numeros, 0);
        System.out.println("Lista invertida: " + numeros);
    }

    // Función recursiva para invertir la lista
    public static void invertirLista(List<Integer> numeros, int pos) {

        // Caso base
        if (pos >= numeros.size() / 2) {
            return;
        }
        // Intercambiamos los elementos en las posiciones 'index' y 'size - 1 - index'
        int temp = numeros.get(pos);
        numeros.set(pos, numeros.get(numeros.size() - 1 - pos));
        numeros.set(numeros.size() - 1 - pos, temp);

        // Llamamos recursivamente para los siguientes elementos
        invertirLista(numeros, pos +1);
    }
}


