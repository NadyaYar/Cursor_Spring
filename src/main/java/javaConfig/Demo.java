package javaConfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Demo {
    private static Calculator calculator;

    @Autowired
    public Demo(Calculator calculator) {
        Demo.calculator = calculator;
    }

    public static void main(String[] args) {
        System.out.println(calculator.mathComparison(23, 21));
    }
}

