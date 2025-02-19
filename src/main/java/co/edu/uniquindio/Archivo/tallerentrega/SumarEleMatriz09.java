package co.edu.uniquindio.Archivo.tallerentrega;

public class SumarEleMatriz09 {

    public static void main(String[] args) {
        // Inicializa una matriz de ejemplo
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        // Llama al método recursivo para sumar los elementos de la matriz
        int suma = sumaMatrix(matrix, 0, 0);

        // Imprime la suma de los elementos de la matriz
        System.out.println("La suma de los elementos de la matriz es: " + suma);
    }
    public static int sumaMatrix(int[][] matrix, int fila, int col) {
        // Caso base: si hemos procesado todas las filas, retornamos 0
        if (fila == matrix.length) {
            return 0;
        }

        // Si hemos procesado todas las columnas de la fila actual, pasamos a la siguiente fila
        if (col == matrix[fila].length) {
            return sumaMatrix(matrix, fila + 1, 0);
        }

        // Suma el elemento actual y llama recursivamente al siguiente elemento
        return matrix[fila][col] + sumaMatrix(matrix, fila, col + 1);
    }
}
