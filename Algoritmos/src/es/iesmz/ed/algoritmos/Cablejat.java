package es.iesmz.ed.algoritmos;

/**
 * Clase para verificar si un conjunto de cables se puede conectar
 *
 * @Author: Daniel Pantoja Cedeño
 * @Version: 1.0
 */
public class Cablejat {
    private final String[] WIRES;

    /**
     * Constructor de la clase Cablejat.
     *
     * @param wires Vector de cables.
     */
    public Cablejat(String[] wires) {
        this.WIRES = wires;
    }

    /**
     * Verifica si es posible conectar los cables cerrando un circuito.
     *
     * @return true si es posible cerrar un circuito con los cables USB,
     * false en caso contrario.
     */
    public boolean esPotConnectar() {
        if (WIRES.length == 0) {
            return false;
        }

        int monoTypeH = 0;
        int monoTypeM = 0;

        for (String wire : WIRES) {
            if (wire.equalsIgnoreCase("HH")) {
                monoTypeH++;
            } else if (wire.equalsIgnoreCase("MM")) {
                monoTypeM++;
            }
        }

        return monoTypeH != monoTypeM;
    }
}
