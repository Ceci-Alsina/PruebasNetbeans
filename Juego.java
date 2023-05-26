/*Clase Juego: esta clase posee los siguientes atributos: Jugadores (conjunto de Jugadores) y
Revolver
Métodos:
• llenarJuego(ArrayList<Jugador>jugadores, Revolver r): este método recibe los jugadores
y el revolver para guardarlos en los atributos del juego.

10
• ronda(): cada ronda consiste en un jugador que se apunta con el revolver de agua y
aprieta el gatillo. Sí el revolver tira el agua el jugador se moja y se termina el juego, sino se
moja, se pasa al siguiente jugador hasta que uno se moje. Si o si alguien se tiene que
mojar. Al final del juego, se debe mostrar que jugador se mojó.
Pensar la lógica necesaria para realizar esto, usando los atributos de la clase Juego.
 */
package entidades;

import java.util.ArrayList;

/**
 *
 * @author cecal
 */
import java.util.ArrayList;

public class Juego {

    private ArrayList<Jugador> jugadores;
    private Revolver revolver;

    public void llenarJuego(ArrayList<Jugador> jugadores, Revolver revolver) {
        this.jugadores = jugadores;
        this.revolver = revolver;
    }

    public void ronda() {
        int jugadorActual = 0;
        boolean alguienSeMojo = false;

        do {
            Jugador jugador = jugadores.get(jugadorActual);
            boolean seMojó = jugador.disparo(revolver);
            System.out.println(jugador.toString());

            if (seMojó) {
                alguienSeMojo = true;
                break;
            }

            jugadorActual++; 

            if (jugadorActual >= jugadores.size()) {
                jugadorActual = 0;
            }
        } while (!alguienSeMojo);

        if (alguienSeMojo) {
            System.out.println("¡Alguien se mojó!" + "Es el jugador " +( jugadorActual+1));
        }
    }
}
