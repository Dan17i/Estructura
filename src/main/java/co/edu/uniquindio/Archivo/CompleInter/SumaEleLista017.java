package co.edu.uniquindio.Archivo.CompleInter;

public class SumaEleLista017 {
    public static void main(String[] args) {

            int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
            int suma = sumaelementos(matrix, 0);
            System.out.println("La suma de los elementos de la matriz es: " + suma);

    }
    public static int sumaelementos(int[][] matrix, int pos) {
        // Caso base: si hemos procesado toda la matriz
        if (pos == matrix.length * matrix[0].length) {
            return 0;
        }

        // Calcular la fila y la columna actual basados en el índice lineal
        int fila = pos / matrix[0].length;
        int col = pos % matrix[0].length;

        // Sumar el elemento actual y continuar recursivamente
        return matrix[fila][col] + sumaelementos(matrix, pos + 1);
    }
}
