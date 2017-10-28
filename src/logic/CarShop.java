package logic;

import data.Car;

public class CarShop {
    public static void main(String[] args)
    {
        Car audiA5 = new Car(2014, "Audi", "A5", "Czarny");
        System.out.println(audiA5.getBrand()+" "+audiA5.getModel()+" "+audiA5.getColor());
    }
}
