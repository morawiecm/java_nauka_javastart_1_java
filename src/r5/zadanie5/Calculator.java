package r5.zadanie5;

public class Calculator {
    double num1;
    double num2;

    Calculator(double n1,double n2)
    {
        num1=n1;
        num2=n2;
    }

    double add()
    {
        return num1 + num2;
    }
    double subtrack()
    {
        return num1 - num2;
    }
    double multiply()
    {
        return num1 * num2;
    }
    double divide()
    {
        return num1 / num2;
    }
}
