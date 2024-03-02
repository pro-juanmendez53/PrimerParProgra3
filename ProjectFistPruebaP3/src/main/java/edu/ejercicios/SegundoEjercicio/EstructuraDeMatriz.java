package edu.ejercicios.SegundoEjercicio;

public class EstructuraDeMatriz extends AdyacentePosicion {

    public static void main(String[] args) {
        int matrizTest[][] = new int[3][3];
        int cifras = 0;

        for (int f = 0; f < matrizTest.length; f++) {       //En este bucle for lo que estoy haciendo es rellenar la matriz creada anteriormetne
            for (int c = 0; c < matrizTest.length; c++) {   //con los numeros del 1 al 9 tal como el ejemplo de las instrucciones
                matrizTest[f][c] = cifras += 1;
            }
        }

//        for (int i = 0; i < matrizTest.length; i++) {
//            System.out.println("\n");
//            for (int j = 0; j < matrizTest.length; j++) {
//                System.out.print(matrizTest[i][j] + "\t");
//            }
//        }
    }
}