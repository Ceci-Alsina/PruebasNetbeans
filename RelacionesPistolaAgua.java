/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relacionespistolaagua;
import entidades.Juego;
import entidades.Jugador;
import entidades.Revolver;
import java.util.ArrayList;

/**
 *
 * @author cecal
 */
public class RelacionesPistolaAgua {

    public static void main(String[] args) {
        ArrayList<Jugador> jugadores = new ArrayList<>();
        jugadores.add(new Jugador(1));
        jugadores.add(new Jugador(2));
        jugadores.add(new Jugador(3));
        jugadores.add(new Jugador(4));
        jugadores.add(new Jugador(5));
        

        Revolver revolver = new Revolver();
        revolver.llenarRevolver();

        Juego juego = new Juego();
        juego.llenarJuego(jugadores, revolver);

        juego.ronda();
    }

}
