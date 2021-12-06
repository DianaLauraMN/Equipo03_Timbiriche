package objNegocios;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author chris
 */
public class Partida implements Serializable {

    private Tablero tablero;
    private Boolean estadoPartida;
    private List<Jugador> jugadore;
    private int turnoJugador;

    public Partida() {
        this.jugadore = new ArrayList<>();
    }

    public Partida(Tablero tablero, Boolean estadoPartida, List<Jugador> jugadore) {
        this.tablero = tablero;
        this.estadoPartida = estadoPartida;
        this.jugadore = jugadore;
    }

    public Tablero getTablero() {
        return tablero;
    }

    public void setTablero(Tablero tablero) {
        this.tablero = tablero;
    }

    public Boolean getEstadoPartida() {
        return estadoPartida;
    }

    public void setEstadoPartida(Boolean estadoPartida) {
        this.estadoPartida = estadoPartida;
    }

    public List<Jugador> getJugadore() {
        return jugadore;
    }

    public void setJugadore(List<Jugador> jugadore) {
        this.jugadore = jugadore;
    }

    public int getTurnoJugador() {
        return turnoJugador;
    }

    public void setTurnoJugador(int turnoJugador) {
        this.turnoJugador = turnoJugador;
    }

    @Override
    public String toString() {
        return "Partida{" + "tablero=" + tablero + ", estadoPartida=" + estadoPartida + ", jugadore=" + jugadore + ", turnoJugador=" + turnoJugador + '}';
    }

}
