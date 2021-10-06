package controles;

import facade.ServerRender;
import gui.DLGPartida;
import java.util.ArrayList;
import javax.swing.JLabel;
import objNegocios.Jugador;

public class ComenzarPartidaControlador {

    private ServerRender sr = ServerRender.getInstancia();

    public void  comenzarPartida(Jugador j) {
        sr.aprobacionPartida();
        ArrayList<Jugador> jugadores = sr.renderJugadores();
        jugadores.add(0, j);

        
         DLGPartida dlgPartida = new DLGPartida(null, true, jugadores);
        
    }
}
