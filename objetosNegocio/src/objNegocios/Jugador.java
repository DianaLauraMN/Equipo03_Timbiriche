package objNegocios;

import java.awt.Color;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author chris
 */
public class Jugador implements Serializable{

    private int id;
    private String nombre;
    private Color color;
    private List figuras;
    private int puntaje;
    private List<Configuracion> configuraciones;
    private String ip;

    public Jugador() {
        this.figuras = new ArrayList<>();
        this.configuraciones = new ArrayList<>();
    }

    public Jugador(String nombre, Color color, int puntaje) {
        this.nombre = nombre;
        this.color = color;
        this.puntaje = puntaje;
        this.figuras = new ArrayList<>();
        this.configuraciones = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public List getFiguras() {
        return figuras;
    }

    public void setFiguras(List figuras) {
        this.figuras = figuras;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }

    public List<Configuracion> getConfiguraciones() {
        return configuraciones;
    }

    public void setConfiguraciones(List<Configuracion> configuraciones) {
        this.configuraciones = configuraciones;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }
    
    
    
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + this.id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Jugador other = (Jugador) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }
}
