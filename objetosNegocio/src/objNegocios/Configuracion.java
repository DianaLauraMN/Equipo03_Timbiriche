package objNegocios;

import java.awt.Color;

/**
 *
 * @author chris
 */
public class Configuracion {
    
    private Color color;
    private Jugador jugador;

    public Configuracion() {
    }

    public Configuracion(Color color, Jugador jugador) {
        this.color = color;
        this.jugador = jugador;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Jugador getJugador() {
        return jugador;
    }

    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }
}
