package javaConfig;

public class Demo {
    public static void main(String[] args) {
        PlusService plusService = new PlusService();
        MinusService minusService = new MinusService();
        Calculator calculator = new Calculator(plusService, minusService);
        System.out.println(calculator.mathComparison(33, 7));
    }
}

