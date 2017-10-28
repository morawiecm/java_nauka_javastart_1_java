import java.util.Random;

public class ZadanieOperacjeNaZmiennych {
    public static void main(String[] args)
    {
        Random rand = new Random();
        int number1=rand.nextInt(10); //liczba losowa z przedzialu [0,9]
        int number2= new Random().nextInt(10);
        System.out.println("x: "+number1+" y:" +number2);
        System.out.println("Czy x>y");
        System.out.println(number1>number2);
        System.out.println("Czy x*2 > y");
        System.out.println((number1*2)>number2);
        System.out.println("Czy x+3 < y");
        System.out.println((number1+3)<number2);
        System.out.println("Czy x*y=%2");
        System.out.println(((number1*number2)%2)==0);

    }
}
