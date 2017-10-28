package r5.zadanie5;

public class Calculate {
    public static void main(String[] args)
    {
        double num1=5.0;
        double num2=2.0;

        Calculator calculator = new Calculator(num1,num2);
        System.out.println("a: "+num1+" b: "+num2);
        System.out.println("Dodawanie: "+calculator.add());
        System.out.println("Odejmowanie: "+calculator.subtrack());
        System.out.println("Mnozenie: "+calculator.multiply());
        System.out.println("Dzielenie: "+calculator.divide());
    }
}
