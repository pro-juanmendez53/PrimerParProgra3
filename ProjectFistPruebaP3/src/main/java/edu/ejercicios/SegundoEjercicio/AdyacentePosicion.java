package edu.ejercicios.SegundoEjercicio;

public class AdyacentePosicion {
    public static void mostrarPosicionAdyacente( int filaPos, int columnaPos) {
        int filas =  3;
        int columnas = 3;

        if (filaPos > 0) {
            System.out.println("\n\nPosición arriba: " + (filaPos - 1) + "," + columnaPos);
        } //condicion que evalua si la posicion de la fila a buscar es mayor a 0 entonces significa que estamos en la fila de enmedio y nos mostrara la posicion que tenemos arriba

        if (filaPos < filas - 1) {
            System.out.println("Posición abajo: " + (filaPos + 1) + "," + columnaPos);
        } //evalua la fila ingresada y verifica si tenemos una posicion abajo de la posicion en la que nos encontramos

        if (columnaPos > 0) {
            System.out.println("Posición izquierda: " + filaPos + "," + (columnaPos - 1));
        } //evalua si la columna ingresasda tiene alguna posicion anterior

        if (columnaPos < columnas - 1) {
            System.out.println("Posición derecha: " + filaPos + "," + (columnaPos + 1));
        } //evalua si la columna ingresada tiene una posicion a la derecha de la posicion actual
        System.out.println("\n");
    }
}