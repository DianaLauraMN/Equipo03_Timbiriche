package objNegocios;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author chris
 */
public class Jugador {
    private int id;
    private String nombre;
    private Color color;
    private List figuras = new ArrayList<Figura>();
    private int puntaje;

    public Jugador() {
    }

    public Jugador(String nombre, Color color, int puntaje) {
        this.nombre = nombre;
        this.color = color;
        this.puntaje = puntaje;
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
