package controles;

import facade.ServerRender;
import gui.DLGPartida;
import javax.swing.JLabel;

public class ComenzarPartidaControlador {

    private ServerRender sr = ServerRender.getInstancia();

    public boolean  comenzarPartida() {
        return sr.aprobacionPartida();
    }
}
