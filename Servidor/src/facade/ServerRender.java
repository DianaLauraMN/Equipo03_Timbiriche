
package facade;

import java.util.ArrayList;
import logica.Server;
import objNegocios.Jugador;


public class ServerRender {
    private static ServerRender sr=null;   
    private static Server server ;

    
    private ServerRender(){}
    public static ServerRender getInstancia(){
        if(sr==null){
            sr = new ServerRender();
            server = new Server();
        }
        return sr;
    }
    
    
    public ArrayList<Jugador> renderJugadores(){
         return server.jugadoresListos();
    } 
    
    public boolean aprobacionPartida(){
        return server.aprobacionPartida();
    }
}
