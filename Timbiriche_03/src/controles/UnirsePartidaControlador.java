package controles;

import gui.DLGRegistro;
import java.util.ArrayList;
import objNegocios.Jugador;

public class UnirsePartidaControlador {

    public void unirsePartida(Jugador jugador) {
        ArrayList<Jugador> jugadores =new ArrayList<>();
        jugadores.add(0, jugador);

        DLGRegistro dlgRegistro = new DLGRegistro(null, true, jugadores);

    }

}
