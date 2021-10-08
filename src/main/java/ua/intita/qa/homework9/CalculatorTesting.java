package ua.intita.qa.homework9;

import org.apache.maven.archetype.Calculator;

public class CalculatorTesting {
    public static void main(String[] args) {
        Calculator calculator = new Calculator ();

        int res1 = calculator.sum(5, 10);
        int res2 = calculator.division(20, 8);
    }
}