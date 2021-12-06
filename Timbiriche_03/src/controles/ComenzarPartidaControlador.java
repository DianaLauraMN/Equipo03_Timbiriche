package controles;

import gui.DLGPartida;
import java.util.ArrayList;
import javax.swing.JLabel;
import objNegocios.Jugador;

public class ComenzarPartidaControlador {

    public void comenzarPartida(ArrayList jugadores) {

        DLGPartida dlgPartida = new DLGPartida(null, true, jugadores);

    }
}
