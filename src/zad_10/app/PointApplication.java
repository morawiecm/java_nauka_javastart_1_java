package zad_10.app;

import zad_10.controler.PointControler;
import zad_10.data.Point;

public class PointApplication {
    public static void main(String[] args)
    {
        Point p1= new Point(10,20);
        PointControler pointControler = new PointControler();

        System.out.println("Punkt ("+p1.getxPosition()+","+p1.getyPosition()+")");
        pointControler.addX(p1);
        System.out.println("Punkt addX("+p1.getxPosition()+","+p1.getyPosition()+")");
        pointControler.minusX(p1);
        System.out.println("Punkt minusX("+p1.getxPosition()+","+p1.getyPosition()+")");
        pointControler.addY(p1);
        System.out.println("Punkt addY("+p1.getxPosition()+","+p1.getyPosition()+")");
        pointControler.minusY(p1);
        System.out.println("Punkt minusY("+p1.getxPosition()+","+p1.getyPosition()+")");
    }
}
