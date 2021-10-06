package controles;

import java.awt.Point;
import java.util.ArrayList;

public class EjercerTurnoControlador {

    public Point[] validaLinea(Point inicio, Point fin, Point[][] puntos) {
        boolean start = false, end = false;

        Point startPoint = null;
        Point endPoint = null;
        Point exacto[] = new Point[2];

        for (int i = 0; i < puntos.length; i++) {
            for (int j = 0; j < puntos[0].length; j++) {
                int x1 = (int) inicio.getX();
                int y1 = (int) inicio.getY();
                int x2 = (int) fin.getX();
                int y2 = (int) fin.getY();

                int xAux = (int) puntos[i][j].getX();
                int yAux = (int) puntos[i][j].getY();
                if (start == false) {
                    if ((x1 < xAux + 5) && (x1 > xAux - 5)) {
                        if ((y1 < yAux + 5) && (y1 > yAux - 5)) {
                            startPoint = new Point(xAux, yAux);
                            start = true;
                            System.out.println("Encoontrado 1 [" + xAux + ", " + yAux + "]");
                        }
                    }
                }
                if (end == false) {
                    if ((x2 < xAux + 5) && (x2 > xAux - 5)) {
                        if ((y2 < yAux + 5) && (y2 > yAux - 5)) {
                            endPoint = new Point(xAux, yAux);
                            end = true;
                            System.out.println("Encontrado 2[" + xAux + ", " + yAux + "]");
                        }
                    }
                }
                if (start && end) {
                    break;
                }

            }

            if (start && end) {
                break;
            }
        }

        if (startPoint != null && endPoint != null) {
            int x1 = (int) startPoint.getX();
            int y1 = (int) startPoint.getY();
            int x2 = (int) endPoint.getX();
            int y2 = (int) endPoint.getY();
            if ((x1 != x2) && (y1 != y2)) {
                startPoint = null;
                endPoint = null;
                System.out.println("Diagonal");
            }
        }

        exacto[0] = startPoint;
        exacto[1] = endPoint;

        return exacto;
    }
}
