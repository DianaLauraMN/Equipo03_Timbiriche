package objNegocios;

import java.awt.Graphics;
import java.util.List;

public abstract class CompositeFigura extends Figura {

    protected List<Figura> lineas;

    public CompositeFigura(List<Figura> lineas, int x, int y, int w, int h) {
        super(x, y, w, h);
        this.lineas = lineas;
    }

    @Override
    public abstract void pinta(Graphics g);

}
