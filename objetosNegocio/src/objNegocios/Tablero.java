package objNegocios;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author chris
 */
public class Tablero {
    private List lineas ;
    private List cuadrados;
    
    public Tablero(){
        this.lineas = new ArrayList<>();
        this.cuadrados = new ArrayList<>();
    }

    public Tablero(List lineas, List cuadrados) {
        this.lineas = lineas;
        this.cuadrados = cuadrados;
    }

    public List getLineas() {
        return lineas;
    }

    public void setLineas(List lineas) {
        this.lineas = lineas;
    }

    public List getCuadrados() {
        return cuadrados;
    }

    public void setCuadrados(List cuadrados) {
        this.cuadrados = cuadrados;
    }
    
    
    
    
}
