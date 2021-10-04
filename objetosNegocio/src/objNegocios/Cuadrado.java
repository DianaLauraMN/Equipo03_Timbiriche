
package objNegocios;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.List;

public class Cuadrado extends CompositeFigura{

    public Cuadrado(List<Figura> lineas, int x, int y, int w, int h){
        super(lineas, x, y, w, h);
    }
    @Override
    public void pinta(Graphics g) {
        Graphics2D pintor = (Graphics2D) g;
        pintor.drawRect(x, y, w, h);
    }
    
}
