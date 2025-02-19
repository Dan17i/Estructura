package co.edu.uniquindio.Archivo.tallerentrega;

public class SumaDiagonal010 {
    public static void main(String[] args) {
        // Inicializa una matriz de ejemplo
        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 3}
        };

        // Llama al método recursivo para sumar los elementos de la diagonal principal
        int sumaDiagonal = SumaDiagonal(matriz, 0);

        // Imprime la suma de los elementos de la diagonal principal
        System.out.println("La suma de la diagonal Principal es: " + sumaDiagonal);
    }
    public static int SumaDiagonal(int[][] matriz, int indice) {
        // Caso base: si hemos procesado todas las filas, retornamos 0
        if (indice >= matriz.length) {
            return 0;
        }

        // Suma el elemento actual en la diagonal y llama recursivamente al siguiente elemento en la diagonal
        return matriz[indice][indice] + SumaDiagonal(matriz, indice + 1);
    }

}
