import java.util.Arrays;

public class BusquedaBinaria {

    public static int busquedaBinaria(int[] array, int elemento) {
        int inicio = 0;
        int fin = array.length - 1;

        while (inicio <= fin) {
            int medio = inicio + (fin - inicio) / 2;

            if (array[medio] == elemento) {
                return medio;
            }

            if (array[medio] < elemento) {
                inicio = medio + 1;
            } else {
                fin = medio - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] array = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};
        int elemento = 23;

        int indice = busquedaBinaria(array, elemento);

        if (indice != -1) {
            System.out.println("El elemento " + elemento + " se encuentra en el índice " + indice);
        } else {
            System.out.println("El elemento " + elemento + " no se encuentra en el array");
        }
    }
}
