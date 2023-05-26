/*Clase Revolver de agua: esta clase posee los siguientes atributos: posición actual (posición
del tambor que se dispara, puede que esté el agua o no) y posición agua (la posición del
tambor donde se encuentra el agua). Estas dos posiciones, se generarán aleatoriamente.
Métodos:
• llenarRevolver(): le pone los valores de posición actual y de posición del agua. Los valores
deben ser aleatorios.
• mojar(): devuelve true si la posición del agua coincide con la posición actual
• siguienteChorro(): cambia a la siguiente posición del tambor
• toString(): muestra información del revolver (posición actual y donde está el agua)
 */
package entidades;

import java.util.Random;

/**
 *
 * @author cecal
 */
import java.util.Random;

public class Revolver {
    private int posicionActual;
    private int posicionAgua;

    public Revolver() {
    }

    public void llenarRevolver() {
        Random random = new Random();
        posicionActual = random.nextInt(6) + 1;
        posicionAgua = random.nextInt(6) + 1;
    }

    public boolean mojar() {
        return posicionActual == posicionAgua;
    }

    public void siguienteChorro() {
        if (posicionActual == 6) {
            posicionActual = 1;
        } else {
            posicionActual++;
        }
    }

    @Override
    public String toString() {
        return "Revolver{" +
                "posicionActual=" + posicionActual +
                ", posicionAgua=" + posicionAgua +
                '}';
    }
}