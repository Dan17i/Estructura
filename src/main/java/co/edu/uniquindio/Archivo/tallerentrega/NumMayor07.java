package co.edu.uniquindio.Archivo.tallerentrega;

public class NumMayor07 {
    public static void main(String[] args) {
        int[] arreglo= {1,2,8,3,4,10,5};
        int Mayor= buscarMayor(arreglo, 0, arreglo.length-1);
        System.out.println("El numero mayor es: " +Mayor);
    }

    public static int buscarMayor(int [] arreglo, int inicio , int fin ){

        if( inicio==fin){   //Caso Base

            return arreglo[fin];
        }

        int PuntoMedio= (inicio + fin)/2; //Encuentra el punto medio del arreglo

        //Encuentra tanto el numero maximo del lado izquierdo como el del derecho
        int MayorInicio= buscarMayor(arreglo, inicio, PuntoMedio);
        int MayorFin= buscarMayor(arreglo, PuntoMedio+1, fin);

        //Regresa el mayor de los dos recorridos
        return Math.max(MayorInicio, MayorFin);
    }

}
