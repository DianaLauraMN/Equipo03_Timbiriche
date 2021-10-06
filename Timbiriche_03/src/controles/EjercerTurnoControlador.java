package controles;

import java.awt.Point;
import java.util.ArrayList;

public class EjercerTurnoControlador {

    public boolean validaLinea(Point inicio, Point fin, ArrayList<Point> puntos) {
        int xL = 10;
        int xR = 700 - 20;
        int yT = 10;

        double distancia = Math.sqrt(Math.pow((xL - xR), 2) + Math.pow((yT - yT), 2));
        double dist = distancia / 20;

        int x1 = (int) inicio.getX();
        int y1 = (int) inicio.getY();
        int x2 = (int) fin.getX();
        int y2 = (int) fin.getY();

        System.out.println(x1 + "," + y1);
        System.out.println(x2 + "," + y2);

        if ((x2 > (x1 + dist + 2)) || x2 < (x1 - dist - 2)) {
            return false;
        }
        return true;
    }
}
