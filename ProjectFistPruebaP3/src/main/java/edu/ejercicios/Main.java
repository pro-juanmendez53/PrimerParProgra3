package edu.ejercicios;

import edu.ejercicios.PrimerEjercicio.Tablero;
import edu.ejercicios.SegundoEjercicio.EstructuraDeMatriz;
import edu.ejercicios.TercerEjercicio.ListaEnlazada;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {



        //Ejercicio #1 Serie 2
        Tablero tableroJuego= new Tablero();
        tableroJuego.partidaInicio();

        //Ejercicio #2 Serie 2
        EstructuraDeMatriz matrizPrueba = new EstructuraDeMatriz();
        matrizPrueba.mostrarPosicionAdyacente(1,1);

        //Ejercicio #3 Serie 2
        ListaEnlazada miPrimeraLista = new ListaEnlazada();
        miPrimeraLista.insertarInicio(4);
        miPrimeraLista.insertarInicio(2);
        miPrimeraLista.insertarInicio(1);
        miPrimeraLista.insertarInicio(3);
//        miPrimeraLista.insertarInicio(0);
//        miPrimeraLista.ordenarBurbuja();
        miPrimeraLista.mostrar();
    }
}