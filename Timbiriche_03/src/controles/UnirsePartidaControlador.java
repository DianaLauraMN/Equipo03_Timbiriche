package controles;

import facade.ServerRender;
import gui.DLGRegistro;
import java.util.ArrayList;
import objNegocios.Jugador;

public class UnirsePartidaControlador {

    private ServerRender sr = ServerRender.getInstancia();

    public void unirsePartida(Jugador jugador) {
        System.out.println(sr);
        ArrayList<Jugador> jugadores = sr.renderJugadores();
        jugadores.add(0, jugador);

        DLGRegistro dlgRegistro = new DLGRegistro(null, true, jugadores);

    }

}
