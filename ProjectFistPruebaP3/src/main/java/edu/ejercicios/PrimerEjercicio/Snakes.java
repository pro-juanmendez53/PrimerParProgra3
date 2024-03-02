package edu.ejercicios.PrimerEjercicio;

public class Snakes {
    private  static int [] casillaEspecialOrigen= {7,11,31,30,40,43,50,59}; //array que almacena las posiciones donde inicia una escalera o donde esta la cabeza de una serpiente
    private static int [] casillaEspecialDestino={38,37,46,2,21,60,5,42}; //array que almacena el desstion de origen de las posiciones del array de la linea anterior
    private static int longitudTablero= 64;
    int posicionAcutal=1;
    int winGame=64;
    int limiteDado=6;
    private int reinicioPor6= 0;
    int saveDado=0;
    boolean controladorPartida= false;  //Dato tipo boolean que nos servira para implementar en un bucle mas adelante

    public int lanzarDado(){   //METODO PARA LANZAR DADO (DA VALORES ENTRE 1 Y 6)
        return (int) (Math.random() * limiteDado) + 1;
    }
    public void verificarPosicion() {
        for (int i = 0; i < casillaEspecialOrigen.length; i++) {
            if (casillaEspecialOrigen[i] == posicionAcutal) {         //En este metodo lo que verigicamos es que si nuestra posicion se encuentra
                posicionAcutal= casillaEspecialDestino[i];            //en alguna casilla especial, entonces que nos mueva a esa casilla especial
                System.out.println("¡Oh! has caido en la casilla especial #" + casillaEspecialOrigen[i] + " Te mueves a la posicion: " + posicionAcutal);
                break;
            }
        }
    }

    public void partidaInicio()
    {
        int turnos=0;
        while (!controladorPartida)
        {
            turnos++;
            saveDado=lanzarDado();    //se hace un lanzamiento de dado y se almacena en la variable saveDado para psarle el valor a posicionActual

            if (saveDado == 6) {      //aca se hace la comprobacion si el dado lanzo un numero 6, y si lo hizo se incrementara la variable reinicioPor6
                reinicioPor6++;       //que es la que llevara el conteo si es que nos salen 3 #6 de forma consecutiva
                if (reinicioPor6 == 3) {
                    posicionAcutal = 0;     //En esta otra condicion es que si nos salieron 3 veces consecutivas el 6 pues que nos reinicie la posicion
                    System.out.println("¡Oh no! Has obtenido 3 seis consecutivos. Tu posición se reinicia a 0.");
                    reinicioPor6 = 0;
                }
            } else {
                reinicioPor6 = 0;
            }

            posicionAcutal= posicionAcutal +  saveDado;
            if (posicionAcutal < 64) {
                System.out.println("Tu posicion actual es: " + posicionAcutal);
            }
            else {
                System.out.println("Tu posicion actual es: 64");
            }

            verificarPosicion();
            if (posicionAcutal >= winGame){
                System.out.println("Has llegado a la posicion 64 asi que ganaste\n Te tomaste " + turnos + " turnos para terminar el juego");
                controladorPartida= true;
            }
        }
    }
}