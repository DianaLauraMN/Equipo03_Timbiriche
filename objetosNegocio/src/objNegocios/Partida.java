package objNegocios;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author chris
 */
public class Partida {
    
    private Tablero tablero;
    private Boolean estadoPartida;
    private List<Jugador> jugadore;
    
    public Partida(){
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
    
    
    
    
}
