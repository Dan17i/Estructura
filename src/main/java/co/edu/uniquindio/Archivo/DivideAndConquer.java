package co.edu.uniquindio.Archivo;

    public class DivideAndConquer {

        public static void main(String[] args) {
            int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
            int sum = sumArray(array, 0, array.length - 1);

            System.out.println("La suma del array es: " + sum);
        }

        // Función que utiliza "divide y vencerás" para sumar elementos de un array
        static int sumArray(int[] array, int left, int right) {
            // Caso base: cuando solo hay un elemento en el array
            if (left == right) {
                return array[left];
            }

            // Encuentra el punto medio del array
            int mid = (left + right) / 2;

            // Divide el array en dos mitades y encuentra la suma de cada mitad
            int leftSum = sumArray(array, left, mid);
            int rightSum = sumArray(array, mid + 1, right);

            // Combina las sumas de las dos mitades
            return leftSum + rightSum;
        }
    }


