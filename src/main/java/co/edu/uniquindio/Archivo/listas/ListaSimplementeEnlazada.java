/**
 * Clase que representa una lista simplemente enlazada de enteros.
 * Permite realizar operaciones básicas como inserción, eliminación y búsqueda.
 */
public class ListaSimplementeEnlazada {

    /**
     * Clase interna estática que representa un nodo de la lista.
     */
    private static class Nodo {
        private int dato;       // Valor almacenado en el nodo
        private Nodo siguiente; // Referencia al siguiente nodo

        /**
         * Constructor para crear un nuevo nodo.
         * @param dato Valor a almacenar en el nodo.
         */
        public Nodo(int dato) {
            this.dato = dato;
            this.siguiente = null;
        }
    }

    private Nodo cabeza; // Primer nodo de la lista
    private int tamaño;  // Cantidad de elementos en la lista

    /**
     * Constructor para crear una lista vacía.
     */
    public ListaSimplementeEnlazada() {
        cabeza = null;
        tamaño = 0;
    }

    /**
     * Inserta un nuevo elemento al inicio de la lista.
     * @param dato Valor a insertar.
     */
    public void insertarAlInicio(int dato) {
        Nodo nuevoNodo = new Nodo(dato);
        nuevoNodo.siguiente = cabeza;
        cabeza = nuevoNodo;
        tamaño++;
    }

    /**
     * Inserta un nuevo elemento al final de la lista.
     * @param dato Valor a insertar.
     */
    public void insertarAlFinal(int dato) {
        Nodo nuevoNodo = new Nodo(dato);

        if (cabeza == null) {
            cabeza = nuevoNodo;
        } else {
            Nodo actual = cabeza;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevoNodo;
        }
        tamaño++;
    }

    /**
     * Inserta un nuevo elemento después de un nodo con valor específico.
     * @param clave Valor de referencia para la inserción.
     * @param dato Valor a insertar.
     */
    public void insertarDespuesDe(int clave, int dato) {
        Nodo actual = cabeza;

        while (actual != null) {
            if (actual.dato == clave) {
                Nodo nuevoNodo = new Nodo(dato);
                nuevoNodo.siguiente = actual.siguiente;
                actual.siguiente = nuevoNodo;
                tamaño++;
                return;
            }
            actual = actual.siguiente;
        }
        System.out.println("Clave no encontrada: " + clave);
    }

    /**
     * Elimina la primera ocurrencia de un valor en la lista.
     * @param clave Valor a eliminar.
     */
    public void eliminar(int clave) {
        if (cabeza == null) return;

        if (cabeza.dato == clave) {
            cabeza = cabeza.siguiente;
            tamaño--;
            return;
        }

        Nodo actual = cabeza;
        Nodo anterior = null;

        while (actual != null && actual.dato != clave) {
            anterior = actual;
            actual = actual.siguiente;
        }

        if (actual == null) {
            System.out.println("Clave no encontrada: " + clave);
            return;
        }

        anterior.siguiente = actual.siguiente;
        tamaño--;
    }

    /**
     * Busca un valor en la lista.
     * @param clave Valor a buscar.
     * @return true si se encuentra el valor, false en caso contrario.
     */
    public boolean buscar(int clave) {
        Nodo actual = cabeza;
        while (actual != null) {
            if (actual.dato == clave) return true;
            actual = actual.siguiente;
        }
        return false;
    }

    /**
     * Muestra los elementos de la lista.
     */
    public void mostrar() {
        Nodo actual = cabeza;
        StringBuilder sb = new StringBuilder();
        while (actual != null) {
            sb.append(actual.dato).append(" -> ");
            actual = actual.siguiente;
        }
        sb.append("null");
        System.out.println(sb.toString());
    }

    /**
     * @return Cantidad de elementos en la lista.
     */
    public int getTamaño() {
        return tamaño;
    }

    /**
     * @return true si la lista está vacía, false en caso contrario.
     */
    public boolean estaVacia() {
        return cabeza == null;
    }

    /**
     * Método principal para probar la funcionalidad de la lista.
     */
    public static void main(String[] args) {
        ListaSimplementeEnlazada lista = new ListaSimplementeEnlazada();

        // Insertar elementos
        lista.insertarAlFinal(1);
        lista.insertarAlFinal(2);
        lista.insertarAlFinal(3);
        lista.insertarAlInicio(0);
        lista.mostrar(); // 0 -> 1 -> 2 -> 3 -> null

        // Insertar después de un nodo
        lista.insertarDespuesDe(2, 5);
        lista.mostrar(); // 0 -> 1 -> 2 -> 5 -> 3 -> null

        // Eliminar elementos
        lista.eliminar(5);
        lista.eliminar(0);
        lista.mostrar(); // 1 -> 2 -> 3 -> null

        // Otras operaciones
        System.out.println("Tamaño: " + lista.getTamaño());       // 3
        System.out.println("¿Está vacía? " + lista.estaVacia());  // false
        System.out.println("¿Existe 3? " + lista.buscar(3));      // true
        System.out.println("¿Existe 5? " + lista.buscar(5));      // false
    }
}