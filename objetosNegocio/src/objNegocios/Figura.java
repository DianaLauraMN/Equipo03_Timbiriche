package objNegocios;

import java.awt.Canvas;
import java.awt.Graphics;
import java.io.Serializable;

public abstract class Figura implements Serializable{

    protected int x;
    protected int y;
    protected int w;
    protected int h;

    public Figura() {

    }

    public Figura(int x, int y, int w, int h) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getW() {
        return w;
    }

    public void setW(int w) {
        this.w = w;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }

    public abstract void pinta(Graphics g);

}
