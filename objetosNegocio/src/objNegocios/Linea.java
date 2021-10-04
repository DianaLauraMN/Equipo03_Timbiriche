package objNegocios;

import java.awt.Graphics;
import java.awt.Graphics2D;

public class Linea extends Figura {

    public Linea() {
        super();
    }

    public Linea(int x, int y, int w, int h) {
        super(x, y, w, h);
    }

    @Override
    public void pinta(Graphics g) {
        Graphics2D pintor = (Graphics2D) g;
        pintor.drawLine(x, y , w, h);
    }

}
