package r8.zadanie8;

public class CalcTest {
    public static void main(String[] args)
    {
        int a=5,b=4,c=1;
        Calculator calculator = new Calculator();
        System.out.println("dodawnie 2"+calculator.add(a,b));
        System.out.println("dodawnie 3"+calculator.add(a,b,c));
        System.out.println("odejmowanie 2"+calculator.subtract(a,b));
        System.out.println("odejmowanie 3"+calculator.subtract(a,b,c));
    }
}
