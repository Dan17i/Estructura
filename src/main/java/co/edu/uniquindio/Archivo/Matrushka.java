package co.edu.uniquindio.Archivo;

public class Matrushka {
    // definimos cantidad de Matruzhkas
    int cant;
    // Metodo recursivo con parametro inicial
    public static void ImprimirMatr (int cant){
        System.out.println("Empezamos a abrir la Matruzhkas N° " + cant);
        if (cant == 0){
            System.out.println("-------------------------------------");
            System.out.println("ya termino de abrir las Matruzhkas");
            System.out.println("-------------------------------------");
        }else{
            ImprimirMatr(cant-1);
        }
        System.out.println("Cerrando Matruzhka N° "+ cant);
    }

}
