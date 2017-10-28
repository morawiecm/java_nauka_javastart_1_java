package zad_10.controler;

import zad_10.data.Point;

public class PointControler {

    public void addX(Point p)
    {
        p.setxPosition(p.getxPosition()+1);
    }
    public void minusX(Point p)
    {
        p.setxPosition(p.getxPosition()-1);
    }
    public  void addY(Point p)
    {
        p.setyPosition(p.getyPosition()+1);
    }
    public void minusY(Point p)
    {
        p.setyPosition(p.getyPosition()-1);
    }

}
