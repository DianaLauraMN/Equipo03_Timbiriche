package logica;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import objNegocios.Configuracion;
import objNegocios.Jugador;

public class Server {

    public ArrayList<Jugador> jugadoresListos() {
        ArrayList<Jugador> jugadores = new ArrayList<>();
        Jugador jugador1 = new Jugador("Messi", Color.cyan, 0);
        Jugador jugador2 = new Jugador("Killua", Color.GREEN, 0);

        Configuracion c1 = new Configuracion(Color.cyan, jugador1);
        Configuracion c2 = new Configuracion(Color.GREEN, jugador2);
        ArrayList<Configuracion> configuraciones = new ArrayList<>();
        configuraciones.add(c1);
        configuraciones.add(c2);

        jugador1.setConfiguraciones(configuraciones);
        jugador2.setConfiguraciones(configuraciones);

        jugadores.add(jugador1);
        jugadores.add(jugador2);

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        return jugadores;

    }

    public boolean aprobacionPartida(JLabel lb1, JLabel lb2) {
        try {
            if (lb1 != null) {
                Thread.sleep(2000);
                lb1.setIcon(new ImageIcon("src/img/CartaJugador-acepto.png"));
            }
            if (lb2 != null) {
                Thread.sleep(2000);
                lb2.setIcon(new ImageIcon("src/img/CartaJugador-acepto.png"));
            }

        } catch (InterruptedException e) {
            System.out.println(e);
        }
        return true;
    }

}
