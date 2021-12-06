package server;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import objNegocios.Jugador;

public class ServerSocketConnect implements Runnable {

    private ServerSocket server;
    private List<Jugador> jugadores;

    public ServerSocketConnect() {
        jugadores = new ArrayList<>();
        Thread instancia = new Thread(this);
        instancia.start();
    }

    @Override
    public void run() {
        System.out.println("Servidor Iniciado");
        try {
            server = new ServerSocket(1000);
            while (true) {
                Socket cliente = server.accept();
                ObjectInputStream input = new ObjectInputStream(cliente.getInputStream());
                Object datos[] = (Object[]) input.readObject();
                Jugador jugador = (Jugador) datos[0];
                this.jugadores.add(jugador);
                informa((String) datos[1]);
                aceptarJugador(jugador);
                cliente.close();
            }
        } catch (Exception e) {
        }
    }

    public void informa(String opcion) {
        if (opcion.equalsIgnoreCase("Conectar")) {
            System.out.println("Acción: jugador: " + this.jugadores.get(this.jugadores.size() - 1).getNombre() + ": IP Address=" + this.jugadores.get(this.jugadores.size() - 1).getIp());
        }

    }

    public void aceptarJugador(Jugador jugador) {
        try {
            Socket socket = new Socket(jugador.getIp(), 2000);
            ObjectOutputStream output = new ObjectOutputStream(socket.getOutputStream());

            if (this.jugadores.size() <=4) {
                output.writeObject("Aceptado");
            } else {
                output.writeObject("Denegado");
            }
            socket.close();

        } catch (Exception e) {
        }
    }

}
