package zad_10.data;

public class Point {
    private int xPosition;
    private int yPosition;

    public int getxPosition() {
        return xPosition;
    }

    public void setxPosition(int xPosition) {
        this.xPosition = xPosition;
    }

    public int getyPosition() {
        return yPosition;
    }

    public void setyPosition(int yPosition) {
        this.yPosition = yPosition;
    }
    public Point() {}
    public Point(int xPosition,int yPosition)
    {
        this.setxPosition(xPosition);
        this.setyPosition(yPosition);
    }
}
