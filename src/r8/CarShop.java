package r8;

public class CarShop {
    public static void main(String[] args)
    {
        Car audiA5 = new Car(2014,"Audi","A5","czarne");
        Car audiA4 = new Car(2015,"Audi","A4");
        //w miedzyczasie klient wybiera kolor

        audiA4.color ="czerwone";

        System.out.println(audiA4.brand + " " + audiA4.model + " " + audiA4.year + " " + audiA4.color);
        System.out.println(audiA5.brand + " " + audiA5.model + " " + audiA5.year + " " + audiA5.color);
    }
}
