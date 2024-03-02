package edu.ejercicios.TercerEjercicio;

public class ListaEnlazada {
    private Nodo head;
    public ListaEnlazada() {
        this.head = null;
    }
    public void insertarInicio(int valorDato) {
        Nodo newNodo = new Nodo(valorDato);
        if (head == null) {
            head = newNodo;
        } else {
            Nodo current = head;
            while (current.siguiente != null) {
                current = current.siguiente;
            }
            current.siguiente = newNodo;
        }
    }
    public void mostrar() {
        Nodo actualN = head;
        while (actualN != null) {
            System.out.print(actualN.valorDato + " ");
            actualN = actualN.siguiente;
        }
        System.out.println();
    }
    public void ordenarBurbuja() {
        if (head == null || head.siguiente == null) {
            return;
        }

        boolean ordenCambiado;
        do {
            ordenCambiado = false;
            Nodo tmpAnterior = null;
            Nodo tmpActual = head;
            Nodo tmpSiguiente = head.siguiente;

            while (tmpSiguiente != null) {
                if (tmpActual.valorDato > tmpSiguiente.valorDato) {
                    if (tmpAnterior == null) {
                        head = tmpSiguiente;
                    } else {
                        tmpAnterior.siguiente = tmpSiguiente;
                    }
                    tmpActual.siguiente = tmpSiguiente.siguiente;
                    tmpSiguiente.siguiente = tmpActual;
                    ordenCambiado = true;
                }
                tmpAnterior = tmpActual;
                tmpActual = tmpSiguiente;
                tmpSiguiente = tmpSiguiente.siguiente;
            }
        } while (ordenCambiado);
    }
}